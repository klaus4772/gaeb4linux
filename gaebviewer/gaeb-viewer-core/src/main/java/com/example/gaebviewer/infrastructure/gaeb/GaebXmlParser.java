package com.example.gaebviewer.infrastructure.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImporter;
import com.example.gaebviewer.domain.GaebBoQ;
import com.example.gaebviewer.domain.GaebPosition;
import com.example.gaebviewer.domain.GaebProject;
import org.springframework.stereotype.Component;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class GaebXmlParser implements GaebImporter {

    @Override
    public GaebProject importGaeb(InputStream inputStream) {
        return parse(inputStream);
    }

    public GaebProject parse(InputStream inputStream) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);

            Element root = doc.getDocumentElement();
            String namespace = root.getNamespaceURI();

            GaebProject project = new GaebProject();
            project.setGaebVersion(namespace);

            GaebBoQ boq = new GaebBoQ();
            boq.setTitle("Leistungsverzeichnis");
            project.addBoQ(boq);

            walkPositions(root, new ArrayList<>(), boq);

            return project;

        } catch (Exception e) {
            throw new RuntimeException("Fehler beim GAEB Parsing", e);
        }
    }

    /**
     * Recursively walks the GAEB DOM tree, tracking the chain of ancestor RNoPart values (the
     * nested BoQCtgy hierarchy levels defined by BoQInfo/BoQBkdn) so each position's
     * Ordnungszahl reflects its full hierarchical path (e.g. "1.2.12"), not just its own
     * RNoPart, joined by dots as GAEB specifies.
     */
    private void walkPositions(Element el, List<String> ancestorPath, GaebBoQ boq) {
        String rNoPart = el.getAttribute("RNoPart");
        boolean hasRNoPart = rNoPart != null && !rNoPart.isBlank();

        List<String> childPath = ancestorPath;

        if (hasRNoPart) {
            List<String> fullPath = new ArrayList<>(ancestorPath);
            fullPath.add(rNoPart.trim());
            childPath = fullPath;

            GaebPosition position = new GaebPosition();
            position.setNumber(String.join(".", fullPath));

            // Category/title nodes (e.g. BoQCtgy) carry their label directly in a LblTx child
            // rather than in a nested Description/OutlineText; searching descendants for
            // OutlineText/DetailTxt on such a node would incorrectly pick up text from a
            // nested child Item instead.
            String lblTx = firstDirectChildText(el, "LblTx");
            if (lblTx != null && !lblTx.isBlank()) {
                position.setShortText(lblTx.trim());
                position.setLongText(lblTx.trim());
            } else {
                NodeList outlineNodes = el.getElementsByTagNameNS("*", "OutlineText");
                if (outlineNodes.getLength() > 0) {
                    String t = recursiveExtractText(outlineNodes.item(0));
                    if (!t.isBlank()) position.setShortText(t.trim());
                }

                NodeList detailTxtNodes = el.getElementsByTagNameNS("*", "DetailTxt");
                if (detailTxtNodes.getLength() > 0) {
                    String t = recursiveExtractText(detailTxtNodes.item(0));
                    if (!t.isBlank()) position.setLongText(t.trim());
                }
                if (position.getLongText() == null && position.getShortText() != null) {
                    position.setLongText(position.getShortText());
                }
            }

            String qty = firstDirectChildText(el, "Qty");
            if (qty != null) position.setQuantity(parseBigDecimal(qty));

            String unit = firstDirectChildText(el, "QU");
            if (unit != null) position.setUnit(unit);

            String up = firstDirectChildText(el, "UP");
            if (up != null) position.setUnitPrice(parseBigDecimal(up));

            boq.addPosition(position);
        }

        NodeList children = el.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                walkPositions((Element) child, childPath, boq);
            }
        }
    }

    private String firstDirectChildText(Element parent, String localName) {
        NodeList children = parent.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE && localName.equals(child.getLocalName())) {
                return recursiveExtractText(child);
            }
        }
        return null;
    }

    private String recursiveExtractText(Node node) {
        if (node == null) return "";
        if (node.getNodeType() == Node.TEXT_NODE) {
            return node.getNodeValue().trim();
        }
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            StringBuilder sb = new StringBuilder();
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                String childText = recursiveExtractText(children.item(i));
                if (!childText.isEmpty()) {
                    if (!sb.isEmpty()) sb.append(" ");
                    sb.append(childText);
                }
            }
            return sb.toString().trim();
        }
        return "";
    }

    private BigDecimal parseBigDecimal(String value) {
        if (value == null || value.isBlank()) {
            return BigDecimal.ZERO;
        }
        try {
            return new BigDecimal(value.replace(",", "."));
        } catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }
}