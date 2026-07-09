package com.example.gaebviewer.infrastructure.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImporterFactory;
import com.example.gaebviewer.application.gaeb.GaebSchemaVersion;
import com.example.gaebviewer.domain.gaeb.GaebBoQ;
import com.example.gaebviewer.domain.gaeb.GaebPosition;
import com.example.gaebviewer.domain.gaeb.GaebProject;
import com.example.gaebviewer.schema.da85.TgGAEB;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.ArrayDeque;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

@Component
public class Da85JaxbImporter implements GaebImporterFactory.VersionedGaebImporter {

    private static JAXBContext CONTEXT;

    private static synchronized JAXBContext getContext() {
        if (CONTEXT == null) {
            try {
                CONTEXT = JAXBContext.newInstance("com.example.gaebviewer.schema.da85");
            } catch (Exception e) {
                throw new RuntimeException("Failed to create JAXBContext for DA85. Ensure gaeb-schema-da85 is built and ObjectFactory is present.", e);
            }
        }
        return CONTEXT;
    }

    @Override
    public GaebSchemaVersion supports() {
        return GaebSchemaVersion.DA85;
    }

    @Override
    public GaebProject importGaeb(InputStream inputStream) {
        try {
            Unmarshaller unmarshaller = getContext().createUnmarshaller();

            Object result = unmarshaller.unmarshal(inputStream);
            Object root = (result instanceof JAXBElement<?> j) ? j.getValue() : result;

            TgGAEB gaeb = (TgGAEB) root;

            GaebProject project = new GaebProject();
            project.setGaebVersion("DA85");

            GaebBoQ boq = new GaebBoQ();
            boq.setTitle("Leistungsverzeichnis");
            project.addBoQ(boq);

            var positions = extractPositions(gaeb);
            positions.forEach(boq::addPosition);

            System.out.println("DA85 extracted positions: " + positions.size());

            return project;

        } catch (Exception e) {
            throw new RuntimeException("DA85 JAXB import failed", e);
        }
    }

    private List<GaebPosition> extractPositions(Object root) {
        IdentityHashMap<Object, Boolean> visited = new IdentityHashMap<>();
        ArrayDeque<Object> queue = new ArrayDeque<>();
        queue.add(root);

        List<GaebPosition> out = new ArrayList<>();

        while (!queue.isEmpty()) {
            Object cur = queue.poll();
            if (cur == null) continue;
            if (visited.put(cur, Boolean.TRUE) != null) continue;

            if (cur instanceof JAXBElement<?> je) {
                Object val = je.getValue();
                if (val != null) queue.add(val);
                continue;
            }

            String rNoPart = invokeStringGetter(cur, "getRNoPart");
            if (rNoPart != null && !rNoPart.isBlank()) {
                GaebPosition p = new GaebPosition();
                p.setNumber(rNoPart.trim());

                String shortText = extractOutlineText(cur);
                if (shortText == null || shortText.isBlank()) {
                    shortText = findAnyOutlineText(cur);
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
                if (qty != null) p.setQuantity(qty);

                String unit = invokeStringGetter(cur, "getQU");
                if (unit != null) p.setUnit(unit);

                BigDecimal up = invokeBigDecimalGetter(cur, "getUP");
                if (up != null) p.setUnitPrice(up);

                out.add(p);
            }

            if (cur instanceof Collection<?> it) {
                for (Object x : it) if (x != null) queue.add(x);
                continue;
            }

            if (cur instanceof String || cur instanceof Number || cur instanceof Boolean || cur.getClass().isEnum()) {
                continue;
            }

            for (java.lang.reflect.Method m : cur.getClass().getMethods()) {
                if (m.getParameterCount() != 0) continue;
                if (!m.getName().startsWith("get")) continue;
                if (m.getName().equals("getClass")) continue;

                Class<?> rt = m.getReturnType();
                if (rt.isPrimitive()) continue;

                try {
                    Object val = m.invoke(cur);
                    if (val != null) queue.add(val);
                } catch (Exception ignore) {
                }
            }
        }

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

    private String extractOutlineText(Object cur) {
        String direct = invokeStringGetter(cur, "getOutlineText");
        if (direct != null) return direct.trim();

        Object val = invokeGetter(cur, "getOutlineText");
        if (val == null) return null;

        if (val instanceof Collection<?> it) {
            StringBuilder sb = new StringBuilder();
            for (Object x : it) {
                String t = extractAllText(x);
                if (t != null && !t.isBlank()) {
                    if (sb.length() > 0) sb.append("\n");
                    sb.append(t.trim());
                }
            }
            return sb.toString();
        }

        // Use extractAllText for complex objects
        return extractAllText(val);
    }
    
    private String extractLongText(Object cur) {
        Object description = invokeGetter(cur, "getDescription");
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
                    if (sb.length() > 0) sb.append("\n");
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
                    if (sb.length() > 0) sb.append(" ");
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
                                    if (sb.length() > 0) sb.append(" ");
                                    sb.append(t);
                                }
                            }
                        } else if (val instanceof String s) {
                             String t = s.trim();
                             if (!t.isEmpty()) {
                                 if (sb.length() > 0) sb.append(" ");
                                 sb.append(t);
                             }
                        } else if (!val.getClass().isPrimitive() && !val.getClass().getName().startsWith("java.")) {
                             if (val.getClass().getName().contains("gaebviewer.schema")) {
                                 String t = extractAllText(val);
                                 if (!t.isEmpty()) {
                                     if (sb.length() > 0) sb.append(" ");
                                     sb.append(t);
                                 }
                             }
                        }
                    }
                } catch (Exception ignore) {}
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
                } catch (Exception ignore) {}
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
                } catch (Exception ignore) {}
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
}
