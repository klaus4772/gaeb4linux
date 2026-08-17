package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.domain.GaebPosition;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.*;
import com.lowagie.text.pdf.draw.LineSeparator;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

/**
 * Generates a German Leistungsverzeichnis PDF from a list of {@link GaebPosition}s.
 *
 * <p>Layout (A4 portrait):
 * <ul>
 *   <li>Document header: title "Leistungsverzeichnis", project name, date</li>
 *   <li>Table columns: OZ · Beschreibung · Menge · Einh. · Einheitspreis · Gesamtpreis</li>
 *   <li>Section rows (no quantity): dark-header row spanning price columns</li>
 *   <li>Item rows: all six columns filled</li>
 *   <li>Long-text rows: small grey italic text below the item</li>
 *   <li>Sum block: Nettosumme / MwSt 19 % / Bruttosumme</li>
 * </ul>
 */
@Service
public class GaebPdfExportService {

    // -----------------------------------------------------------------------
    // Layout constants
    // -----------------------------------------------------------------------

    private static final float MARGIN = 40f;

    /** Relative column widths (total ≈ 520 pt on A4). */
    private static final float[] COL_WIDTHS = {65f, 205f, 52f, 38f, 78f, 72f};

    /** Page number prefix. */
    private static final String CELL_PADDING = "  ";

    // -----------------------------------------------------------------------
    // Colours
    // -----------------------------------------------------------------------

    private static final Color C_HEADER_BG   = new Color(0x1E, 0x60, 0x91);
    private static final Color C_HEADER_TEXT = Color.WHITE;
    private static final Color C_SECTION_BG  = new Color(0xD5, 0xE3, 0xF0);
    private static final Color C_ITEM_ALT    = new Color(0xF7, 0xF9, 0xFC);
    private static final Color C_LONGTEXT    = new Color(0x60, 0x60, 0x60);
    private static final Color C_BORDER      = new Color(0xBB, 0xCC, 0xDD);
    private static final Color C_SUM_BG      = new Color(0xE8, 0xF2, 0xFB);
    private static final Color C_SUM_TOTAL   = new Color(0x1E, 0x60, 0x91);

    // -----------------------------------------------------------------------
    // Fonts
    // -----------------------------------------------------------------------

    private static final BaseFont BASE_REGULAR;
    private static final BaseFont BASE_BOLD;

    static {
        try {
            BASE_REGULAR = BaseFont.createFont(BaseFont.HELVETICA,       BaseFont.WINANSI, false);
            BASE_BOLD    = BaseFont.createFont(BaseFont.HELVETICA_BOLD,  BaseFont.WINANSI, false);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private static Font font(BaseFont bf, float size, Color color) {
        Font f = new Font(bf, size);
        if (color != null) f.setColor(color);
        return f;
    }

    private static final Font F_DOC_TITLE    = font(BASE_BOLD,    18f, C_HEADER_BG);
    private static final Font F_DOC_META     = font(BASE_REGULAR, 9f,  new Color(0x44, 0x44, 0x44));
    private static final Font F_COL_HEADER   = font(BASE_BOLD,    8.5f, C_HEADER_TEXT);
    private static final Font F_SECTION      = font(BASE_BOLD,    9f,  new Color(0x1A, 0x40, 0x70));
    private static final Font F_ITEM         = font(BASE_REGULAR, 8.5f, null);
    private static final Font F_LONGTEXT     = font(BASE_REGULAR, 7.5f, C_LONGTEXT);
    private static final Font F_SUM_LABEL    = font(BASE_REGULAR, 9f,  null);
    private static final Font F_SUM_VALUE    = font(BASE_BOLD,    9f,  null);
    private static final Font F_SUM_TOTAL_LBL = font(BASE_BOLD,  9.5f, C_SUM_TOTAL);
    private static final Font F_SUM_TOTAL_VAL = font(BASE_BOLD,  9.5f, C_SUM_TOTAL);

    // -----------------------------------------------------------------------
    // Number formats
    // -----------------------------------------------------------------------

    private static final DecimalFormatSymbols DE = new DecimalFormatSymbols(Locale.GERMANY);

    private static String fmtQty(BigDecimal v) {
        return v == null ? "" : new DecimalFormat("#,##0.000", DE).format(v);
    }

    private static String fmtPrice(BigDecimal v) {
        return v == null ? "" : new DecimalFormat("#,##0.00", DE).format(v);
    }

    // -----------------------------------------------------------------------
    // Public API
    // -----------------------------------------------------------------------

    /**
     * Generates a PDF byte array for the given positions.
     *
     * @param positions   flat list of positions (hierarchy inferred from dot-notation numbers)
     * @param projectName shown in the document header
     */
    public byte[] export(List<GaebPosition> positions, String projectName) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            Document doc = new Document(PageSize.A4, MARGIN, MARGIN, MARGIN + 10, MARGIN);
            PdfWriter writer = PdfWriter.getInstance(doc, out);
            writer.setPageEvent(new PageFooter());
            doc.open();

            addDocHeader(doc, projectName);
            doc.add(Chunk.NEWLINE);
            doc.add(buildTable(positions));
            doc.add(Chunk.NEWLINE);
            addSumBlock(doc, positions);

            doc.close();
            return out.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("PDF-Export fehlgeschlagen", e);
        }
    }

    // -----------------------------------------------------------------------
    // Document header
    // -----------------------------------------------------------------------

    private void addDocHeader(Document doc, String projectName) throws DocumentException {
        Paragraph title = new Paragraph("Leistungsverzeichnis", F_DOC_TITLE);
        title.setSpacingAfter(4f);
        doc.add(title);

        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String meta = (projectName != null && !projectName.isBlank() ? projectName + "   |   " : "")
                + "Erstellt am: " + date;
        Paragraph metaPara = new Paragraph(meta, F_DOC_META);
        metaPara.setSpacingAfter(8f);
        doc.add(metaPara);

        // Separator line
        LineSeparator sep = new LineSeparator(1f, 100f, C_HEADER_BG, Element.ALIGN_LEFT, -2f);
        doc.add(sep);
    }

    // -----------------------------------------------------------------------
    // Main table
    // -----------------------------------------------------------------------

    private PdfPTable buildTable(List<GaebPosition> positions) throws DocumentException {
        PdfPTable table = new PdfPTable(6);
        table.setWidthPercentage(100f);
        table.setWidths(COL_WIDTHS);
        table.setSpacingBefore(6f);
        table.setHeaderRows(1);

        addTableHeader(table);

        boolean oddItem = false;
        for (GaebPosition pos : positions) {
            boolean isItem = pos.getQuantity() != null || pos.getUnitPrice() != null;

            if (isItem) {
                oddItem = !oddItem;
                addItemRow(table, pos, oddItem);
                if (pos.getLongText() != null && !pos.getLongText().isBlank()
                        && !pos.getLongText().equals(pos.getShortText())) {
                    addLongTextRow(table, pos.getLongText(), oddItem);
                }
            } else {
                oddItem = false;
                addSectionRow(table, pos);
            }
        }

        return table;
    }

    private void addTableHeader(PdfPTable table) {
        String[] labels = {"OZ", "Beschreibung", "Menge", "Einh.", "Einheitspreis", "Gesamtpreis"};
        int[] aligns = {
            Element.ALIGN_LEFT, Element.ALIGN_LEFT, Element.ALIGN_RIGHT,
            Element.ALIGN_CENTER, Element.ALIGN_RIGHT, Element.ALIGN_RIGHT
        };
        for (int i = 0; i < labels.length; i++) {
            PdfPCell cell = new PdfPCell(new Phrase(CELL_PADDING + labels[i], F_COL_HEADER));
            cell.setBackgroundColor(C_HEADER_BG);
            cell.setHorizontalAlignment(aligns[i]);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setPaddingTop(5f);
            cell.setPaddingBottom(5f);
            cell.setBorderColor(C_HEADER_BG);
            cell.setBorderWidth(0.5f);
            table.addCell(cell);
        }
    }

    private void addSectionRow(PdfPTable table, GaebPosition pos) {
        int level = dotCount(pos.getNumber());
        String indent = "  ".repeat(level);
        String label = indent + safeText(pos.getNumber()) + "   " + safeText(pos.getShortText());

        // OZ cell (number only)
        PdfPCell ozCell = styledCell(safeText(pos.getNumber()), F_SECTION, Element.ALIGN_LEFT, C_SECTION_BG);
        ozCell.setPaddingTop(4f);
        ozCell.setPaddingBottom(4f);
        table.addCell(ozCell);

        // Short text — spans remaining 5 columns
        PdfPCell textCell = styledCell(indent + safeText(pos.getShortText()), F_SECTION, Element.ALIGN_LEFT, C_SECTION_BG);
        textCell.setColspan(5);
        textCell.setPaddingTop(4f);
        textCell.setPaddingBottom(4f);
        table.addCell(textCell);
    }

    private void addItemRow(PdfPTable table, GaebPosition pos, boolean odd) {
        Color bg = odd ? Color.WHITE : C_ITEM_ALT;

        table.addCell(styledCell(safeText(pos.getNumber()), F_ITEM, Element.ALIGN_LEFT, bg));
        table.addCell(styledCell(safeText(pos.getShortText()), F_ITEM, Element.ALIGN_LEFT, bg));
        table.addCell(styledCell(fmtQty(pos.getQuantity()), F_ITEM, Element.ALIGN_RIGHT, bg));
        table.addCell(styledCell(safeText(pos.getUnit()), F_ITEM, Element.ALIGN_CENTER, bg));
        table.addCell(styledCell(fmtPrice(pos.getUnitPrice()), F_ITEM, Element.ALIGN_RIGHT, bg));

        BigDecimal total = pos.getTotalPrice();
        String totalStr = total.compareTo(BigDecimal.ZERO) == 0 ? "" : fmtPrice(total);
        table.addCell(styledCell(totalStr, F_ITEM, Element.ALIGN_RIGHT, bg));
    }

    private void addLongTextRow(PdfPTable table, String longText, boolean odd) {
        Color bg = odd ? Color.WHITE : C_ITEM_ALT;

        // Empty OZ cell
        PdfPCell empty = styledCell("", F_LONGTEXT, Element.ALIGN_LEFT, bg);
        table.addCell(empty);

        // Long text spans columns 2–6
        String truncated = longText.length() > 600 ? longText.substring(0, 600) + " …" : longText;
        PdfPCell ltCell = styledCell("      " + truncated, F_LONGTEXT, Element.ALIGN_LEFT, bg);
        ltCell.setColspan(5);
        ltCell.setPaddingBottom(4f);
        table.addCell(ltCell);
    }

    // -----------------------------------------------------------------------
    // Sum block
    // -----------------------------------------------------------------------

    private void addSumBlock(Document doc, List<GaebPosition> positions) throws DocumentException {
        BigDecimal netto = positions.stream()
                .map(GaebPosition::getTotalPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal mwst   = netto.multiply(new BigDecimal("0.19")).setScale(2, java.math.RoundingMode.HALF_UP);
        BigDecimal brutto = netto.add(mwst);

        PdfPTable sumTable = new PdfPTable(3);
        sumTable.setWidthPercentage(45f);
        sumTable.setHorizontalAlignment(Element.ALIGN_RIGHT);
        sumTable.setWidths(new float[]{80f, 10f, 60f});

        addSumRow(sumTable, "Nettosumme", fmtPrice(netto) + " EUR", F_SUM_LABEL, F_SUM_VALUE, C_SUM_BG);
        addSumRow(sumTable, "MwSt 19 %",  fmtPrice(mwst)  + " EUR", F_SUM_LABEL, F_SUM_VALUE, C_SUM_BG);

        // Thick separator
        addSumSeparator(sumTable);

        addSumRow(sumTable, "Bruttosumme", fmtPrice(brutto) + " EUR", F_SUM_TOTAL_LBL, F_SUM_TOTAL_VAL, new Color(0xD0, 0xE8, 0xF8));

        doc.add(sumTable);
    }

    private void addSumRow(PdfPTable t, String label, String value,
                           Font labelFont, Font valueFont, Color bg) {
        PdfPCell lbl = new PdfPCell(new Phrase(label, labelFont));
        lbl.setHorizontalAlignment(Element.ALIGN_LEFT);
        lbl.setBackgroundColor(bg);
        lbl.setBorderColor(C_BORDER);
        lbl.setPadding(4f);
        t.addCell(lbl);

        PdfPCell sep = new PdfPCell(new Phrase("", labelFont));
        sep.setBackgroundColor(bg);
        sep.setBorderColor(C_BORDER);
        t.addCell(sep);

        PdfPCell val = new PdfPCell(new Phrase(value, valueFont));
        val.setHorizontalAlignment(Element.ALIGN_RIGHT);
        val.setBackgroundColor(bg);
        val.setBorderColor(C_BORDER);
        val.setPadding(4f);
        t.addCell(val);
    }

    private void addSumSeparator(PdfPTable t) {
        for (int i = 0; i < 3; i++) {
            PdfPCell sep = new PdfPCell();
                sep.setBorder(com.lowagie.text.Rectangle.TOP);
            sep.setBorderColorTop(C_SUM_TOTAL);
            sep.setBorderWidthTop(1.5f);
            sep.setFixedHeight(2f);
            t.addCell(sep);
        }
    }

    // -----------------------------------------------------------------------
    // Cell helpers
    // -----------------------------------------------------------------------

    private PdfPCell styledCell(String text, Font font, int alignment, Color bg) {
        PdfPCell cell = new PdfPCell(new Phrase(CELL_PADDING + text, font));
        cell.setHorizontalAlignment(alignment);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(bg);
        cell.setBorderColor(C_BORDER);
        cell.setBorderWidth(0.4f);
        cell.setPaddingTop(3f);
        cell.setPaddingBottom(3f);
        return cell;
    }

    private static int dotCount(String number) {
        if (number == null) return 0;
        int count = 0;
        for (char c : number.toCharArray()) if (c == '.') count++;
        return count;
    }

    private static String safeText(String s) {
        return s == null ? "" : s;
    }

    // -----------------------------------------------------------------------
    // Page footer
    // -----------------------------------------------------------------------

    private static class PageFooter extends PdfPageEventHelper {
        private final Font footerFont = font(BASE_REGULAR, 7.5f, new Color(0x88, 0x88, 0x88));

        @Override
        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte cb = writer.getDirectContent();
            cb.saveState();
            String text = "Seite " + writer.getPageNumber();
            float x = (document.left() + document.right()) / 2;
            float y = document.bottom() - 15f;
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    new Phrase(text, footerFont), x, y, 0);
            cb.restoreState();
        }
    }
}
