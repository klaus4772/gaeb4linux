package com.example.gaeb.core.model;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GaebXmlParser {


    public Tender parse(File file) throws Exception {
        Document doc = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse(file);
        doc.getDocumentElement().normalize();

        Tender tender = new Tender();

        NodeList tenderNodes = doc.getElementsByTagName("LV");
        if (tenderNodes.getLength() > 0) {
            Element lv = (Element) tenderNodes.item(0);
            tender.setId(lv.getAttribute("ID"));
            tender.setTitle(getTextContent(lv, "TITEL"));
        }

        NodeList positionNodes = doc.getElementsByTagName("POSITION");
        List<Position> positions = new ArrayList<>();

        for (int i = 0; i < positionNodes.getLength(); i++) {
            Element posElem = (Element) positionNodes.item(i);
            Position position = new Position();
            position.setNumber(posElem.getAttribute("POS"));
            position.setShortText(getTextContent(posElem, "TEXT"));

            List<ItemText> itemTexts = new ArrayList<>();
            NodeList textNodes = posElem.getElementsByTagName("TEXTZUSATZ");
            for (int j = 0; j < textNodes.getLength(); j++) {
                itemTexts.add(new ItemText(textNodes.item(j).getTextContent()));
            }
            position.setItemTexts(itemTexts);

            positions.add(position);
        }
        tender.setPositions(positions);
        return tender;
    }

    private String getTextContent(Element parent, String tagName) {
        NodeList list = parent.getElementsByTagName(tagName);
        return (list.getLength() > 0) ? list.item(0).getTextContent() : "";
    }
}
