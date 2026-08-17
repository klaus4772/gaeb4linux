package com.example.gaebviewer.ui;

import com.example.gaebviewer.application.editor.GaebEditorPersistenceService;
import com.example.gaebviewer.application.gaeb.GaebImportService;
import com.example.gaebviewer.application.gaeb.PriceNumberParser;
import com.example.gaebviewer.domain.GaebProject;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionEntity;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.theme.lumo.LumoUtility;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Large-scale editing of a GAEB LV: texts, quantities, units and Ordnungszahlen can be
 * changed freely, positions can be deleted or copied. Every change is persisted to the
 * database copy of the LV immediately - the originally uploaded file is never touched and
 * can always be downloaded byte-for-byte unchanged.
 */
@Route("editor")
public class GaebEditorView extends VerticalLayout {

    private final GaebImportService gaebImportService;
    private final GaebEditorPersistenceService editorPersistenceService;

    private final TreeGrid<GaebEditorPositionEntity> positionGrid = new TreeGrid<>();
    private final TextField ordnungszahlField = new TextField("Ordnungszahl");
    private final TextField quantityField = new TextField("Menge");
    private final TextField unitField = new TextField("Einheit");
    private final TextField unitPriceField = new TextField("Einheitspreis");
    private final TextArea shortTextField = new TextArea("Kurztext");
    private final TextArea longTextField = new TextArea("Langtext");
    private final Button saveButton = new Button("Änderungen speichern");
    private final Button deleteButton = new Button("Position löschen");
    private final Button copyButton = new Button("Position kopieren");
    private final Anchor originalDownloadAnchor = new Anchor();
    private final Button originalDownloadButton = new Button("Original-Datei herunterladen");
    private final Span documentInfo = new Span();

    private UUID currentDocumentId;
    private GaebEditorPositionEntity currentPosition;
    private String currentFileName;

    public GaebEditorView(GaebImportService gaebImportService,
                           GaebEditorPersistenceService editorPersistenceService) {
        this.gaebImportService = gaebImportService;
        this.editorPersistenceService = editorPersistenceService;

        setSizeFull();
        setPadding(true);
        setSpacing(true);
        addClassNames(LumoUtility.Padding.LARGE, LumoUtility.Gap.MEDIUM);

        H2 title = new H2("GAEB Editor");
        title.addClassNames(LumoUtility.FontSize.XLARGE, LumoUtility.Margin.Bottom.NONE);
        add(title);
        Span hint = buildHint();
        hint.addClassNames(LumoUtility.TextColor.SECONDARY);
        add(hint);

        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);
        upload.setWidthFull();
        upload.setAcceptedFileTypes(
                ".xml", ".XML",
                ".x80", ".X80", ".x81", ".X81", ".x82", ".X82", ".x83", ".X83",
                ".x84", ".X84", ".x85", ".X85", ".x86", ".X86", ".x87", ".X87"
        );
        upload.setMaxFiles(1);
        upload.addSucceededListener(event -> importFile(buffer, event.getFileName(), upload));

        originalDownloadAnchor.getElement().setAttribute("download", true);
        originalDownloadAnchor.add(originalDownloadButton);
        originalDownloadButton.setEnabled(false);
        originalDownloadButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        HorizontalLayout toolbar = new HorizontalLayout(upload, documentInfo, originalDownloadAnchor);
        toolbar.setWidthFull();
        toolbar.setAlignItems(Alignment.CENTER);
        toolbar.setFlexGrow(1, upload);
        toolbar.addClassNames(LumoUtility.Gap.MEDIUM);

        configureGrid();
        configureDetailPanel();

        HorizontalLayout actionRow = new HorizontalLayout(saveButton, copyButton, deleteButton);
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        deleteButton.addThemeVariants(ButtonVariant.LUMO_ERROR);

        HorizontalLayout numbersRow = new HorizontalLayout(ordnungszahlField, quantityField, unitField, unitPriceField);
        numbersRow.setWidthFull();

        VerticalLayout detailLayout = new VerticalLayout(numbersRow, shortTextField, longTextField, actionRow);
        detailLayout.setPadding(false);
        detailLayout.setSpacing(true);
        detailLayout.setSizeFull();
        setDetailEnabled(false);

        HorizontalLayout mainLayout = new HorizontalLayout(positionGrid, detailLayout);
        mainLayout.setSizeFull();
        mainLayout.setFlexGrow(1, positionGrid);
        mainLayout.setFlexGrow(2, detailLayout);

        add(toolbar, mainLayout);
        setFlexGrow(1, mainLayout);
    }

    private Span buildHint() {
        Span hint = new Span("Beim Hochladen wird das LV in einer Datenbank zwischengespeichert. Positionen können "
                + "hier in großem Umfang geändert, gelöscht und kopiert werden - die Original-Datei bleibt davon "
                + "unberührt und kann jederzeit unverändert heruntergeladen werden.");
        hint.getStyle().set("color", "var(--lumo-secondary-text-color)");
        return hint;
    }

    private void configureGrid() {
        positionGrid.removeAllColumns();
        positionGrid.addHierarchyColumn(GaebEditorPositionEntity::getPositionNumber)
                .setHeader("Ordnungszahl").setWidth("200px").setFlexGrow(0);
        positionGrid.addColumn(p -> nullToEmpty(p.getShortText())).setHeader("Kurztext");
        positionGrid.addColumn(p -> formatNumber(p.getQuantity())).setHeader("Menge").setWidth("110px").setFlexGrow(0);
        positionGrid.addColumn(p -> nullToEmpty(p.getUnit())).setHeader("Einheit").setWidth("90px").setFlexGrow(0);
        positionGrid.addColumn(p -> formatNumber(p.getUnitPrice())).setHeader("Einheitspreis").setWidth("130px").setFlexGrow(0);
        positionGrid.setSizeFull();

        positionGrid.addSelectionListener(event -> showPositionDetails(event.getFirstSelectedItem().orElse(null)));
    }

    private void configureDetailPanel() {
        shortTextField.setWidthFull();
        longTextField.setWidthFull();
        longTextField.setHeight("220px");

        saveButton.addClickListener(e -> saveCurrentPosition());
        deleteButton.addClickListener(e -> deleteCurrentPosition());
        copyButton.addClickListener(e -> openCopyDialog());
    }

    private void importFile(MemoryBuffer buffer, String fileName, Upload upload) {
        try {
            byte[] xmlBytes = buffer.getInputStream().readAllBytes();
            GaebProject project = gaebImportService.importGaeb(new ByteArrayInputStream(xmlBytes));

            GaebDocumentEntity document = editorPersistenceService.importDocument(xmlBytes, fileName, project);
            currentDocumentId = document.getId();
            currentFileName = fileName;

            reloadPositions();
            originalDownloadButton.setEnabled(true);
            updateOriginalDownloadResource();

            Notification.show("GAEB in den Editor geladen und in der Datenbank gespeichert.");
            upload.getElement().executeJs("this.files = []");
        } catch (Exception e) {
            Notification.show("Fehler beim Import: " + e.getMessage());
        }
    }

    private void reloadPositions() {
        if (currentDocumentId == null) {
            return;
        }
        List<GaebEditorPositionEntity> positions = editorPersistenceService.loadPositions(currentDocumentId);
        showAsHierarchy(positions);
        documentInfo.setText(currentFileName + " – " + positions.size() + " Positionen in der Datenbank");
        currentPosition = null;
        showPositionDetails(null);
    }

    private void reloadAndReselect(UUID positionId) {
        if (currentDocumentId == null) {
            return;
        }
        List<GaebEditorPositionEntity> positions = editorPersistenceService.loadPositions(currentDocumentId);
        showAsHierarchy(positions);
        documentInfo.setText(currentFileName + " – " + positions.size() + " Positionen in der Datenbank");

        positions.stream()
                .filter(p -> p.getId().equals(positionId))
                .findFirst()
                .ifPresentOrElse(positionGrid::select, () -> showPositionDetails(null));
    }

    /**
     * Derives the parent/child hierarchy from the dot-joined Ordnungszahl (e.g. "1.2.12" is
     * a child of "1.2"), same convention as the read-only GAEB viewer.
     */
    private void showAsHierarchy(List<GaebEditorPositionEntity> positions) {
        Map<String, GaebEditorPositionEntity> byNumber = new LinkedHashMap<>();
        for (GaebEditorPositionEntity p : positions) {
            if (p.getPositionNumber() != null) {
                byNumber.put(p.getPositionNumber(), p);
            }
        }

        Map<String, List<GaebEditorPositionEntity>> childrenByParentNumber = new LinkedHashMap<>();
        List<GaebEditorPositionEntity> roots = new ArrayList<>();

        for (GaebEditorPositionEntity p : positions) {
            String number = p.getPositionNumber();
            int lastDot = number == null ? -1 : number.lastIndexOf('.');
            String parentNumber = lastDot > 0 ? number.substring(0, lastDot) : null;

            if (parentNumber != null && byNumber.containsKey(parentNumber)) {
                childrenByParentNumber.computeIfAbsent(parentNumber, k -> new ArrayList<>()).add(p);
            } else {
                roots.add(p);
            }
        }

        positionGrid.setItems(roots, p -> childrenByParentNumber.getOrDefault(p.getPositionNumber(), List.of()));
    }

    private void showPositionDetails(GaebEditorPositionEntity position) {
        currentPosition = position;
        if (position == null) {
            ordnungszahlField.clear();
            quantityField.clear();
            unitField.clear();
            unitPriceField.clear();
            shortTextField.clear();
            longTextField.clear();
            setDetailEnabled(false);
            return;
        }

        ordnungszahlField.setValue(nullToEmpty(position.getPositionNumber()));
        quantityField.setValue(position.getQuantity() == null ? "" : position.getQuantity().toPlainString());
        unitField.setValue(nullToEmpty(position.getUnit()));
        unitPriceField.setValue(position.getUnitPrice() == null ? "" : position.getUnitPrice().toPlainString());
        shortTextField.setValue(nullToEmpty(position.getShortText()));
        longTextField.setValue(nullToEmpty(position.getLongText()));
        setDetailEnabled(true);
    }

    private void setDetailEnabled(boolean enabled) {
        ordnungszahlField.setEnabled(enabled);
        quantityField.setEnabled(enabled);
        unitField.setEnabled(enabled);
        unitPriceField.setEnabled(enabled);
        shortTextField.setEnabled(enabled);
        longTextField.setEnabled(enabled);
        saveButton.setEnabled(enabled);
        deleteButton.setEnabled(enabled);
        copyButton.setEnabled(enabled);
    }

    private void saveCurrentPosition() {
        if (currentPosition == null) {
            return;
        }
        Optional<BigDecimal> quantity = PriceNumberParser.parse(quantityField.getValue());
        Optional<BigDecimal> unitPrice = PriceNumberParser.parse(unitPriceField.getValue());

        UUID positionId = currentPosition.getId();
        editorPersistenceService.updatePosition(
                positionId,
                ordnungszahlField.getValue(),
                shortTextField.getValue(),
                longTextField.getValue(),
                quantity.orElse(null),
                unitField.getValue(),
                unitPrice.orElse(null));

        Notification.show("Position gespeichert.");
        reloadAndReselect(positionId);
    }

    private void deleteCurrentPosition() {
        if (currentPosition == null) {
            return;
        }
        editorPersistenceService.deletePosition(currentPosition.getId());
        Notification.show("Position gelöscht.");
        reloadPositions();
    }

    private void openCopyDialog() {
        if (currentPosition == null) {
            return;
        }

        Dialog dialog = new Dialog();
        dialog.setHeaderTitle("Position kopieren");

        TextField newNumberField = new TextField("Ordnungszahl der Kopie");
        newNumberField.setValue(nullToEmpty(currentPosition.getPositionNumber()) + "-Kopie");
        newNumberField.setWidthFull();

        Button confirm = new Button("Kopieren", e -> {
            GaebEditorPositionEntity copy = editorPersistenceService.copyPosition(
                    currentPosition.getId(), newNumberField.getValue());
            dialog.close();
            Notification.show("Position kopiert.");
            reloadAndReselect(copy.getId());
        });
        confirm.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        Button cancel = new Button("Abbrechen", e -> dialog.close());

        VerticalLayout content = new VerticalLayout(newNumberField, new HorizontalLayout(confirm, cancel));
        content.setPadding(false);
        dialog.add(content);
        dialog.open();
    }

    private void updateOriginalDownloadResource() {
        if (currentDocumentId == null) {
            originalDownloadAnchor.getElement().removeAttribute("href");
            return;
        }
        UUID documentId = currentDocumentId;
        String downloadName = currentFileName == null ? "original.xml" : currentFileName;

        StreamResource resource = new StreamResource(downloadName, () ->
                new ByteArrayInputStream(editorPersistenceService.exportOriginalBytes(documentId)));
        originalDownloadAnchor.setHref(resource);
    }

    private String formatNumber(BigDecimal value) {
        return value == null ? "" : value.toPlainString();
    }

    private String nullToEmpty(String value) {
        return value == null ? "" : value;
    }
}
