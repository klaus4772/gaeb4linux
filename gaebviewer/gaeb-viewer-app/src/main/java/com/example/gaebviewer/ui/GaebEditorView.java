package com.example.gaebviewer.ui;

import com.example.gaebviewer.application.editor.EditorApplicationService;
import com.example.gaebviewer.application.editor.GaebEditorSettingsService;
import com.example.gaebviewer.application.editor.GaebMasterDataService;
import com.example.gaebviewer.application.editor.NamedMasterData;
import com.example.gaebviewer.application.editor.NewLvCreationCommand;
import com.example.gaebviewer.application.editor.NewLvOzLevelCommand;
import com.example.gaebviewer.application.editor.PositionCreateCommand;
import com.example.gaebviewer.application.editor.PositionUpdateCommand;
import com.example.gaebviewer.application.editor.ProjectNumberService;
import com.example.gaebviewer.application.gaeb.PriceNumberParser;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorTextComplementEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.SettingOptionKey;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.theme.lumo.LumoUtility;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Route("editor")
public class GaebEditorView extends VerticalLayout implements BeforeEnterObserver {

    private final EditorApplicationService editorApplicationService;
    private final GaebEditorSettingsService settingsService;
    private final GaebMasterDataService masterDataService;
    private final ProjectNumberService projectNumberService;

    private final TreeGrid<GaebEditorPositionEntity> positionGrid = new TreeGrid<>();
    private final TextField ordnungszahlField = new TextField("Ordnungszahl");
    private final TextField quantityField = new TextField("Menge");
    private final TextField unitField = new TextField("Einheit");
    private final TextField unitPriceField = new TextField("Einheitspreis");
    private final TextArea shortTextField = new TextArea("Kurztext");
    private final TextArea longTextField = new TextArea("Langtext");
    private final TextArea textAdditionField = new TextArea("Textergänzung");
    private final Button saveButton = new Button("Änderungen speichern");
    private final Button addButton = new Button("Position hinzufügen");
    private final Button deleteButton = new Button("Position löschen");
    private final Button copyButton = new Button("Position kopieren");
    private final Anchor originalDownloadAnchor = new Anchor();
    private final Button originalDownloadButton = new Button("Original-Datei herunterladen");
    private final Anchor workingDownloadAnchor = new Anchor();
    private final Button workingDownloadButton = new Button("Arbeitsstand herunterladen");
    private final Span documentInfo = new Span();
    private final Span stateInfo = new Span();
    private final Checkbox editableCheckbox = new Checkbox("LV änderbar", true);
    private final Button newLvButton = new Button("Neues LV erstellen");

    private UUID currentDocumentId;
    private GaebEditorPositionEntity currentPosition;
    private String currentFileName;
    private boolean currentDocumentEditable = true;
    private boolean suppressEditableChangeEvent = false;

    public GaebEditorView(EditorApplicationService editorApplicationService,
                          GaebEditorSettingsService settingsService,
                          GaebMasterDataService masterDataService,
                          ProjectNumberService projectNumberService) {
        this.editorApplicationService = editorApplicationService;
        this.settingsService = settingsService;
        this.masterDataService = masterDataService;
        this.projectNumberService = projectNumberService;

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
        workingDownloadAnchor.getElement().setAttribute("download", true);
        workingDownloadAnchor.add(workingDownloadButton);
        workingDownloadButton.setEnabled(false);
        workingDownloadButton.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        newLvButton.addClickListener(e -> openNewLvDialog());
        editableCheckbox.addValueChangeListener(e -> onEditableModeToggle(e.getValue()));

        HorizontalLayout toolbar = new HorizontalLayout(
                upload, editableCheckbox, newLvButton, stateInfo, documentInfo, originalDownloadAnchor, workingDownloadAnchor);
        toolbar.setWidthFull();
        toolbar.setAlignItems(Alignment.CENTER);
        toolbar.setFlexGrow(1, upload);
        toolbar.addClassNames(LumoUtility.Gap.MEDIUM);

        configureGrid();
        configureDetailPanel();

        HorizontalLayout actionRow = new HorizontalLayout(saveButton, addButton, copyButton, deleteButton);
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        addButton.addThemeVariants(ButtonVariant.LUMO_SUCCESS);
        deleteButton.addThemeVariants(ButtonVariant.LUMO_ERROR);

        HorizontalLayout numbersRow = new HorizontalLayout(ordnungszahlField, quantityField, unitField, unitPriceField);
        numbersRow.setWidthFull();

        VerticalLayout detailLayout = new VerticalLayout(numbersRow, shortTextField, longTextField, textAdditionField, actionRow);
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
        setUiState("saved");
    }

    private Span buildHint() {
        Span hint = new Span("Import legt ein Projekt mit Projektnummer an. Bei nicht änderbarem LV sind nur "
                + "Einheitspreis und Textergänzung bearbeitbar. Neues LV enthält Assistent für Metadaten und OZ-Struktur.");
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
        textAdditionField.setWidthFull();
        longTextField.setHeight("180px");
        textAdditionField.setHeight("120px");

        saveButton.addClickListener(e -> saveCurrentPosition());
        deleteButton.addClickListener(e -> deleteCurrentPosition());
        copyButton.addClickListener(e -> openCopyDialog());
        addButton.addClickListener(e -> openAddDialog());
    }

    private void importFile(MemoryBuffer buffer, String fileName, Upload upload) {
        setUiState("loading");
        try {
            byte[] xmlBytes = buffer.getInputStream().readAllBytes();
            GaebDocumentEntity document = editorApplicationService.importProject(
                    xmlBytes, fileName, editableCheckbox.getValue());
            currentDocumentId = document.getId();
            currentFileName = fileName;
            currentDocumentEditable = document.isEditable();

            reloadPositions();
            originalDownloadButton.setEnabled(true);
            updateOriginalDownloadResource();
            workingDownloadButton.setEnabled(true);
            updateWorkingDownloadResource();

            Notification.show("Projekt " + document.getProjectNumber() + " importiert.");
            setUiState(document.isEditable() ? "editable" : "readOnly");
            upload.getElement().executeJs("this.files = []");
        } catch (Exception e) {
            setUiState("importError");
            Notification.show("Fehler beim Import: " + e.getMessage());
        }
    }

    private void openNewLvDialog() {
        Dialog dialog = new Dialog();
        dialog.setHeaderTitle("Neues LV erstellen");
        dialog.setWidth("1100px");
        dialog.setHeight("85vh");

        TextField prjIdField = new TextField("PrjID");
        prjIdField.setReadOnly(true);
        prjIdField.setValue(projectNumberService.previewNextProjectNumber());
        TextField namePrjField = new TextField("NamePrj");
        TextArea lblPrjField = new TextArea("LblPrj");
        lblPrjField.setHeight("90px");
        TextField boqIdField = new TextField("BoQID");
        boqIdField.setValue("1");

        Select<String> nameSelect = selectWithOptions("Name", loadOptionValues(SettingOptionKey.NAME));
        Select<String> lblBoqSelect = selectWithOptions("LblBoQ", loadOptionValues(SettingOptionKey.LBL_BOQ));
        Select<String> curSelect = selectWithOptions("Cur", loadOptionValues(SettingOptionKey.CUR));
        Select<String> curLblSelect = selectWithOptions("CurLbl", loadOptionValues(SettingOptionKey.CUR_LBL));
        Select<String> cpvCodeSelect = selectWithOptions("CPVCode", loadOptionValues(SettingOptionKey.CPV_CODE));
        Select<String> catSelect = selectWithOptions("Cat", loadOptionValues(SettingOptionKey.CAT));

        Select<NamedMasterData> ownerSelect = createMasterDataSelect("OWN", masterDataService.loadOwners());
        TextField newOwnerField = new TextField("Neuer Auftraggeber");
        Button createOwnerButton = new Button("OWN neu anlegen", e -> {
            NamedMasterData created = masterDataService.createOwner(newOwnerField.getValue());
            ownerSelect.setItems(masterDataService.loadOwners());
            ownerSelect.setValue(created);
            newOwnerField.clear();
        });

        Select<NamedMasterData> siteSelect = createMasterDataSelect("CnstSite", masterDataService.loadConstructionSites());
        TextField newSiteField = new TextField("Neuer Baustellenort");
        Button createSiteButton = new Button("CnstSite neu anlegen", e -> {
            NamedMasterData created = masterDataService.createConstructionSite(newSiteField.getValue());
            siteSelect.setItems(masterDataService.loadConstructionSites());
            siteSelect.setValue(created);
            newSiteField.clear();
        });

        Select<NamedMasterData> requesterSelect = createMasterDataSelect("Requester", masterDataService.loadRequesters());
        TextField newRequesterField = new TextField("Neuer Requester");
        Button createRequesterButton = new Button("Requester neu anlegen", e -> {
            NamedMasterData created = masterDataService.createRequester(newRequesterField.getValue());
            requesterSelect.setItems(masterDataService.loadRequesters());
            requesterSelect.setValue(created);
            newRequesterField.clear();
        });

        DatePicker bidDateField = new DatePicker("BidDate");
        DatePicker openDateField = new DatePicker("OpenDate");
        TimePicker openTimeField = new TimePicker("OpenTime");
        DatePicker cnstStartField = new DatePicker("CnstStart");
        DatePicker cnstEndField = new DatePicker("CnstEnd");
        DatePicker evalEndField = new DatePicker("EvalEnd");

        TextField submLocField = new TextField("SubmLoc");
        TextField warrDurField = new TextField("WarrDur");
        TextField warrUnitField = new TextField("WarrUnit");
        TextField contrNoField = new TextField("ContrNo");
        DatePicker contrDateField = new DatePicker("ContrDate");

        IntegerField hierarchyLevelCountField = new IntegerField("Anzahl Hierarchiestufen");
        hierarchyLevelCountField.setMin(1);
        hierarchyLevelCountField.setValue(1);

        VerticalLayout ozLevelsLayout = new VerticalLayout();
        ozLevelsLayout.setPadding(false);
        ozLevelsLayout.setSpacing(false);
        List<OzLevelRow> ozRows = new ArrayList<>();
        rebuildOzRows(ozRows, ozLevelsLayout, hierarchyLevelCountField.getValue());
        hierarchyLevelCountField.addValueChangeListener(e -> rebuildOzRows(
                ozRows, ozLevelsLayout, e.getValue() == null ? 1 : e.getValue()));

        FormLayout general = new FormLayout(
                prjIdField, namePrjField, lblPrjField, boqIdField, nameSelect, lblBoqSelect,
                ownerSelect, newOwnerField, createOwnerButton,
                siteSelect, newSiteField, createSiteButton,
                requesterSelect, newRequesterField, createRequesterButton,
                curSelect, curLblSelect, cpvCodeSelect
        );
        general.setResponsiveSteps(new FormLayout.ResponsiveStep("0", 2));

        FormLayout dates = new FormLayout(bidDateField, openDateField, openTimeField, cnstStartField, cnstEndField, evalEndField);
        dates.setResponsiveSteps(new FormLayout.ResponsiveStep("0", 3));

        FormLayout contract = new FormLayout(submLocField, warrDurField, warrUnitField, contrNoField, contrDateField, catSelect);
        contract.setResponsiveSteps(new FormLayout.ResponsiveStep("0", 3));

        VerticalLayout content = new VerticalLayout(
                new H3("Allgemeine Informationen"), general,
                new H3("Termine"), dates,
                new H3("Vergabe / Vertrag"), contract,
                new H3("OZ-Struktur"), hierarchyLevelCountField, ozLevelsLayout
        );
        content.setSizeFull();
        content.getStyle().set("overflow", "auto");

        Button create = new Button("LV erstellen", e -> {
            setUiState("saving");
            try {
                List<NewLvOzLevelCommand> ozLevels = new ArrayList<>();
                for (int i = 0; i < ozRows.size(); i++) {
                    OzLevelRow row = ozRows.get(i);
                    ozLevels.add(new NewLvOzLevelCommand(
                            i + 1,
                            row.labelField().getValue(),
                            intValueOrDefault(row.digitsField().getValue(), 4),
                            intValueOrDefault(row.stepField().getValue(), 1),
                            row.fillField().getValue()
                    ));
                }

                NewLvCreationCommand command = new NewLvCreationCommand(
                        namePrjField.getValue(),
                        lblPrjField.getValue(),
                        boqIdField.getValue(),
                        nameSelect.getValue(),
                        lblBoqSelect.getValue(),
                        selectedId(ownerSelect),
                        selectedId(siteSelect),
                        curSelect.getValue(),
                        curLblSelect.getValue(),
                        cpvCodeSelect.getValue(),
                        bidDateField.getValue(),
                        openDateField.getValue(),
                        openTimeField.getValue(),
                        cnstStartField.getValue(),
                        cnstEndField.getValue(),
                        evalEndField.getValue(),
                        submLocField.getValue(),
                        warrDurField.getValue(),
                        warrUnitField.getValue(),
                        contrNoField.getValue(),
                        contrDateField.getValue(),
                        selectedId(requesterSelect),
                        catSelect.getValue(),
                        ozLevels
                );

                GaebDocumentEntity document = editorApplicationService.createNewProject(command);
                currentDocumentId = document.getId();
                currentFileName = "new-lv.xml";
                currentDocumentEditable = true;
                suppressEditableChangeEvent = true;
                editableCheckbox.setValue(true);
                suppressEditableChangeEvent = false;
                reloadPositions();
                originalDownloadButton.setEnabled(true);
                updateOriginalDownloadResource();
                workingDownloadButton.setEnabled(true);
                updateWorkingDownloadResource();
                Notification.show("Neues LV als Projekt " + document.getProjectNumber() + " erstellt.");
                setUiState("editable");
                dialog.close();
            } catch (Exception ex) {
                setUiState("validationError");
                Notification.show("Fehler beim Erstellen: " + ex.getMessage());
            }
        });
        create.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        Button cancel = new Button("Abbrechen", e -> dialog.close());
        dialog.add(content);
        dialog.getFooter().add(new HorizontalLayout(create, cancel));
        dialog.open();
    }

    private void rebuildOzRows(List<OzLevelRow> rows, VerticalLayout layout, Integer levelCount) {
        int normalizedCount = levelCount == null ? 1 : Math.max(1, levelCount);
        rows.clear();
        layout.removeAll();
        for (int i = 1; i <= normalizedCount; i++) {
            TextField label = new TextField("Bezeichnung");
            label.setValue("Ebene " + i);
            IntegerField digits = new IntegerField("Stellenanzahl");
            digits.setMin(1);
            digits.setValue(4);
            IntegerField step = new IntegerField("Schrittweite");
            step.setMin(1);
            step.setValue(1);
            TextField fill = new TextField("Füllsymbol");
            fill.setValue("0");
            FormLayout rowLayout = new FormLayout(label, digits, step, fill);
            rowLayout.setResponsiveSteps(new FormLayout.ResponsiveStep("0", 4));
            layout.add(new H4("Stufe " + i), rowLayout);
            rows.add(new OzLevelRow(label, digits, step, fill));
        }
    }

    private Select<String> selectWithOptions(String label, List<String> values) {
        Select<String> select = new Select<>();
        select.setLabel(label);
        select.setItems(values);
        if (!values.isEmpty()) {
            select.setValue(values.get(0));
        }
        return select;
    }

    private Select<NamedMasterData> createMasterDataSelect(String label, List<NamedMasterData> values) {
        Select<NamedMasterData> select = new Select<>();
        select.setLabel(label);
        select.setItems(values);
        select.setItemLabelGenerator(NamedMasterData::name);
        return select;
    }

    private UUID selectedId(Select<NamedMasterData> select) {
        NamedMasterData value = select.getValue();
        return value == null ? null : value.id();
    }

    private int intValueOrDefault(Integer value, int fallback) {
        return value == null ? fallback : value;
    }

    private List<String> loadOptionValues(SettingOptionKey key) {
        return settingsService.loadOptions(key).stream()
                .map(v -> v.getOptionValue())
                .toList();
    }

    private void reloadPositions() {
        if (currentDocumentId == null) {
            return;
        }
        Optional<GaebDocumentEntity> document = editorApplicationService.loadDocument(currentDocumentId);
        document.ifPresent(value -> currentDocumentEditable = value.isEditable());

        List<GaebEditorPositionEntity> positions = editorApplicationService.loadPositions(currentDocumentId);
        showAsHierarchy(positions);
        String mode = currentDocumentEditable ? "änderbar" : "nicht änderbar";
        setUiState(currentDocumentEditable ? "editable" : "readOnly");
        String projectNumber = document.map(GaebDocumentEntity::getProjectNumber).orElse("-");
        documentInfo.setText(projectNumber + " – " + currentFileName + " – " + mode + " – " + positions.size() + " Positionen");
        currentPosition = null;
        showPositionDetails(null);
        addButton.setEnabled(currentDocumentEditable && currentDocumentId != null);
    }

    private void reloadAndReselect(UUID positionId) {
        if (currentDocumentId == null) {
            return;
        }
        List<GaebEditorPositionEntity> positions = editorApplicationService.loadPositions(currentDocumentId);
        showAsHierarchy(positions);
        positions.stream()
                .filter(p -> p.getId().equals(positionId))
                .findFirst()
                .ifPresentOrElse(positionGrid::select, () -> showPositionDetails(null));
        addButton.setEnabled(currentDocumentEditable);
    }

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
            textAdditionField.clear();
            setDetailEnabled(false);
            return;
        }

        ordnungszahlField.setValue(nullToEmpty(position.getPositionNumber()));
        quantityField.setValue(position.getQuantity() == null ? "" : position.getQuantity().toPlainString());
        unitField.setValue(nullToEmpty(position.getUnit()));
        unitPriceField.setValue(position.getUnitPrice() == null ? "" : position.getUnitPrice().toPlainString());
        shortTextField.setValue(nullToEmpty(position.getShortText()));
        longTextField.setValue(nullToEmpty(position.getLongText()));

        List<GaebEditorTextComplementEntity> complements = editorApplicationService.loadTextComplements(position.getId());
        textAdditionField.setValue(complements.isEmpty() ? "" : nullToEmpty(complements.get(0).getBody()));
        setDetailEnabled(true);
    }

    private void setDetailEnabled(boolean enabled) {
        boolean selected = enabled;
        boolean editableMode = selected && currentDocumentEditable;

        ordnungszahlField.setEnabled(editableMode);
        quantityField.setEnabled(editableMode);
        unitField.setEnabled(editableMode);
        shortTextField.setEnabled(editableMode);
        longTextField.setEnabled(editableMode);

        unitPriceField.setEnabled(selected);
        textAdditionField.setEnabled(selected);
        saveButton.setEnabled(selected);
        deleteButton.setEnabled(editableMode);
        copyButton.setEnabled(editableMode);
        addButton.setEnabled(currentDocumentEditable && currentDocumentId != null);
    }

    private void saveCurrentPosition() {
        if (currentPosition == null) {
            return;
        }
        setUiState("saving");
        Optional<BigDecimal> quantity = PriceNumberParser.parse(quantityField.getValue());
        Optional<BigDecimal> unitPrice = PriceNumberParser.parse(unitPriceField.getValue());

        UUID positionId = currentPosition.getId();
        try {
            editorApplicationService.updatePosition(
                    currentDocumentId,
                    positionId,
                    new PositionUpdateCommand(
                            ordnungszahlField.getValue(),
                            quantity.orElse(null),
                            unitField.getValue(),
                            shortTextField.getValue(),
                            longTextField.getValue(),
                            unitPrice.orElse(null),
                            textAdditionField.getValue()
                    ));

            Notification.show("Position gespeichert.");
            setUiState("saved");
            reloadAndReselect(positionId);
        } catch (IllegalArgumentException ex) {
            setUiState("validationError");
            Notification.show("Validierungsfehler: " + ex.getMessage());
        } catch (Exception ex) {
            setUiState("validationError");
            Notification.show("Fehler beim Speichern: " + ex.getMessage());
        }
    }

    private void deleteCurrentPosition() {
        if (currentPosition == null) {
            return;
        }
        Dialog dialog = new Dialog();
        dialog.setHeaderTitle("Position löschen");
        Span confirmation = new Span("Position " + nullToEmpty(currentPosition.getPositionNumber()) + " wirklich löschen?");
        Button delete = new Button("Löschen", e -> {
            setUiState("saving");
            try {
                editorApplicationService.deletePosition(currentDocumentId, currentPosition.getId());
                dialog.close();
                Notification.show("Position gelöscht.");
                setUiState("saved");
                reloadPositions();
            } catch (Exception ex) {
                setUiState("validationError");
                Notification.show("Fehler beim Löschen: " + ex.getMessage());
            }
        });
        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
        Button cancel = new Button("Abbrechen", e -> dialog.close());
        dialog.add(new VerticalLayout(confirmation, new HorizontalLayout(delete, cancel)));
        dialog.open();
    }

    private void openAddDialog() {
        if (!currentDocumentEditable || currentDocumentId == null) {
            return;
        }
        Dialog dialog = new Dialog();
        dialog.setHeaderTitle("Position hinzufügen");

        TextField ozField = new TextField("OZ");
        TextField parentOzField = new TextField("Parent-OZ (optional)");
        parentOzField.setValue(defaultParentOzForNewPosition());
        IntegerField levelField = new IntegerField("Ebene (optional)");
        levelField.setMin(1);
        IntegerField startValueField = new IntegerField("Startwert");
        startValueField.setMin(1);
        startValueField.setValue(1);
        TextField qtyField = new TextField("Menge");
        TextField unitFieldDialog = new TextField("Einheit");
        TextArea shortField = new TextArea("Kurztext");
        TextArea longField = new TextArea("Langtext");
        TextField priceField = new TextField("Einheitspreis");
        Button generateOzButton = new Button("OZ automatisch erzeugen", e -> {
            try {
                String nextOz = editorApplicationService.generateNextOz(
                        currentDocumentId,
                        parentOzField.getValue(),
                        levelField.getValue(),
                        startValueField.getValue()
                );
                ozField.setValue(nextOz);
                setUiState("saved");
            } catch (Exception ex) {
                setUiState("validationError");
                Notification.show("Fehler bei OZ-Generierung: " + ex.getMessage());
            }
        });

        Button create = new Button("Hinzufügen", e -> {
            setUiState("saving");
            try {
                GaebEditorPositionEntity created = editorApplicationService.createPosition(
                        currentDocumentId,
                        new PositionCreateCommand(
                                ozField.getValue(),
                                PriceNumberParser.parse(qtyField.getValue()).orElse(null),
                                unitFieldDialog.getValue(),
                                shortField.getValue(),
                                longField.getValue(),
                                PriceNumberParser.parse(priceField.getValue()).orElse(null),
                                null
                        ));
                dialog.close();
                Notification.show("Position angelegt.");
                setUiState("saved");
                reloadAndReselect(created.getId());
            } catch (Exception ex) {
                setUiState("validationError");
                Notification.show("Fehler beim Anlegen: " + ex.getMessage());
            }
        });
        create.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        Button cancel = new Button("Abbrechen", e -> dialog.close());
        dialog.add(new VerticalLayout(
                ozField,
                new HorizontalLayout(parentOzField, levelField, startValueField, generateOzButton),
                qtyField,
                unitFieldDialog,
                shortField,
                longField,
                priceField,
                new HorizontalLayout(create, cancel)));
        dialog.open();
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
            setUiState("saving");
            try {
                GaebEditorPositionEntity copy = editorApplicationService.copyPosition(
                        currentDocumentId, currentPosition.getId(), newNumberField.getValue());
                dialog.close();
                Notification.show("Position kopiert.");
                setUiState("saved");
                reloadAndReselect(copy.getId());
            } catch (Exception ex) {
                setUiState("validationError");
                Notification.show("Fehler beim Kopieren: " + ex.getMessage());
            }
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
                new ByteArrayInputStream(editorApplicationService.exportOriginalBytes(documentId)));
        originalDownloadAnchor.setHref(resource);
    }

    private void updateWorkingDownloadResource() {
        if (currentDocumentId == null) {
            workingDownloadAnchor.getElement().removeAttribute("href");
            return;
        }
        UUID documentId = currentDocumentId;
        String workingName = currentFileName == null ? "working.snapshot" : currentFileName + ".working";
        StreamResource resource = new StreamResource(workingName, () ->
                new ByteArrayInputStream(editorApplicationService.exportWorkingBytes(documentId)));
        workingDownloadAnchor.setHref(resource);
    }

    private String formatNumber(BigDecimal value) {
        return value == null ? "" : value.toPlainString();
    }

    private String nullToEmpty(String value) {
        return value == null ? "" : value;
    }

    private String defaultParentOzForNewPosition() {
        if (currentPosition == null || currentPosition.getPositionNumber() == null) {
            return "";
        }
        String number = currentPosition.getPositionNumber();
        int lastDot = number.lastIndexOf('.');
        if (lastDot <= 0) {
            return "";
        }
        return number.substring(0, lastDot);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        List<String> documentIds = event.getLocation().getQueryParameters().getParameters().get("documentId");
        if (documentIds == null || documentIds.isEmpty()) {
            return;
        }
        try {
            UUID documentId = UUID.fromString(documentIds.get(0));
            if (documentId.equals(currentDocumentId)) {
                return;
            }
            editorApplicationService.loadDocument(documentId).ifPresent(document -> {
                setUiState("loading");
                currentDocumentId = document.getId();
                currentDocumentEditable = document.isEditable();
                suppressEditableChangeEvent = true;
                editableCheckbox.setValue(document.isEditable());
                suppressEditableChangeEvent = false;
                currentFileName = document.getWorkingFilename() != null
                        ? document.getWorkingFilename()
                        : document.getOriginalFilename();
                reloadPositions();
                originalDownloadButton.setEnabled(true);
                updateOriginalDownloadResource();
                workingDownloadButton.setEnabled(true);
                updateWorkingDownloadResource();
            });
        } catch (IllegalArgumentException ignored) {
            Notification.show("Ungültige Dokument-ID.");
        }
    }

    private void setUiState(String state) {
        stateInfo.setText("Status: " + state);
    }

    private void onEditableModeToggle(boolean editable) {
        if (suppressEditableChangeEvent) {
            return;
        }
        if (currentDocumentId == null) {
            return;
        }
        setUiState("saving");
        try {
            GaebDocumentEntity updated = editorApplicationService.setEditableMode(currentDocumentId, editable);
            currentDocumentEditable = updated.isEditable();
            Notification.show(currentDocumentEditable ? "LV ist jetzt änderbar." : "LV ist jetzt nicht änderbar.");
            setUiState(currentDocumentEditable ? "editable" : "readOnly");
            reloadPositions();
        } catch (Exception ex) {
            setUiState("validationError");
            suppressEditableChangeEvent = true;
            editableCheckbox.setValue(currentDocumentEditable);
            suppressEditableChangeEvent = false;
            Notification.show("Fehler beim Umschalten: " + ex.getMessage());
        }
    }

    private record OzLevelRow(TextField labelField,
                              IntegerField digitsField,
                              IntegerField stepField,
                              TextField fillField) {
    }
}
