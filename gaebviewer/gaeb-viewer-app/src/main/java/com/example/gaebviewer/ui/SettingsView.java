package com.example.gaebviewer.ui;

import com.example.gaebviewer.application.editor.GaebEditorSettingsService;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorSettingOptionEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorSettingsEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.SettingOptionKey;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("settings")
public class SettingsView extends VerticalLayout {

    private final GaebEditorSettingsService settingsService;

    private final TextField prefixField = new TextField("projectNumberPrefix");
    private final IntegerField digitsField = new IntegerField("projectNumberDigits");
    private final Select<SettingOptionKey> optionKeySelect = new Select<>();
    private final Grid<GaebEditorSettingOptionEntity> optionGrid = new Grid<>();
    private final TextField optionValueField = new TextField("Wert");

    private GaebEditorSettingOptionEntity selectedOption;

    public SettingsView(GaebEditorSettingsService settingsService) {
        this.settingsService = settingsService;

        setSizeFull();
        add(new H2("Einstellungen"));

        digitsField.setMin(1);
        Button saveProjectNumber = new Button("Projektnummer speichern", e -> saveProjectNumberSettings());
        saveProjectNumber.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        add(new HorizontalLayout(prefixField, digitsField, saveProjectNumber));

        optionKeySelect.setLabel("Option-Feld");
        optionKeySelect.setItems(SettingOptionKey.values());
        optionKeySelect.setValue(SettingOptionKey.NAME);
        optionKeySelect.addValueChangeListener(e -> reloadOptions());

        optionGrid.addColumn(GaebEditorSettingOptionEntity::getOptionValue).setHeader("Wert");
        optionGrid.setHeight("320px");
        optionGrid.addSelectionListener(e -> {
            selectedOption = e.getFirstSelectedItem().orElse(null);
            optionValueField.setValue(selectedOption == null ? "" : selectedOption.getOptionValue());
        });

        Button addButton = new Button("Hinzufügen", e -> addOption());
        Button update = new Button("Bearbeiten", e -> updateOption());
        Button delete = new Button("Löschen", e -> deleteOption());
        Button up = new Button("Nach oben", e -> moveUp());
        Button down = new Button("Nach unten", e -> moveDown());

        add(optionKeySelect, optionGrid, optionValueField, new HorizontalLayout(addButton, update, delete, up, down));
        loadSettings();
        reloadOptions();
    }

    private void loadSettings() {
        GaebEditorSettingsEntity settings = settingsService.loadSettings();
        prefixField.setValue(settings.getProjectNumberPrefix());
        digitsField.setValue(settings.getProjectNumberDigits());
    }

    private void saveProjectNumberSettings() {
        try {
            settingsService.saveProjectNumberSettings(prefixField.getValue(), digitsField.getValue() == null ? 0 : digitsField.getValue());
            Notification.show("Einstellungen gespeichert.");
        } catch (Exception ex) {
            Notification.show("Fehler: " + ex.getMessage());
        }
    }

    private void reloadOptions() {
        List<GaebEditorSettingOptionEntity> options = settingsService.loadOptions(optionKeySelect.getValue());
        optionGrid.setItems(options);
        selectedOption = null;
        optionValueField.clear();
    }

    private void addOption() {
        try {
            settingsService.addOption(optionKeySelect.getValue(), optionValueField.getValue());
            reloadOptions();
        } catch (Exception ex) {
            Notification.show("Fehler: " + ex.getMessage());
        }
    }

    private void updateOption() {
        if (selectedOption == null) {
            return;
        }
        try {
            settingsService.updateOption(selectedOption.getId(), optionValueField.getValue());
            reloadOptions();
        } catch (Exception ex) {
            Notification.show("Fehler: " + ex.getMessage());
        }
    }

    private void deleteOption() {
        if (selectedOption == null) {
            return;
        }
        settingsService.deleteOption(selectedOption.getId());
        reloadOptions();
    }

    private void moveUp() {
        if (selectedOption == null) {
            return;
        }
        settingsService.moveOptionUp(selectedOption.getId());
        reloadOptions();
    }

    private void moveDown() {
        if (selectedOption == null) {
            return;
        }
        settingsService.moveOptionDown(selectedOption.getId());
        reloadOptions();
    }
}
