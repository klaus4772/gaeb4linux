package com.example.gaebviewer.infrastructure.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImporterFactory;
import com.example.gaebviewer.application.gaeb.GaebSchemaVersion;
import com.example.gaebviewer.domain.gaeb.GaebBoQ;
import com.example.gaebviewer.domain.gaeb.GaebPosition;
import com.example.gaebviewer.domain.gaeb.GaebProject;
import com.example.gaebviewer.schema.da82.TgGAEB;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

@Component
public class Da82JaxbImporter implements GaebImporterFactory.VersionedGaebImporter {

    private static final Logger LOGGER = LoggerFactory.getLogger(Da82JaxbImporter.class);

    private static JAXBContext CONTEXT;

    private static synchronized JAXBContext getContext() {
        if (CONTEXT == null) {
            try {
                CONTEXT = JAXBContext.newInstance("com.example.gaebviewer.schema.da82");
            } catch (Exception e) {
                throw new RuntimeException("Failed to create JAXBContext for DA82. Ensure gaeb-schema-da82 is built and ObjectFactory is present.", e);
            }
        }
        return CONTEXT;
    }

    @Override
    public GaebSchemaVersion supports() {
        return GaebSchemaVersion.DA82;
    }

    @Override
    public GaebProject importGaeb(InputStream inputStream) {
        try {
            Unmarshaller unmarshaller = getContext().createUnmarshaller();

            Object result = unmarshaller.unmarshal(inputStream);
            Object root = (result instanceof JAXBElement<?> j) ? j.getValue() : result;

            TgGAEB gaeb = (TgGAEB) root;

            GaebProject project = new GaebProject();
            project.setGaebVersion("DA82");

            GaebBoQ boq = new GaebBoQ();
            boq.setTitle("Leistungsverzeichnis");
            project.addBoQ(boq);

            var positions = extractPositions(gaeb);
            positions.forEach(boq::addPosition);

            System.out.println("DA82 extracted positions: " + positions.size());

            return project;

        } catch (Exception e) {
            throw new RuntimeException("DA82 JAXB import failed", e);
        }
    }

    private List<GaebPosition> extractPositions(Object root) {
        IdentityHashMap<Object, Boolean> visited = new IdentityHashMap<>();
        List<GaebPosition> out = new ArrayList<>();
        walkPositions(root, new ArrayList<>(), out, visited);

        return out.stream()
                .collect(Collectors.toMap(
                        GaebPosition::getNumber,
                        p -> p,
                        (a, b) -> a,
                        LinkedHashMap::new
                ))
                .values()
                .stream()
                .toList();
    }

    /**
     * Recursively walks the GAEB object tree, tracking the chain of ancestor RNoPart values
     * (the nested BoQCtgy hierarchy levels defined by BoQInfo/BoQBkdn) so each position's
     * Ordnungszahl reflects its full hierarchical path (e.g. "1.2.12"), not just its own
     * RNoPart, joined by dots as GAEB specifies.
     */
    private void walkPositions(Object cur, List<String> ancestorPath, List<GaebPosition> out, IdentityHashMap<Object, Boolean> visited) {
        if (cur == null) return;
        if (visited.put(cur, Boolean.TRUE) != null) return;

        if (cur instanceof JAXBElement<?> je) {
            walkPositions(je.getValue(), ancestorPath, out, visited);
            return;
        }

        List<String> childPath = ancestorPath;

        String rNoPart = invokeStringGetter(cur, "getRNoPart");
        if (rNoPart != null && !rNoPart.isBlank()) {
            List<String> fullPath = new ArrayList<>(ancestorPath);
            fullPath.add(rNoPart.trim());
            childPath = fullPath;

            GaebPosition p = new GaebPosition();
            p.setNumber(String.join(".", fullPath));

            String shortText = extractOutlineText(cur);
            if (shortText == null || shortText.isBlank()) {
                shortText = findAnyOutlineText(cur);
            }
            if (shortText == null || shortText.isBlank()) {
                // Category/title nodes (e.g. TgBoQCtgy) carry their label in LblTx rather
                // than Description/OutlineText.
                Object lblTx = invokeGetter(cur, "getLblTx");
                if (lblTx != null) {
                    String t = extractAllText(lblTx);
                    if (t != null && !t.isBlank()) shortText = t;
                }
            }
            if (shortText != null && !shortText.isBlank()) {
                p.setShortText(shortText.trim());
            }

            String longText = extractLongText(cur);
            if (longText == null || longText.isBlank()) {
                longText = findAnyDetailText(cur);
            }
            if (longText != null && !longText.isBlank()) {
                p.setLongText(longText.trim());
            } else if (p.getShortText() != null) {
                p.setLongText(p.getShortText());
            }

            BigDecimal qty = invokeBigDecimalGetter(cur, "getQty");
            if (qty == null) qty = resolveBigDecimalContent(cur, "Qty");
            if (qty != null) p.setQuantity(qty);

            String unit = invokeStringGetter(cur, "getQU");
            if (unit == null) unit = resolveStringContent(cur, "QU");
            if (unit != null) p.setUnit(unit);

            BigDecimal up = invokeBigDecimalGetter(cur, "getUP");
            if (up == null) up = resolveBigDecimalContent(cur, "UP");
            if (up != null) p.setUnitPrice(up);

            out.add(p);
        }

        if (cur instanceof Collection<?> it) {
            for (Object x : it) if (x != null) walkPositions(x, childPath, out, visited);
            return;
        }

        if (cur instanceof String || cur instanceof Number || cur instanceof Boolean || cur.getClass().isEnum()) {
            return;
        }

        for (java.lang.reflect.Method m : cur.getClass().getMethods()) {
            if (m.getParameterCount() != 0) continue;
            if (!m.getName().startsWith("get")) continue;
            if (m.getName().equals("getClass")) continue;

            Class<?> rt = m.getReturnType();
            if (rt.isPrimitive()) continue;

            try {
                Object val = m.invoke(cur);
                if (val != null) walkPositions(val, childPath, out, visited);
            } catch (Exception ex) {
                LOGGER.debug("Ignored reflection exception during walkPositions", ex);
            }
        }
    }

    private String extractOutlineText(Object cur) {
        String direct = invokeStringGetter(cur, "getOutlineText");
        if (direct != null) return direct.trim();

        Object val = invokeGetter(cur, "getOutlineText");
        if (val != null) {
            if (val instanceof Collection<?> it) {
                StringBuilder sb = new StringBuilder();
                for (Object x : it) {
                    String t = extractAllText(x);
                    if (t != null && !t.isBlank()) {
                        if (!sb.isEmpty()) sb.append("\n");
                        sb.append(t.trim());
                    }
                }
                return sb.toString();
            }

            // Use extractAllText for complex objects
            return extractAllText(val);
        }

        // For item types (e.g. TgItem) OutlineText is not exposed directly on cur; it lives
        // nested under Description -> CompleteText -> OutlineText, or (if no CompleteText is
        // present) directly under Description as an alternative.
        Object description = resolveDescription(cur);
        if (description != null) {
            Object completeText = invokeGetter(description, "getCompleteText");
            Object nestedOutline = completeText != null ? invokeGetter(completeText, "getOutlineText") : null;
            if (nestedOutline == null) {
                nestedOutline = invokeGetter(description, "getOutlineText");
            }
            if (nestedOutline != null) {
                return extractAllText(nestedOutline);
            }
        }

        return null;
    }

    private String extractLongText(Object cur) {
        Object description = resolveDescription(cur);
        if (description == null) return null;

        Object completeText = invokeGetter(description, "getCompleteText");
        if (completeText == null) return null;

        Object detailTxt = invokeGetter(completeText, "getDetailTxt");
        if (detailTxt == null) return null;

        Object text = invokeGetter(detailTxt, "getTextOrTextComplementOrAttachment");
        if (text == null) {
            return extractAllText(detailTxt);
        }

        if (text instanceof Collection<?> it) {
            StringBuilder sb = new StringBuilder();
            for (Object x : it) {
                    if (x != null) {
                    if (!sb.isEmpty()) sb.append("\n");
                    sb.append(extractAllText(x));
                }
            }
            return sb.toString();
        }

        return extractAllText(text);
    }

    private String extractAllText(Object obj) {
        if (obj == null) return "";
        if (obj instanceof String s) return s.trim();
        if (obj instanceof JAXBElement<?> je) {
            Object val = je.getValue();
            if (val instanceof String s) return s.trim();
            return extractAllText(val);
        }

        StringBuilder sb = new StringBuilder();
        if (obj instanceof Collection<?> coll) {
            for (Object item : coll) {
                String t = extractAllText(item);
                if (!t.isEmpty()) {
                    if (!sb.isEmpty()) sb.append(" ");
                    sb.append(t);
                }
            }
            return sb.toString().trim();
        }

        // Handle specific GAEB types that hold lists of content
        Object content = invokeGetter(obj, "getPOrDivOrSpan");
        if (content == null) content = invokeGetter(obj, "getSpanOrBr");
        if (content == null) content = invokeGetter(obj, "getSpanOrBrOrImage");
        if (content == null) content = invokeGetter(obj, "getTextOutlTxtOrTextComplement");
        
        if (content instanceof Collection<?> coll) {
            return extractAllText(coll);
        }

        // Check for getValue() method (used by Tgspan and similar classes)
        Object value = invokeGetter(obj, "getValue");
        if (value instanceof String s && !s.trim().isEmpty()) {
            return s.trim();
        }

        for (java.lang.reflect.Method m : obj.getClass().getMethods()) {
            if (m.getParameterCount() == 0 && (m.getName().startsWith("get") || m.getName().startsWith("is")) && !m.getName().equals("getClass")) {
                try {
                    Object val = m.invoke(obj);
                    if (val != null) {
                        if (val instanceof Collection<?> it) {
                            for (Object child : it) {
                                String t = extractAllText(child);
                                  if (!t.isEmpty()) {
                                  if (!sb.isEmpty()) sb.append(" ");
                                  sb.append(t);
                              }
                            }
                        } else if (val instanceof String s) {
                             String t = s.trim();
                                      if (!t.isEmpty()) {
                                      if (!sb.isEmpty()) sb.append(" ");
                                      sb.append(t);
                                  }
                        } else if (!val.getClass().isPrimitive() && !val.getClass().getName().startsWith("java.")) {
                             if (val.getClass().getName().contains("gaebviewer.schema")) {
                                 String t = extractAllText(val);
                                  if (!t.isEmpty()) {
                                     if (!sb.isEmpty()) sb.append(" ");
                                     sb.append(t);
                                 }
                             }
                        }
                    }
                } catch (Exception ex) { LOGGER.debug("Ignored reflection exception", ex); }
            }
        }
        return sb.toString().trim();
    }

    private String findAnyOutlineText(Object obj) {
        if (obj == null) return null;
        Object ot = invokeGetter(obj, "getOutlineText");
        if (ot != null) return extractOutlineText(obj);

        for (java.lang.reflect.Method m : obj.getClass().getMethods()) {
            if (m.getName().startsWith("get") && m.getName().contains("OutlineText") && m.getParameterCount() == 0) {
                try {
                    Object val = m.invoke(obj);
                    if (val != null) {
                        String t = extractAllText(val);
                        if (!t.isBlank()) return t;
                    }
                } catch (Exception ex) { LOGGER.debug("Ignored reflection exception", ex); }
            }
        }
        return null;
    }

    private String findAnyDetailText(Object obj) {
        if (obj == null) return null;
        for (java.lang.reflect.Method m : obj.getClass().getMethods()) {
            if (m.getName().startsWith("get") && (m.getName().contains("DetailTxt") || m.getName().contains("CompleteText")) && m.getParameterCount() == 0) {
                try {
                    Object val = m.invoke(obj);
                    if (val != null) {
                        String t = extractAllText(val);
                        if (!t.isBlank()) return t;
                    }
                } catch (Exception ex) { LOGGER.debug("Ignored reflection exception", ex); }
            }
        }
        return null;
    }

    private Object invokeGetter(Object target, String methodName) {
        try {
            java.lang.reflect.Method m = target.getClass().getMethod(methodName);
            return m.invoke(target);
        } catch (Exception e) {
            return null;
        }
    }

    private String invokeStringGetter(Object target, String methodName) {
        Object v = invokeGetter(target, methodName);
        return (v instanceof String s) ? s : null;
    }

    private BigDecimal invokeBigDecimalGetter(Object target, String methodName) {
        Object v = invokeGetter(target, methodName);
        if (v instanceof BigDecimal bd) return bd;
        if (v instanceof Number n) return BigDecimal.valueOf(n.doubleValue());
        return null;
    }

    /**
     * Resolves the Description object for a position element. Some item types (e.g. TgItem)
     * have no direct getDescription() accessor because JAXB collapsed their content model into
     * a catch-all getContent() list (caused by an XSD field-name collision); in that case the
     * Description element must be located inside that list instead.
     */
    private Object resolveDescription(Object cur) {
        Object description = invokeGetter(cur, "getDescription");
        if (description != null) return description;

        Object content = invokeGetter(cur, "getContent");
        if (content instanceof Collection<?> items) {
            for (Object item : items) {
                if (item instanceof JAXBElement<?> je && "Description".equals(je.getName().getLocalPart())) {
                    return je.getValue();
                }
            }
        }
        return null;
    }

    /**
     * Resolves a value element (e.g. Qty, QU, UP) for a position element. Some item types
     * (e.g. TgItem) have no direct accessor for these because JAXB collapsed their content
     * model into a catch-all getContent() list (caused by an XSD field-name collision); in
     * that case the element must be located inside that list instead.
     */
    private Object resolveContentValue(Object cur, String localName) {
        Object content = invokeGetter(cur, "getContent");
        if (content instanceof Collection<?> items) {
            for (Object item : items) {
                if (item instanceof JAXBElement<?> je && localName.equals(je.getName().getLocalPart())) {
                    return je.getValue();
                }
            }
        }
        return null;
    }

    private String resolveStringContent(Object cur, String localName) {
        Object v = resolveContentValue(cur, localName);
        return (v instanceof String s) ? s : null;
    }

    private BigDecimal resolveBigDecimalContent(Object cur, String localName) {
        Object v = resolveContentValue(cur, localName);
        if (v instanceof BigDecimal bd) return bd;
        if (v instanceof Number n) return BigDecimal.valueOf(n.doubleValue());
        return null;
    }
}
