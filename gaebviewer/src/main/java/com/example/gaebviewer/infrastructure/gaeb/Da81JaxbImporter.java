package com.example.gaebviewer.infrastructure.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImporterFactory;
import com.example.gaebviewer.application.gaeb.GaebSchemaVersion;
import com.example.gaebviewer.domain.gaeb.GaebBoQ;
import com.example.gaebviewer.domain.gaeb.GaebPosition;
import com.example.gaebviewer.domain.gaeb.GaebProject;
import com.example.gaebviewer.schema.da81.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.math.BigDecimal;

@Component
public class Da81JaxbImporter implements GaebImporterFactory.VersionedGaebImporter {

    // ⚠️ JAXBContext ist teuer → einmal erzeugen
    private static final JAXBContext CONTEXT = createContext();

    private static JAXBContext createContext() {
        try {
            return JAXBContext.newInstance("com.example.gaebviewer.schema.da81");
        } catch (Exception e) {
            throw new RuntimeException("Failed to create JAXBContext for DA81", e);
        }
    }

    @Override
    public GaebSchemaVersion supports() {
        return GaebSchemaVersion.DA81;
    }

    @Override
    public GaebProject importGaeb(InputStream inputStream) {
        try {
            Unmarshaller unmarshaller = CONTEXT.createUnmarshaller();

            Object result = unmarshaller.unmarshal(inputStream);
            Object root = (result instanceof jakarta.xml.bind.JAXBElement<?> j) ? j.getValue() : result;

            TgGAEB2 gaeb = (TgGAEB2) root;

            GaebProject project = new GaebProject();
            project.setGaebVersion("DA81");

            GaebBoQ boq = new GaebBoQ();
            boq.setTitle("Leistungsverzeichnis");
            project.addBoQ(boq);

            var positions = extractPositions(gaeb);
            positions.forEach(boq::addPosition);

            System.out.println("DA81 extracted positions: " + positions.size());

            return project;

        } catch (Exception e) {
            throw new RuntimeException("DA81 JAXB import failed", e);
        }
    }

    private int countObjectsByClassNameContains(Object root, String needle) {
        java.util.IdentityHashMap<Object, Boolean> visited = new java.util.IdentityHashMap<>();
        java.util.ArrayDeque<Object> queue = new java.util.ArrayDeque<>();
        queue.add(root);

        int count = 0;

        while (!queue.isEmpty()) {
            Object cur = queue.poll();
            if (cur == null) continue;
            if (visited.put(cur, Boolean.TRUE) != null) continue;

            String cn = cur.getClass().getSimpleName();
            if (cn.contains(needle)) count++;

            // Primitive wrappers / Strings überspringen
            if (cur instanceof String
                    || cur instanceof Number
                    || cur instanceof Boolean
                    || cur.getClass().isEnum()) {
                continue;
            }

            // Listen/Collections
            if (cur instanceof java.lang.Iterable<?> it) {
                for (Object x : it) queue.add(x);
                continue;
            }

            // JAXBElements
            if (cur instanceof jakarta.xml.bind.JAXBElement<?> je) {
                queue.add(je.getValue());
                continue;
            }

            // Alle Getter/Fields grob traversieren (nur public getters ohne Params)
            for (java.lang.reflect.Method m : cur.getClass().getMethods()) {
                if (m.getParameterCount() != 0) continue;
                if (!m.getName().startsWith("get")) continue;
                if (m.getName().equals("getClass")) continue;

                Class<?> rt = m.getReturnType();
                // zu viel Müll vermeiden
                if (rt.isPrimitive()) continue;

                try {
                    Object val = m.invoke(cur);
                    if (val == null) continue;

                    // String/Number etc skippt oben
                    queue.add(val);
                } catch (Exception ignore) {
                }
            }
        }

        return count;
    }
    private java.util.List<GaebPosition> extractPositions(Object root) {
        java.util.IdentityHashMap<Object, Boolean> visited = new java.util.IdentityHashMap<>();
        java.util.ArrayDeque<Object> queue = new java.util.ArrayDeque<>();
        queue.add(root);

        java.util.List<GaebPosition> out = new java.util.ArrayList<>();

        while (!queue.isEmpty()) {
            Object cur = queue.poll();
            if (cur == null) continue;
            if (visited.put(cur, Boolean.TRUE) != null) continue;

            // JAXBElement unwrap
            if (cur instanceof jakarta.xml.bind.JAXBElement<?> je) {
                queue.add(je.getValue());
                continue;
            }

            // Kandidat: hat getRNoPart()
            String rNoPart = invokeStringGetter(cur, "getRNoPart");
            if (rNoPart != null && !rNoPart.isBlank()) {
                GaebPosition p = new GaebPosition();
                p.setNumber(rNoPart.trim());

                // ShortText (häufig OutlineText)
                String shortText = extractOutlineText(cur);
                if (shortText != null && !shortText.isBlank()) {
                    p.setShortText(shortText);
                    // fürs Grid erstmal auch als LongText verwenden
                    p.setLongText(shortText);
                }

                // Qty / QU / UP
                java.math.BigDecimal qty = invokeBigDecimalGetter(cur, "getQty");
                if (qty != null) p.setQuantity(qty);

                String unit = invokeStringGetter(cur, "getQU");
                if (unit != null) p.setUnit(unit);

                java.math.BigDecimal up = invokeBigDecimalGetter(cur, "getUP");
                if (up != null) p.setUnitPrice(up);

                out.add(p);
            }

            // Traversiere weiter durch Getter
            if (cur instanceof Iterable<?> it) {
                for (Object x : it) queue.add(x);
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

        // Duplikate nach number entfernen (kommt bei so einem Graph-Scan manchmal vor)
        return out.stream()
                .collect(java.util.stream.Collectors.toMap(
                        GaebPosition::getNumber,
                        p -> p,
                        (a, b) -> a,
                        java.util.LinkedHashMap::new
                ))
                .values()
                .stream()
                .toList();
    }

    private String extractOutlineText(Object cur) {
        // 1) direkter Getter getOutlineText(): String
        String direct = invokeStringGetter(cur, "getOutlineText");
        if (direct != null) return direct.trim();

        // 2) getOutlineText() liefert evtl. Liste oder komplexen Typ
        Object val = invokeGetter(cur, "getOutlineText");
        if (val == null) return null;

        if (val instanceof Iterable<?> it) {
            StringBuilder sb = new StringBuilder();
            for (Object x : it) {
                String t = x == null ? null : x.toString();
                if (t != null && !t.isBlank()) {
                    if (!sb.isEmpty()) sb.append("\n");
                    sb.append(t.trim());
                }
            }
            return sb.toString();
        }

        return val.toString();
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

    private java.math.BigDecimal invokeBigDecimalGetter(Object target, String methodName) {
        Object v = invokeGetter(target, methodName);
        if (v instanceof java.math.BigDecimal bd) return bd;
        if (v instanceof Number n) return java.math.BigDecimal.valueOf(n.doubleValue());
        return null;
    }
}