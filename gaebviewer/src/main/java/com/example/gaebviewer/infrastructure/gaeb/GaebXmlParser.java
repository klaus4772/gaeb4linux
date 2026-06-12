package com.example.gaebviewer.infrastructure.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImporter;
import com.example.gaebviewer.domain.gaeb.GaebBoQ;
import com.example.gaebviewer.domain.gaeb.GaebPosition;
import com.example.gaebviewer.domain.gaeb.GaebProject;
import org.springframework.stereotype.Component;
import org.w3c.dom.*;
import org.springframework.context.annotation.Primary;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.math.BigDecimal;

@Component
@Primary
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

            NodeList itemNodes = doc.getElementsByTagNameNS(namespace, "Item");

            for (int i = 0; i < itemNodes.getLength(); i++) {
                Element item = (Element) itemNodes.item(i);

                GaebPosition position = new GaebPosition();

                position.setNumber(item.getAttribute("RNoPart"));

                NodeList outlineNodes = item.getElementsByTagNameNS(namespace, "OutlineText");
                if (outlineNodes.getLength() > 0) {
                    position.setShortText(outlineNodes.item(0).getTextContent().trim());
                }

                NodeList qtyNodes = item.getElementsByTagNameNS(namespace, "Qty");
                if (qtyNodes.getLength() > 0) {
                    position.setQuantity(parseBigDecimal(qtyNodes.item(0).getTextContent()));
                }

                NodeList unitNodes = item.getElementsByTagNameNS(namespace, "QU");
                if (unitNodes.getLength() > 0) {
                    position.setUnit(unitNodes.item(0).getTextContent());
                }

                NodeList upNodes = item.getElementsByTagNameNS(namespace, "UP");
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

    private BigDecimal parseBigDecimal(String value) {
        if (value == null || value.isBlank()) {
            return BigDecimal.ZERO;
        }
        return new BigDecimal(value.replace(",", "."));
    }
}