package com.example.gaebviewer.application.editor;

import com.example.gaebviewer.EditorTestApplication;
import com.example.gaebviewer.domain.GaebBoQ;
import com.example.gaebviewer.domain.GaebPosition;
import com.example.gaebviewer.domain.GaebProject;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.SettingOptionKey;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = EditorTestApplication.class)
@Transactional
class GaebEditorSettingsAndProjectNumberTest {

    @Autowired
    private GaebEditorPersistenceService persistenceService;

    @Autowired
    private GaebEditorSettingsService settingsService;

    @Autowired
    private ProjectNumberService projectNumberService;

    @Test
    void projectNumbersAreSequentialAndFollowSettings() {
        GaebDocumentEntity first = persistenceService.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "a.x81", sampleProject());
        GaebDocumentEntity second = persistenceService.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "b.x81", sampleProject());

        assertThat(first.getProjectNumber()).isEqualTo("P00001");
        assertThat(second.getProjectNumber()).isEqualTo("P00002");

        settingsService.saveProjectNumberSettings("X", 3);
        GaebDocumentEntity third = persistenceService.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "c.x81", sampleProject());
        assertThat(third.getProjectNumber()).isEqualTo("X003");
    }

    @Test
    void settingOptionsCanBeAddedUpdatedMovedAndDeleted() {
        var first = settingsService.addOption(SettingOptionKey.CUR, "EUR");
        var second = settingsService.addOption(SettingOptionKey.CUR, "USD");
        settingsService.updateOption(second.getId(), "CHF");
        settingsService.moveOptionUp(second.getId());

        var options = settingsService.loadOptions(SettingOptionKey.CUR);
        assertThat(options).extracting("optionValue").containsExactly("CHF", "EUR");

        settingsService.deleteOption(first.getId());
        assertThat(settingsService.loadOptions(SettingOptionKey.CUR))
                .extracting("optionValue")
                .containsExactly("CHF");
    }

    @Test
    void previewNextProjectNumberDoesNotConsumeCounter() {
        assertThat(projectNumberService.previewNextProjectNumber()).isEqualTo("P00001");
        GaebDocumentEntity created = persistenceService.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "first.x81", sampleProject());
        assertThat(created.getProjectNumber()).isEqualTo("P00001");
    }

    private GaebProject sampleProject() {
        GaebProject project = new GaebProject();
        project.setGaebVersion("DA81");
        project.setName("Test");

        GaebBoQ boq = new GaebBoQ();
        boq.setTitle("LV");

        GaebPosition position = new GaebPosition();
        position.setNumber("1.1");
        position.setShortText("Kurz");
        position.setQuantity(new BigDecimal("1"));
        position.setUnit("St");
        position.setUnitPrice(new BigDecimal("1.00"));
        boq.addPosition(position);
        project.addBoQ(boq);
        return project;
    }
}
