package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.domain.GaebPosition;
import com.example.gaebviewer.domain.GaebProject;
import com.example.gaebviewer.domain.GaebTextComplement;
import com.example.gaebviewer.infrastructure.gaeb.GaebNamespaceResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

@Service
public class GaebImportService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GaebImportService.class);

    private final GaebNamespaceResolver namespaceResolver;
    private final GaebImporterFactory importerFactory;

    public GaebImportService(GaebNamespaceResolver namespaceResolver,
                             GaebImporterFactory importerFactory) {
        this.namespaceResolver = namespaceResolver;
        this.importerFactory = importerFactory;
    }

    public GaebProject importGaeb(InputStream inputStream) {
        BufferedGaebInput buffer = BufferedGaebInput.from(inputStream);

        String ns = null;
        GaebSchemaVersion version = GaebSchemaVersion.UNKNOWN;
        try {
            ns = namespaceResolver.detectRootNamespace(buffer.newStream());
            version = namespaceResolver.detectSchemaVersion(ns);
        } catch (RuntimeException detectionException) {
            LOGGER.warn("Failed to detect GAEB namespace/version, using generic parser fallback.");
            LOGGER.debug("Namespace detection error details", detectionException);
        }

        GaebImporter importer = importerFactory.forVersion(version);
        GaebImporter fallbackImporter = importerFactory.forVersion(GaebSchemaVersion.UNKNOWN);

        GaebProject project;
        try {
            project = importer.importGaeb(buffer.newStream());
        } catch (RuntimeException primaryException) {
            if (fallbackImporter == importer) {
                throw primaryException;
            }
            LOGGER.warn("Schema-specific import failed for {}, retrying with generic parser.", version);
            LOGGER.debug("Schema-specific import error details", primaryException);
            project = fallbackImporter.importGaeb(buffer.newStream());
        }

        // Optional: Namespace/Version im Projekt setzen (falls Importer das nicht macht)
        if (project.getGaebVersion() == null) {
            project.setGaebVersion(ns);
        }
        Document metadataDocument = parseDocument(buffer.newStream());
        project.setCurrencyCode(extractCurrencyCode(metadataDocument));
        enrichBidderTextComplements(project, metadataDocument);

        return project;
    }

    private Document parseDocument(InputStream inputStream) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(inputStream);
        } catch (Exception exception) {
            LOGGER.warn("Failed to parse GAEB metadata document.");
            LOGGER.debug("Metadata document parsing error details", exception);
            return null;
        }
    }

    private String extractCurrencyCode(Document document) {
        if (document == null) {
            return "EUR";
        }
        try {
            NodeList currencyNodes = document.getElementsByTagNameNS("*", "Cur");
            if (currencyNodes.getLength() == 0) {
                return "EUR";
            }

            String currencyCode = currencyNodes.item(0).getTextContent();
            return currencyCode == null || currencyCode.isBlank() ? "EUR" : currencyCode;
        } catch (Exception exception) {
            LOGGER.warn("Failed to extract currency from GAEB file, defaulting to EUR.");
            LOGGER.debug("Currency extraction error details", exception);
            return "EUR";
        }
    }

    private void enrichBidderTextComplements(GaebProject project, Document document) {
        if (project == null || document == null) {
            return;
        }

        Map<String, GaebPosition> positionsByNumber = collectPositionsByNumber(project);
        if (positionsByNumber.isEmpty()) {
            return;
        }

        enrichBidderTextComplements(document.getDocumentElement(), new ArrayList<>(), positionsByNumber);
    }

    private Map<String, GaebPosition> collectPositionsByNumber(GaebProject project) {
        Map<String, GaebPosition> positionsByNumber = new LinkedHashMap<>();
        project.getBoqs().forEach(boq -> boq.getPositions().forEach(position -> {
            if (position.getNumber() != null && !position.getNumber().isBlank()) {
                positionsByNumber.put(position.getNumber(), position);
            }
        }));
        return positionsByNumber;
    }

    private void enrichBidderTextComplements(Element element,
                                             List<String> ancestorPath,
                                             Map<String, GaebPosition> positionsByNumber) {
        if (element == null) {
            return;
        }

        List<String> currentPath = ancestorPath;
        String rNoPart = element.getAttribute("RNoPart");
        if (rNoPart != null && !rNoPart.isBlank()) {
            currentPath = new ArrayList<>(ancestorPath);
            currentPath.add(rNoPart.trim());

            GaebPosition position = positionsByNumber.get(String.join(".", currentPath));
            if (position != null) {
                position.setBidderTextComplements(extractBidderTextComplements(element));
            }
        }

        NodeList children = element.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                enrichBidderTextComplements((Element) child, currentPath, positionsByNumber);
            }
        }
    }

    private List<GaebTextComplement> extractBidderTextComplements(Element positionElement) {
        Element description = firstDirectChildElement(positionElement, "Description");
        if (description == null) {
            return List.of();
        }

        Element completeText = firstDirectChildElement(description, "CompleteText");
        if (completeText == null) {
            return List.of();
        }

        String complTSB = firstDirectChildText(completeText, "ComplTSB");
        if (!"Yes".equalsIgnoreCase(trimToEmpty(complTSB))) {
            return List.of();
        }

        Element detailTxt = firstDirectChildElement(completeText, "DetailTxt");
        if (detailTxt == null) {
            return List.of();
        }

        List<GaebTextComplement> bidderTextComplements = new ArrayList<>();
        NodeList children = detailTxt.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            Element childElement = (Element) child;
            if (!matchesLocalName(childElement, "TextComplement")) {
                continue;
            }
            if (!"Bidder".equalsIgnoreCase(childElement.getAttribute("Kind"))) {
                continue;
            }

            bidderTextComplements.add(toGaebTextComplement(childElement));
        }

        return bidderTextComplements;
    }

    private GaebTextComplement toGaebTextComplement(Element element) {
        GaebTextComplement textComplement = new GaebTextComplement();
        textComplement.setMarkLabel(trimToEmpty(element.getAttribute("MarkLbl")));
        textComplement.setRequired(!"Yes".equalsIgnoreCase(trimToEmpty(element.getAttribute("Empty"))));
        textComplement.setCaption(firstDirectChildText(element, "ComplCaption"));
        textComplement.setTail(firstDirectChildText(element, "ComplTail"));

        String body = trimToEmpty(firstDirectChildText(element, "ComplBody"));
        if (looksLikePlaceholder(body)) {
            textComplement.setPlaceholder(body);
            textComplement.setBody("");
        } else {
            textComplement.setBody(body);
        }

        return textComplement;
    }

    private boolean looksLikePlaceholder(String value) {
        if (value == null || value.isBlank()) {
            return true;
        }

        String normalized = value
                .replace('\u2019', '\'')
                .replace('\u2018', '\'')
                .replace('\u201C', '"')
                .replace('\u201D', '"')
                .replace('\u2026', '.')
                .replaceAll("[\\s\\p{Punct}]+", "");
        return normalized.isBlank();
    }

    private Element firstDirectChildElement(Element parent, String localName) {
        NodeList children = parent.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            Element element = (Element) child;
            if (matchesLocalName(element, localName)) {
                return element;
            }
        }
        return null;
    }

    private boolean matchesLocalName(Element element, String localName) {
        String elementName = element.getLocalName() != null ? element.getLocalName() : element.getNodeName();
        return localName.equals(elementName);
    }

    private String firstDirectChildText(Element parent, String localName) {
        Element child = firstDirectChildElement(parent, localName);
        return child == null ? "" : trimToEmpty(child.getTextContent());
    }

    private String trimToEmpty(String value) {
        return value == null ? "" : value.trim();
    }
}