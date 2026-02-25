package com.example.gaebviewer.infrastructure.gaeb;

import com.example.gaebviewer.application.gaeb.GaebSchemaVersion;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

import org.springframework.stereotype.Component;

@Component
public class GaebNamespaceResolver {

    private final XMLInputFactory factory = XMLInputFactory.newFactory();

    public String detectRootNamespace(InputStream in) {
        try {
            XMLStreamReader r = factory.createXMLStreamReader(in);
            try {
                while (r.hasNext()) {
                    int event = r.next();
                    if (event == XMLStreamConstants.START_ELEMENT) {
                        return r.getNamespaceURI(); // Root-Element Namespace
                    }
                }
                return null;
            } finally {
                try { r.close(); } catch (Exception ignore) {}
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to detect GAEB root namespace", e);
        }
    }

    public GaebSchemaVersion detectSchemaVersion(String namespace) {
        if (namespace == null || namespace.isBlank()) {
            return GaebSchemaVersion.UNKNOWN;
        }

        // Robust: viele GAEB Namespaces enthalten DA80/DA81 in irgendeiner Form
        String ns = namespace.toUpperCase();

        if (ns.contains("DA80")) return GaebSchemaVersion.DA80;
        if (ns.contains("DA81")) return GaebSchemaVersion.DA81;

        return GaebSchemaVersion.UNKNOWN;
    }
}