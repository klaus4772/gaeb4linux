package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gaeb_editor_settings")
public class GaebEditorSettingsEntity {

    public static final int SINGLETON_ID = 1;

    @Id
    private Integer id;

    @Column(name = "project_number_prefix", nullable = false, length = 20)
    private String projectNumberPrefix;

    @Column(name = "project_number_digits", nullable = false)
    private int projectNumberDigits;

    protected GaebEditorSettingsEntity() {
        // JPA
    }

    public GaebEditorSettingsEntity(Integer id, String projectNumberPrefix, int projectNumberDigits) {
        this.id = id;
        this.projectNumberPrefix = projectNumberPrefix;
        this.projectNumberDigits = projectNumberDigits;
    }

    public Integer getId() {
        return id;
    }

    public String getProjectNumberPrefix() {
        return projectNumberPrefix;
    }

    public void setProjectNumberPrefix(String projectNumberPrefix) {
        this.projectNumberPrefix = projectNumberPrefix;
    }

    public int getProjectNumberDigits() {
        return projectNumberDigits;
    }

    public void setProjectNumberDigits(int projectNumberDigits) {
        this.projectNumberDigits = projectNumberDigits;
    }
}
