package com.example.gaebviewer.core.vobb.service;

import com.example.gaebviewer.core.vobb.model.AusgleichZeile;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class ExcelExportService {

    public byte[] export(List<AusgleichZeile> zeilen) throws Exception {

        try (XSSFWorkbook workbook = new XSSFWorkbook();
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {

            Sheet sheet = workbook.createSheet("Ausgleich");

            int rowIndex = 0;

            // Header
            Row header = sheet.createRow(rowIndex++);
            header.createCell(0).setCellValue("OZ");
            header.createCell(1).setCellValue("Kurztext");
            header.createCell(2).setCellValue("Ausgleichsbetrag");

            // Daten
            for (AusgleichZeile zeile : zeilen) {

                Row row = sheet.createRow(rowIndex++);

                row.createCell(0).setCellValue(zeile.getOz());
                row.createCell(1).setCellValue(zeile.getKurztext());
                row.createCell(2).setCellValue(zeile.getAusgleichBetrag());
            }

            workbook.write(out);
            return out.toByteArray();
        }
    }
}
