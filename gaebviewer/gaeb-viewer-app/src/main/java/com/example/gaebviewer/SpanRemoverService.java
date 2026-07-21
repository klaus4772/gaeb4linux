package com.example.gaebviewer.application.util;

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
import java.io.InputStream;

@Service
public class SpanRemoverService {

    /**
     * Entfernt alle <span> Tags aus <DetailTxt> Elementen in einer GAEB DA85 XML-Datei.
     *
     * @param inputStream InputStream der Original-XML-Datei
     * @return byte[] der verarbeiteten XML-Datei
     * @throws Exception bei Verarbeitungsfehlern
     */
    public byte[] removeSpanTags(InputStream inputStream) throws Exception {
        // XML-Datei einlesen
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputStream);

        // Alle DetailTxt Elemente finden und verarbeiten
        NodeList detailTxtNodes = document.getElementsByTagName("DetailTxt");
        int processedCount = 0;

        for (int i = 0; i < detailTxtNodes.getLength(); i++) {
            Element detailTxt = (Element) detailTxtNodes.item(i);
            if (removeSpanTagsFromElement(detailTxt)) {
                processedCount++;
            }
        }

        System.out.println("[DEBUG_LOG] Verarbeitete DetailTxt Elemente: " + processedCount);

        // XML-Dokument in byte[] konvertieren
        return documentToByteArray(document);
    }

    /**
     * Entfernt rekursiv alle <span> Tags aus einem Element, behält aber den Textinhalt.
     *
     * @param element Das zu verarbeitende Element
     * @return true wenn Änderungen vorgenommen wurden
     */
    private boolean removeSpanTagsFromElement(Element element) {
        boolean modified = false;
        NodeList children = element.getChildNodes();

        // Rückwärts iterieren, um Probleme beim Entfernen zu vermeiden
        for (int i = children.getLength() - 1; i >= 0; i--) {
            Node child = children.item(i);

            if (child.getNodeType() == Node.ELEMENT_NODE) {
                Element childElement = (Element) child;

                // Wenn es ein <span> Tag ist
                if ("span".equalsIgnoreCase(childElement.getTagName())) {
                    // Alle Kinder des <span> Tags zum Parent hinzufügen
                    NodeList spanChildren = childElement.getChildNodes();
                    
                    // Kinder in umgekehrter Reihenfolge einfügen, um die Reihenfolge zu erhalten
                    for (int j = spanChildren.getLength() - 1; j >= 0; j--) {
                        Node spanChild = spanChildren.item(j);
                        Node clonedChild = spanChild.cloneNode(true);
                        
                        // Nach dem aktuellen <span> einfügen
                        if (child.getNextSibling() != null) {
                            element.insertBefore(clonedChild, child.getNextSibling());
                        } else {
                            element.appendChild(clonedChild);
                        }
                    }

                    // <span> Tag entfernen
                    element.removeChild(child);
                    modified = true;
                } else {
                    // Rekursiv in verschachtelte Elemente gehen
                    if (removeSpanTagsFromElement(childElement)) {
                        modified = true;
                    }
                }
            }
        }

        return modified;
    }

    /**
     * Konvertiert ein DOM Document in ein byte Array.
     *
     * @param document Das zu konvertierende Document
     * @return byte[] der XML-Datei
     * @throws Exception bei Transformationsfehlern
     */
    private byte[] documentToByteArray(Document document) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        
        // XML-Formatierung beibehalten
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty(OutputKeys.STANDALONE, "no");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(outputStream);
        
        transformer.transform(source, result);
        
        return outputStream.toByteArray();
    }

    /**
     * Hilfsmethode zum Testen: Zählt die Anzahl der <span> Tags in einem InputStream.
     *
     * @param inputStream InputStream der XML-Datei
     * @return Anzahl der gefundenen <span> Tags
     * @throws Exception bei Verarbeitungsfehlern
     */
    public int countSpanTags(InputStream inputStream) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputStream);

        NodeList spanNodes = document.getElementsByTagName("span");
        return spanNodes.getLength();
    }
}
