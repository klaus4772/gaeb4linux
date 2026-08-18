package com.example.gaebviewer.application.editor;

import com.example.gaebviewer.EditorTestApplication;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest(classes = EditorTestApplication.class)
@Transactional
class NewLvCreationTest {

    @Autowired
    private GaebEditorPersistenceService service;

    @Autowired
    private GaebMasterDataService masterDataService;

    @Autowired
    private OzFormattingService ozFormattingService;

    @Autowired
    private GaebEditorSettingsService settingsService;

    @Test
    void newLvCreationStoresMetadataAndOzStructure() {
        var owner = masterDataService.createOwner("Owner A");
        var site = masterDataService.createConstructionSite("Site A");
        var requester = masterDataService.createRequester("Requester A");

        NewLvCreationCommand command = new NewLvCreationCommand(
                "Projekt Alpha",
                "Beschreibung",
                "1",
                "LV-Kurz",
                "LV-Lang",
                owner.id(),
                site.id(),
                "EUR",
                "Euro",
                "45000000-7",
                LocalDate.of(2026, 1, 5),
                LocalDate.of(2026, 1, 10),
                LocalTime.of(9, 30),
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 3, 1),
                LocalDate.of(2026, 1, 25),
                "Rathaus",
                "24",
                "Monate",
                "C-42",
                LocalDate.of(2026, 1, 20),
                requester.id(),
                "Öffentlich",
                List.of(
                        new NewLvOzLevelCommand(1, "Titel", 2, 1, "0"),
                        new NewLvOzLevelCommand(2, "Abschnitt", 3, 10, "")
                )
        );

        GaebDocumentEntity document = service.createNewEmptyDocument(command);
        assertThat(document.getProjectNumber()).isEqualTo("P00001");
        assertThat(document.getPrjId()).isEqualTo("P00001");
        assertThat(document.getNamePrj()).isEqualTo("Projekt Alpha");
        assertThat(document.getNameValue()).isEqualTo("LV-Kurz");
        assertThat(document.getHierarchyLevelCount()).isEqualTo(2);
        assertThat(service.loadOzLevels(document.getId())).hasSize(2);
    }

    @Test
    void newLvRejectsInvalidOzStructure() {
        NewLvCreationCommand invalid = new NewLvCreationCommand(
                "Projekt", null, "1", null, null, null, null, "EUR", null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                List.of(new NewLvOzLevelCommand(1, "x", 0, 1, "0"))
        );
        assertThatThrownBy(() -> service.createNewEmptyDocument(invalid))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void newLvRejectsValuesOutsideConfiguredSettingsOptions() {
        settingsService.addOption(com.example.gaebviewer.infrastructure.editor.persistence.SettingOptionKey.CUR, "EUR");
        settingsService.addOption(com.example.gaebviewer.infrastructure.editor.persistence.SettingOptionKey.NAME, "A");

        NewLvCreationCommand invalid = new NewLvCreationCommand(
                "Projekt", null, "1", "B", null, null, null, "USD", null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                List.of(new NewLvOzLevelCommand(1, "x", 1, 1, "0"))
        );
        assertThatThrownBy(() -> service.createNewEmptyDocument(invalid))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void ozFormattingSupportsFillAndEmptyFill() {
        assertThat(ozFormattingService.formatLevelValue(1, 4, "0")).isEqualTo("0001");
        assertThat(ozFormattingService.formatLevelValue(1, 4, "")).isEqualTo("1");
    }

    @Test
    void nextOzUsesDigitsFillAndStepPerLevel() {
        GaebDocumentEntity document = service.createNewEmptyDocument(new NewLvCreationCommand(
                "Projekt", null, "1", null, null, null, null, "EUR", null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                List.of(
                        new NewLvOzLevelCommand(1, "Titel", 2, 10, "0"),
                        new NewLvOzLevelCommand(2, "Pos", 3, 10, "0")
                )
        ));

        assertThat(service.generateNextOz(document.getId(), null, 1, 1)).isEqualTo("01");
        service.createPosition(document.getId(), "01", null, null, null, null, null);
        assertThat(service.generateNextOz(document.getId(), null, 1, 1)).isEqualTo("11");

        assertThat(service.generateNextOz(document.getId(), "01", 2, 1)).isEqualTo("01.001");
        service.createPosition(document.getId(), "01.001", null, null, null, null, null);
        assertThat(service.generateNextOz(document.getId(), "01", 2, 1)).isEqualTo("01.011");
    }

    @Test
    void nextOzWithoutFillCharacterIsNotLeftPadded() {
        GaebDocumentEntity document = service.createNewEmptyDocument(new NewLvCreationCommand(
                "Projekt", null, "1", null, null, null, null, "EUR", null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                List.of(new NewLvOzLevelCommand(1, "Ebene", 4, 1, ""))
        ));
        assertThat(service.generateNextOz(document.getId(), null, 1, 1)).isEqualTo("1");
    }
}
