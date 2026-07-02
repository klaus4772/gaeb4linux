package com.example.gaebviewer.infrastructure.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImporter;
import com.example.gaebviewer.domain.gaeb.GaebBoQ;
import com.example.gaebviewer.domain.gaeb.GaebPosition;
import com.example.gaebviewer.domain.gaeb.GaebProject;
import org.springframework.stereotype.Component;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.math.BigDecimal;

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

            NodeList itemNodes = doc.getElementsByTagNameNS("*", "Item");

            for (int i = 0; i < itemNodes.getLength(); i++) {
                Element item = (Element) itemNodes.item(i);

                GaebPosition position = new GaebPosition();

                position.setNumber(item.getAttribute("RNoPart"));

                NodeList outlineNodes = item.getElementsByTagNameNS("*", "OutlineText");
                if (outlineNodes.getLength() > 0) {
                    position.setShortText(outlineNodes.item(0).getTextContent().trim());
                }

                // Langtext extrahieren
                NodeList detailTxtNodes = item.getElementsByTagNameNS("*", "DetailTxt");
                if (detailTxtNodes.getLength() > 0) {
                    position.setLongText(recursiveExtractText(detailTxtNodes.item(0)));
                }

                NodeList qtyNodes = item.getElementsByTagNameNS("*", "Qty");
                if (qtyNodes.getLength() > 0) {
                    position.setQuantity(parseBigDecimal(qtyNodes.item(0).getTextContent()));
                }

                NodeList unitNodes = item.getElementsByTagNameNS("*", "QU");
                if (unitNodes.getLength() > 0) {
                    position.setUnit(unitNodes.item(0).getTextContent());
                }

                NodeList upNodes = item.getElementsByTagNameNS("*", "UP");
                if (upNodes.getLength() > 0) {
                    position.setUnitPrice(parseBigDecimal(upNodes.item(0).getTextContent()));
                }

                boq.addPosition(position);
            }

            return project;

        } catch (Exception e) {
            throw new RuntimeException("Fehler beim GAEB Parsing", e);
        }
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