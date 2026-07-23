package com.example.gaebviewer.ui.gaeb;

import com.example.gaebviewer.application.gaeb.GaebExportService;
import com.example.gaebviewer.application.gaeb.GaebFormatConverter;
import com.example.gaebviewer.application.gaeb.GaebImportService;
import com.example.gaebviewer.application.gaeb.GaebSchemaVersion;
import com.example.gaebviewer.domain.GaebPosition;
import com.example.gaebviewer.domain.GaebProject;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Route("gaeb")
public class GaebView extends VerticalLayout {

    private static final Logger LOGGER = LoggerFactory.getLogger(GaebView.class);

    private final GaebImportService gaebImportService;
    private final GaebExportService gaebExportService;
    private final GaebFormatConverter gaebFormatConverter;
    private final TreeGrid<GaebPosition> positionGrid = new TreeGrid<>();
    private final TextField numberDisplay = new TextField("Positionsnummer");
    private final TextField quantityDisplay = new TextField("Menge");
    private final TextField unitDisplay = new TextField("Einheit");
    private final TextField unitPriceDisplay = new TextField("Einheitspreis");
    private final TextField totalPriceDisplay = new TextField("Gesamtpreis");
    private final TextField lvSumDisplay = new TextField("LV-Summe");
    private final TextArea shortTextDisplay = new TextArea("Short Text");
    private final TextArea longTextDisplay = new TextArea("Long Text");

    /** Die aktuell ausgewählte Position — Träger des temporären Speichers. */
    private GaebPosition currentPosition;

    /** Alle Positionen der geladenen Datei — Basis für die LV-Summenberechnung. */
    private List<GaebPosition> allPositions = new ArrayList<>();

    /** Originale XML-Bytes der zuletzt geladenen Datei — Basis für den Export. */
    private byte[] currentXmlBytes;

    /** Dateiname der zuletzt geladenen Datei. */
    private String currentFileName;

    public GaebView(GaebImportService gaebImportService,
                    GaebExportService gaebExportService,
                    GaebFormatConverter gaebFormatConverter) {

        this.gaebImportService = gaebImportService;
        this.gaebExportService = gaebExportService;
        this.gaebFormatConverter = gaebFormatConverter;

        setSizeFull();
        setPadding(true);
        setSpacing(true);

        add(new H2("GAEB XML Viewer"));

        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);
        upload.setWidthFull();

        upload.setAcceptedFileTypes(
                ".xml", ".XML",
                ".x80", ".X80",
                ".x81", ".X81",
                ".x82", ".X82",
                ".x83", ".X83",
                ".x84", ".X84",
                ".x85", ".X85",
                ".x86", ".X86",
                ".x87", ".X87"
        );

        upload.setMaxFiles(1);

        // Download-Button — wird erst nach erfolgreichem Datei-Import aktiviert
        Button saveButton = new Button("Speichern", VaadinIcon.DOWNLOAD.create());
        saveButton.setEnabled(false);

        // Zielformat-Auswahl
        List<GaebSchemaVersion> supportedFormats = Arrays.stream(GaebSchemaVersion.values())
                .filter(v -> v != GaebSchemaVersion.UNKNOWN)
                .collect(Collectors.toList());

        Select<GaebSchemaVersion> formatSelect = new Select<>();
        formatSelect.setLabel("Zielformat");
        formatSelect.setItems(supportedFormats);
        formatSelect.setItemLabelGenerator(v -> "DA" + v.getDaNumber() + " (" + v.getFileExtension() + ")");
        formatSelect.setEnabled(false);

        Span sourceFormatLabel = new Span();
        sourceFormatLabel.getStyle()
                .set("font-size", "var(--lumo-font-size-s)")
                .set("color", "var(--lumo-secondary-text-color)")
                .set("align-self", "center")
                .set("white-space", "nowrap");

        Anchor downloadAnchor = new Anchor();
        downloadAnchor.getElement().setAttribute("download", true);
        downloadAnchor.add(saveButton);

        // Format-Änderung → StreamResource sofort aktualisieren (einmalig registrieren!)
        formatSelect.addValueChangeListener(e -> updateDownloadResource(downloadAnchor, formatSelect));

        HorizontalLayout toolbar = new HorizontalLayout(upload, sourceFormatLabel, formatSelect, downloadAnchor);
        toolbar.setWidthFull();
        toolbar.setAlignItems(Alignment.END);
        toolbar.setFlexGrow(1, upload);

        upload.addSucceededListener(event -> {
            try {
                // Bytes zuerst puffern, damit sie für den Export wieder verfügbar sind
                byte[] xmlBytes = buffer.getInputStream().readAllBytes();
                String fileName = event.getFileName();

                GaebProject project = gaebImportService.importGaeb(new ByteArrayInputStream(xmlBytes));

                List<GaebPosition> positionen = project.getBoqs().isEmpty()
                        ? List.of()
                        : project.getBoqs().get(0).getPositions();

                showAsHierarchy(positionen);
                allPositions = new ArrayList<>(positionen);
                currentXmlBytes = xmlBytes;
                currentFileName = fileName;
                updateLvSum();

                // Quellformat erkennen und anzeigen
                GaebSchemaVersion detectedVersion = GaebSchemaVersion.fromString(project.getGaebVersion());
                sourceFormatLabel.setText("Quellformat: " + (detectedVersion == GaebSchemaVersion.UNKNOWN
                        ? "unbekannt"
                        : "DA" + detectedVersion.getDaNumber()));
                formatSelect.setValue(detectedVersion == GaebSchemaVersion.UNKNOWN
                        ? GaebSchemaVersion.DA86   // sinnvoller Fallback
                        : detectedVersion);
                formatSelect.setEnabled(true);

                // StreamResource liest beim Download den aktuellen Stand (Preise + Zielformat)
                updateDownloadResource(downloadAnchor, formatSelect);
                saveButton.setEnabled(true);

                Notification.show("GAEB erfolgreich geladen. (" + positionen.size() + " Positionen)");
                upload.getElement().executeJs("this.files = []");
            } catch (Exception e) {
                Notification.show("Fehler beim Import: " + e.getMessage());
            }
        });

        positionGrid.removeAllColumns();
        positionGrid.addHierarchyColumn(GaebPosition::getNumber).setHeader("No.").setWidth("220px").setFlexGrow(0);
        positionGrid.addColumn(p -> p.getShortText() == null ? "" : p.getShortText()).setHeader("Short Text");
        positionGrid.setSizeFull();

        positionGrid.addSelectionListener(event -> {
            currentPosition = event.getFirstSelectedItem().orElse(null);
            if (currentPosition != null) {
                numberDisplay.setValue(currentPosition.getNumber() == null ? "" : currentPosition.getNumber());
                quantityDisplay.setValue(currentPosition.getQuantity() == null ? "" : currentPosition.getQuantity().toPlainString());
                unitDisplay.setValue(currentPosition.getUnit() == null ? "" : currentPosition.getUnit());
                unitPriceDisplay.setValue(currentPosition.getUnitPrice() == null ? "" : currentPosition.getUnitPrice().toPlainString());
                totalPriceDisplay.setValue(currentPosition.getTotalPrice().toPlainString());
                shortTextDisplay.setValue(currentPosition.getShortText() == null ? "" : currentPosition.getShortText());
                longTextDisplay.setValue(currentPosition.getLongText() == null ? "" : currentPosition.getLongText());
            } else {
                numberDisplay.clear();
                quantityDisplay.clear();
                unitDisplay.clear();
                unitPriceDisplay.clear();
                totalPriceDisplay.clear();
                shortTextDisplay.clear();
                longTextDisplay.clear();
            }
        });

        unitPriceDisplay.addValueChangeListener(event -> {
            if (currentPosition == null || !event.isFromClient()) return;
            String raw = event.getValue().trim().replace(",", ".");
            try {
                BigDecimal newPrice = new BigDecimal(raw);
                currentPosition.setUnitPrice(newPrice);
                totalPriceDisplay.setValue(currentPosition.getTotalPrice().toPlainString());
                updateLvSum();
            } catch (NumberFormatException ignored) {
                // Ungültige Eingabe: Feld bleibt unverändert, Position unberührt
            }
        });

        numberDisplay.setReadOnly(true);
        quantityDisplay.setReadOnly(true);
        unitDisplay.setReadOnly(true);
        totalPriceDisplay.setReadOnly(true);
        lvSumDisplay.setReadOnly(true);
        totalPriceDisplay.setWidthFull();
        lvSumDisplay.setWidthFull();

        HorizontalLayout positionInfoRow = new HorizontalLayout(
                numberDisplay, quantityDisplay, unitDisplay, unitPriceDisplay);
        positionInfoRow.setWidthFull();
        positionInfoRow.setFlexGrow(2, numberDisplay);
        positionInfoRow.setFlexGrow(1, quantityDisplay);
        positionInfoRow.setFlexGrow(1, unitDisplay);
        positionInfoRow.setFlexGrow(1, unitPriceDisplay);

        shortTextDisplay.setReadOnly(true);
        shortTextDisplay.setWidthFull();
        shortTextDisplay.setHeight("200px");
        longTextDisplay.setReadOnly(true);
        longTextDisplay.setWidthFull();
        longTextDisplay.setHeight("400px");

        VerticalLayout priceColumn = new VerticalLayout(totalPriceDisplay, lvSumDisplay);
        priceColumn.setPadding(false);
        priceColumn.setSpacing(true);

        HorizontalLayout shortTextRow = new HorizontalLayout(shortTextDisplay, priceColumn);
        shortTextRow.setWidthFull();
        shortTextRow.setFlexGrow(4, shortTextDisplay);
        shortTextRow.setFlexGrow(1, priceColumn);

        VerticalLayout detailLayout = new VerticalLayout(positionInfoRow, shortTextRow, longTextDisplay);
        detailLayout.setSizeFull();
        detailLayout.setPadding(false);
        detailLayout.setSpacing(true);

        HorizontalLayout mainLayout = new HorizontalLayout(positionGrid, detailLayout);
        mainLayout.setSizeFull();
        mainLayout.setFlexGrow(1, positionGrid);
        mainLayout.setFlexGrow(2, detailLayout);

        add(toolbar, mainLayout);
        setFlexGrow(1, mainLayout);
    }

    /**
     * Builds a fresh {@link StreamResource} for the current XML bytes, applying price
     * edits and converting to the selected target format, then assigns it to the anchor.
     */
    private void updateDownloadResource(Anchor downloadAnchor, Select<GaebSchemaVersion> formatSelect) {
        GaebSchemaVersion targetVersion = formatSelect.getValue();
        if (targetVersion == null || currentXmlBytes == null) return;

        String baseName = stripExtension(currentFileName);
        String downloadName = baseName + targetVersion.getFileExtension();

        StreamResource resource = new StreamResource(downloadName, () -> {
            try {
                byte[] withPrices = gaebExportService.exportWithPrices(currentXmlBytes, allPositions);
                byte[] converted = gaebFormatConverter.convert(withPrices, targetVersion);
                return new ByteArrayInputStream(converted);
            } catch (Exception ex) {
                LOGGER.error("Export fehlgeschlagen", ex);
                return new ByteArrayInputStream(currentXmlBytes);
            }
        });
        downloadAnchor.setHref(resource);
    }

    /** Removes the last file extension (e.g. {@code "project.x86"} → {@code "project"}). */
    private String stripExtension(String fileName) {
        if (fileName == null) return "export";
        int dot = fileName.lastIndexOf('.');
        return dot > 0 ? fileName.substring(0, dot) : fileName;
    }

    /**
     * Derives the parent/child hierarchy from the dot-joined position numbers
     * (e.g. "1.2.12" is a child of "1.2") and feeds it into the TreeGrid so
     * only the top hierarchy level is shown initially; deeper levels are
     * revealed by expanding each node.
     */
    private void showAsHierarchy(List<GaebPosition> positionen) {
        Map<String, GaebPosition> byNumber = new LinkedHashMap<>();
        for (GaebPosition p : positionen) {
            byNumber.put(p.getNumber(), p);
        }

        Map<String, List<GaebPosition>> childrenByParentNumber = new LinkedHashMap<>();
        List<GaebPosition> roots = new ArrayList<>();

        for (GaebPosition p : positionen) {
            String number = p.getNumber();
            int lastDot = number == null ? -1 : number.lastIndexOf('.');
            String parentNumber = lastDot > 0 ? number.substring(0, lastDot) : null;

            if (parentNumber != null && byNumber.containsKey(parentNumber)) {
                childrenByParentNumber.computeIfAbsent(parentNumber, k -> new ArrayList<>()).add(p);
            } else {
                roots.add(p);
            }
        }

        positionGrid.setItems(roots,
                p -> childrenByParentNumber.getOrDefault(p.getNumber(), List.of()));
    }

    /** Summiert die Gesamtpreise aller Positionen und zeigt das Ergebnis im LV-Summen-Feld. */
    private void updateLvSum() {
        BigDecimal sum = allPositions.stream()
                .map(GaebPosition::getTotalPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        lvSumDisplay.setValue(sum.toPlainString());
    }
}