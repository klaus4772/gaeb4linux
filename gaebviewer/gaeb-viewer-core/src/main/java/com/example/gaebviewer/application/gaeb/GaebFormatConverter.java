package com.example.gaebviewer.application.gaeb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Converts a GAEB XML document from one DA exchange phase to another by substituting
 * the namespace URI that encodes the DA number.
 *
 * <p>All DA formats (DA80–DA87) share the same XML structure; only the namespace URI
 * differs, e.g. {@code http://www.gaeb.de/GAEB_DA_XML/DA86/3.3} → DA87.  Both the
 * 3.2 and 3.3 minor-version variants of the source namespace are normalised to the
 * {@code 3.3} namespace of the target format.</p>
 *
 * <p>The conversion is purely textual (no DOM round-trip) which preserves the
 * original encoding, indentation, and comments exactly.</p>
 */
@Service
public class GaebFormatConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(GaebFormatConverter.class);

    /** Minor-version suffixes we try to replace in source namespaces. */
    private static final List<String> KNOWN_MINOR_VERSIONS = List.of("3.0", "3.1", "3.2", "3.3");

    /**
     * Converts {@code sourceXml} so that it carries the namespace of {@code targetVersion}.
     *
     * @param sourceXml     raw bytes of the GAEB XML file (any supported DA format)
     * @param targetVersion the DA format to convert to; must not be {@link GaebSchemaVersion#UNKNOWN}
     * @return the converted XML bytes in the same character encoding as the input
     * @throws IllegalArgumentException if {@code targetVersion} is {@link GaebSchemaVersion#UNKNOWN}
     */
    public byte[] convert(byte[] sourceXml, GaebSchemaVersion targetVersion) {
        if (targetVersion == GaebSchemaVersion.UNKNOWN) {
            throw new IllegalArgumentException("Cannot convert to UNKNOWN GAEB format");
        }

        String encoding = detectEncoding(sourceXml);
        String xml;
        try {
            xml = new String(sourceXml, encoding);
        } catch (Exception e) {
            throw new RuntimeException("Could not decode GAEB XML with encoding " + encoding, e);
        }

        GaebSchemaVersion sourceVersion = detectSourceVersion(xml);

        if (sourceVersion == targetVersion) {
            LOGGER.debug("Source and target format are both {}; skipping conversion.", targetVersion);
            return sourceXml;
        }

        String targetNs = targetVersion.getNamespaceBase() + "/3.3";

        if (sourceVersion != GaebSchemaVersion.UNKNOWN) {
            String sourceBase = sourceVersion.getNamespaceBase();
            for (String minor : KNOWN_MINOR_VERSIONS) {
                String sourceNs = sourceBase + "/" + minor;
                xml = xml.replace(sourceNs, targetNs);
            }
            LOGGER.debug("Converted namespace from {} to {}", sourceVersion, targetVersion);
        } else {
            // Source version unknown — try replacing any DA namespace pattern we can find
            LOGGER.warn("Source DA version could not be detected; attempting best-effort namespace replacement.");
            for (GaebSchemaVersion candidate : GaebSchemaVersion.values()) {
                if (candidate == GaebSchemaVersion.UNKNOWN || candidate == targetVersion) continue;
                String candidateBase = candidate.getNamespaceBase();
                for (String minor : KNOWN_MINOR_VERSIONS) {
                    String ns = candidateBase + "/" + minor;
                    if (xml.contains(ns)) {
                        xml = xml.replace(ns, targetNs);
                        LOGGER.debug("Best-effort: replaced {} namespace with {}", candidate, targetVersion);
                        break;
                    }
                }
            }
        }

        try {
            return xml.getBytes(encoding);
        } catch (Exception e) {
            throw new RuntimeException("Could not encode converted GAEB XML with encoding " + encoding, e);
        }
    }

    // -----------------------------------------------------------------------
    // Helpers
    // -----------------------------------------------------------------------

    /**
     * Detects the DA version encoded in the namespace URI of the XML document.
     * Scans for patterns like {@code GAEB_DA_XML/DA86/}.
     */
    public GaebSchemaVersion detectSourceVersion(String xml) {
        for (GaebSchemaVersion v : GaebSchemaVersion.values()) {
            if (v == GaebSchemaVersion.UNKNOWN) continue;
            if (xml.contains("GAEB_DA_XML/DA" + v.getDaNumber() + "/")) {
                return v;
            }
        }
        return GaebSchemaVersion.UNKNOWN;
    }

    /**
     * Reads the {@code encoding} attribute from the XML declaration of the raw byte array.
     * Falls back to {@code "UTF-8"} when no declaration is found.
     */
    String detectEncoding(byte[] xmlBytes) {
        try {
            String head = new String(xmlBytes, 0, Math.min(200, xmlBytes.length), Charset.forName("US-ASCII"));
            for (char quote : new char[]{'"', '\''}) {
                String marker = "encoding=" + quote;
                int idx = head.indexOf(marker);
                if (idx >= 0) {
                    int start = idx + marker.length();
                    int end = head.indexOf(quote, start);
                    if (end > start) return head.substring(start, end);
                }
            }
        } catch (Exception e) {
            LOGGER.debug("Could not detect XML encoding, defaulting to UTF-8", e);
        }
        return "UTF-8";
    }
}
