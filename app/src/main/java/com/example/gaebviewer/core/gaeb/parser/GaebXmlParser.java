package com.example.gaebviewer.core.gaeb.parser;

import com.example.gaebviewer.core.model.Position;
import org.springframework.stereotype.Component;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class GaebXmlParser {

    public List<Position> parse(InputStream inputStream) {

        List<Position> positions = new ArrayList<>();

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);

            Element root = doc.getDocumentElement();
            String namespace = root.getNamespaceURI();

            NodeList itemNodes =
                    doc.getElementsByTagNameNS(namespace, "Item");
            System.out.println("Namespace: " + namespace);
            System.out.println("Items gefunden: " + itemNodes.getLength());

            for (int i = 0; i < itemNodes.getLength(); i++) {

                Element item = (Element) itemNodes.item(i);

                Position position = new Position();

                // OZ
                // OZ aus Attribut
                String rNo = item.getAttribute("RNoPart");
                position.setNumber(rNo);


                // Kurztext
                // Kurztext aus OutlineText
                NodeList outlineNodes =
                        item.getElementsByTagNameNS(namespace, "OutlineText");

                if (outlineNodes.getLength() > 0) {
                    String shortText = outlineNodes.item(0).getTextContent().trim();
                    position.setShortText(shortText);
                }


                // Menge
                NodeList qtyNodes =
                        item.getElementsByTagNameNS(namespace, "Qty");
                if (qtyNodes.getLength() > 0) {
                    position.setContractQuantity(
                            parseDouble(qtyNodes.item(0).getTextContent()));
                }

                // Einheit
                NodeList unitNodes =
                        item.getElementsByTagNameNS(namespace, "QU");
                if (unitNodes.getLength() > 0) {
                    position.setUnit(unitNodes.item(0).getTextContent());
                }

                // EP
                NodeList upNodes =
                        item.getElementsByTagNameNS(namespace, "UP");
                if (upNodes.getLength() > 0) {
                    position.setUnitPrice(
                            parseDouble(upNodes.item(0).getTextContent()));
                }
                System.out.println("Position gefunden:");
                System.out.println("RNo: " + position.getNumber());
                System.out.println("ShortText: " + position.getShortText());

                positions.add(position);
            }

        } catch (Exception e) {
            throw new RuntimeException("Fehler beim GAEB Parsing", e);
        }

        return positions;
    }

    private double parseDouble(String value) {
        if (value == null || value.isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(value.replace(",", "."));
    }
}
