package com.example.gaebviewer.infrastructure.vobb;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvImportService {

    public List<CsvRow> importCsv(InputStream inputStream) {

        List<CsvRow> rows = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.ISO_8859_1))) {

            String line;
            boolean header = true;

            while ((line = reader.readLine()) != null) {

                if (header) {
                    header = false;
                    continue;
                }

                String[] parts = line.split(";");
                // Sicherstellen, dass die erwartete Anzahl an Spalten vorhanden ist
                int len = parts.length;
                String lv = len > 0 ? clean(parts[0]) : "";
                boolean nachtrag = len > 1 && !clean(parts[1]).isEmpty();
                String oz = len > 2 ? clean(parts[2]) : "";

                double ep = len > 5 ? parseDoubleSafe(parts[5]) : 0.0;
                double aufMenge = len > 6 ? parseDoubleSafe(parts[6]) : 0.0;
                double rechMenge = len > 8 ? parseDoubleSafe(parts[8]) : 0.0;
                double rechBetrag = len > 9 ? parseDoubleSafe(parts[9]) : 0.0;

                rows.add(new CsvRow(
                        lv,
                        nachtrag,
                        oz,
                        ep,
                        aufMenge,
                        rechMenge,
                        rechBetrag
                ));
            }

        } catch (Exception e) {
            throw new RuntimeException("Fehler beim CSV Import", e);
        }

        return rows;
    }

    private String clean(String value) {
        if (value == null) return "";
        return value.replace("'", "").trim();
    }

    private double parseDouble(String value) {

        String cleaned = clean(value);

        if (cleaned.isEmpty()) {
            return 0.0;
        }

        cleaned = cleaned.replace(",", ".");

        return Double.parseDouble(cleaned);
    }

    // Wrapper, der NumberFormatException abfängt und defensiv 0.0 zurückgibt
    private double parseDoubleSafe(String value) {
        try {
            return parseDouble(value);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
