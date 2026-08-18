package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "gaeb_editor_setting_option")
public class GaebEditorSettingOptionEntity {

    @Id
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "option_key", nullable = false, length = 50)
    private SettingOptionKey optionKey;

    @Column(name = "option_value", nullable = false)
    private String optionValue;

    @Column(name = "sort_order", nullable = false)
    private int sortOrder;

    protected GaebEditorSettingOptionEntity() {
        // JPA
    }

    public GaebEditorSettingOptionEntity(UUID id, SettingOptionKey optionKey, String optionValue, int sortOrder) {
        this.id = id;
        this.optionKey = optionKey;
        this.optionValue = optionValue;
        this.sortOrder = sortOrder;
    }

    public UUID getId() {
        return id;
    }

    public SettingOptionKey getOptionKey() {
        return optionKey;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
}
