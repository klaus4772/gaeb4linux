package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.domain.GaebPosition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Writes modified unit prices (and recalculated total prices) back into an original GAEB XML
 * byte array. The export preserves the full original XML structure — only UP and TP text
 * nodes belonging to positions with changed prices are updated.
 */
@Service
public class GaebExportService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GaebExportService.class);

    private final GaebFormatConverter formatConverter;

    public GaebExportService(GaebFormatConverter formatConverter) {
        this.formatConverter = formatConverter;
    }

    /**
     * Returns a copy of {@code originalXml} with the unit price (UP) and total price (TP)
     * of each position updated to match the values currently held in {@code positions}.
     * Positions whose unit price is {@code null} are left unchanged in the XML.
     *
     * @param originalXml the raw bytes of the uploaded GAEB XML file
     * @param positions   the (possibly price-edited) positions from the in-memory model
     * @return a byte array containing the updated XML
     */
    public byte[] exportWithPrices(byte[] originalXml, List<GaebPosition> positions) {
        // Index by position number for O(1) lookup during DOM traversal
        Map<String, GaebPosition> byNumber = positions.stream()
                .filter(p -> p.getNumber() != null && p.getUnitPrice() != null)
                .collect(Collectors.toMap(
                        GaebPosition::getNumber,
                        p -> p,
                        (a, b) -> a   // keep first on duplicate keys
                ));

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new ByteArrayInputStream(originalXml));

            updatePricesInDom(doc.getDocumentElement(), new ArrayList<>(), byNumber);

            return serializeDocument(doc, originalXml);

        } catch (Exception e) {
            throw new RuntimeException("GAEB XML export failed", e);
        }
    }

    // -----------------------------------------------------------------------
    // DOM traversal
    // -----------------------------------------------------------------------

    private void updatePricesInDom(Node node, List<String> ancestorPath,
                                   Map<String, GaebPosition> byNumber) {
        if (node.getNodeType() != Node.ELEMENT_NODE) return;

        Element element = (Element) node;
        String rNoPart = element.getAttribute("RNoPart").trim();

        List<String> currentPath = ancestorPath;
        if (!rNoPart.isEmpty()) {
            currentPath = new ArrayList<>(ancestorPath);
            currentPath.add(rNoPart);

            String positionNumber = String.join(".", currentPath);
            GaebPosition pos = byNumber.get(positionNumber);
            if (pos != null) {
                setDirectChildText(element, "UP", pos.getUnitPrice().toPlainString());
                BigDecimal total = pos.getTotalPrice();
                if (total.compareTo(BigDecimal.ZERO) != 0) {
                    setDirectChildText(element, "TP", total.toPlainString());
                }
                LOGGER.debug("Updated prices for position {}: UP={} TP={}",
                        positionNumber, pos.getUnitPrice(), total);
            }
        }

        NodeList children = element.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            updatePricesInDom(children.item(i), currentPath, byNumber);
        }
    }

    /**
     * Finds a direct child element by local name and overwrites its text content.
     * Does nothing if no such child exists.
     */
    private void setDirectChildText(Element parent, String localName, String value) {
        NodeList children = parent.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() != Node.ELEMENT_NODE) continue;
            String name = child.getLocalName() != null ? child.getLocalName() : child.getNodeName();
            if (localName.equals(name)) {
                child.setTextContent(value);
                return;
            }
        }
    }

    // -----------------------------------------------------------------------
    // Serialisation
    // -----------------------------------------------------------------------

    private byte[] serializeDocument(Document doc, byte[] originalXml) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();

        // Detect encoding from original XML declaration; fall back to UTF-8
        String encoding = detectEncoding(originalXml);
        transformer.setOutputProperty(OutputKeys.ENCODING, encoding);

        // Preserve the XML declaration
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");

        // Do NOT reformat — keep original indentation to minimise diff noise
        transformer.setOutputProperty(OutputKeys.INDENT, "no");

        ByteArrayOutputStream out = new ByteArrayOutputStream(originalXml.length);
        transformer.transform(new DOMSource(doc), new StreamResult(out));
        return out.toByteArray();
    }

    private String detectEncoding(byte[] xmlBytes) {
        return formatConverter.detectEncoding(xmlBytes);
    }
}
