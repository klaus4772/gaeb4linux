package com.example.gaebviewer.core.vobb.csv;

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

                String lv = clean(parts[0]);
                boolean nachtrag = !clean(parts[1]).isEmpty();
                String oz = clean(parts[2]);

                double ep = parseDouble(parts[5]);
                double aufMenge = parseDouble(parts[6]);
                double rechMenge = parseDouble(parts[8]);
                double rechBetrag = parseDouble(parts[9]);

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
}
