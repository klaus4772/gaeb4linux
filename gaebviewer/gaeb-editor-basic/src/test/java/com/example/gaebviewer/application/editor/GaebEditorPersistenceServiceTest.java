package com.example.gaebviewer.application.editor;

import com.example.gaebviewer.EditorTestApplication;
import com.example.gaebviewer.domain.GaebBoQ;
import com.example.gaebviewer.domain.GaebPosition;
import com.example.gaebviewer.domain.GaebProject;
import com.example.gaebviewer.domain.GaebTextComplement;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionExtraEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(classes = EditorTestApplication.class)
@Transactional
class GaebEditorPersistenceServiceTest {

    @Autowired
    private GaebEditorPersistenceService service;

    @Test
    void importPersistsOriginalBytesUntouchedAndAStructuredPositionMirror() {
        byte[] original = "<GAEB>dummy original content</GAEB>".getBytes(StandardCharsets.UTF_8);
        GaebProject project = sampleProject();

        GaebDocumentEntity document = service.importDocument(original, "test.d81", project);

        assertThat(document.getId()).isNotNull();
        assertThat(document.getProjectNumber()).isEqualTo("P00001");
        assertThat(document.getOriginalContent()).isEqualTo(original);
        assertThat(service.exportOriginalBytes(document.getId())).isEqualTo(original);

        List<GaebEditorPositionEntity> positions = service.loadPositions(document.getId());
        assertThat(positions).hasSize(2);
        assertThat(positions.get(0).getPositionNumber()).isEqualTo("1.1");
        assertThat(positions.get(0).getOriginalPositionNumber()).isEqualTo("1.1");
        assertThat(positions.get(1).getPositionNumber()).isEqualTo("1.2");
    }

    @Test
    void editingTextQuantityUnitAndPriceUpdatesOnlyTheStructuredCopy() {
        byte[] original = "<GAEB/>".getBytes(StandardCharsets.UTF_8);
        GaebDocumentEntity document = service.importDocument(original, "test.d81", sampleProject());
        UUID positionId = service.loadPositions(document.getId()).get(0).getId();

        service.updateText(positionId, "Neuer Kurztext", "Neuer Langtext");
        service.updateQuantityAndUnit(positionId, new BigDecimal("12.500"), "m2");
        service.updateUnitPrice(positionId, new BigDecimal("9.99"));

        GaebEditorPositionEntity updated = service.loadPositions(document.getId()).get(0);
        assertThat(updated.getShortText()).isEqualTo("Neuer Kurztext");
        assertThat(updated.getLongText()).isEqualTo("Neuer Langtext");
        assertThat(updated.getQuantity()).isEqualByComparingTo("12.500");
        assertThat(updated.getUnit()).isEqualTo("m2");
        assertThat(updated.getUnitPrice()).isEqualByComparingTo("9.99");

        // The original file must remain byte-for-byte unchanged by structural edits.
        assertThat(service.exportOriginalBytes(document.getId())).isEqualTo(original);
    }

    @Test
    void updatePositionCommitsAllEditableFieldsAtOnce() {
        GaebDocumentEntity document = service.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "test.d81", sampleProject());
        UUID positionId = service.loadPositions(document.getId()).get(0).getId();

        service.updatePosition(positionId, "1.1a", "Kurz", "Lang",
                new BigDecimal("3.000"), "St", new BigDecimal("42.00"));

        GaebEditorPositionEntity updated = service.loadPositions(document.getId()).get(0);
        assertThat(updated.getPositionNumber()).isEqualTo("1.1a");
        assertThat(updated.getShortText()).isEqualTo("Kurz");
        assertThat(updated.getLongText()).isEqualTo("Lang");
        assertThat(updated.getQuantity()).isEqualByComparingTo("3.000");
        assertThat(updated.getUnit()).isEqualTo("St");
        assertThat(updated.getUnitPrice()).isEqualByComparingTo("42.00");
    }

    @Test
    void deletePositionIsASoftDeleteExcludedFromActivePositions() {
        GaebDocumentEntity document = service.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "test.d81", sampleProject());
        UUID positionId = service.loadPositions(document.getId()).get(0).getId();

        service.deletePosition(positionId);

        assertThat(service.loadPositions(document.getId())).hasSize(1);
    }

    @Test
    void renumberPositionChangesNumberButKeepsOriginalPositionNumber() {
        GaebDocumentEntity document = service.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "test.d81", sampleProject());
        UUID positionId = service.loadPositions(document.getId()).get(0).getId();

        service.renumberPosition(positionId, "2.1");

        GaebEditorPositionEntity renumbered = service.loadPositions(document.getId()).get(0);
        assertThat(renumbered.getPositionNumber()).isEqualTo("2.1");
        assertThat(renumbered.getOriginalPositionNumber()).isEqualTo("1.1");
    }

    @Test
    void copyPositionClonesFieldsAndTextComplementsAsANewPosition() {
        GaebDocumentEntity document = service.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "test.d81", sampleProject());
        UUID sourceId = service.loadPositions(document.getId()).get(0).getId();

        GaebEditorPositionEntity copy = service.copyPosition(sourceId, "1.1a");

        assertThat(copy.getId()).isNotEqualTo(sourceId);
        assertThat(copy.getCopiedFromPositionId()).isEqualTo(sourceId);
        assertThat(copy.getPositionNumber()).isEqualTo("1.1a");
        assertThat(copy.getShortText()).isEqualTo("Kurztext 1");
        assertThat(service.loadPositions(document.getId())).hasSize(3);
    }

    @Test
    void extraInfoIsStoredSeparatelyFromTheOriginalPositionData() {
        GaebDocumentEntity document = service.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "test.d81", sampleProject());
        UUID positionId = service.loadPositions(document.getId()).get(0).getId();

        GaebEditorPositionExtraEntity extra = service.saveExtraInfo(positionId, "Bitte pruefen", "OPEN", "klaus");

        assertThat(extra.getNote()).isEqualTo("Bitte pruefen");
        assertThat(extra.getReviewStatus()).isEqualTo("OPEN");
        assertThat(extra.getLastModifiedBy()).isEqualTo("klaus");
        // Saving extra info must not have touched the structured position mirror.
        assertThat(service.loadPositions(document.getId()).get(0).getShortText()).isEqualTo("Kurztext 1");
    }

    @Test
    void operatingOnAnUnknownPositionFails() {
        assertThrows(jakarta.persistence.EntityNotFoundException.class,
                () -> service.deletePosition(UUID.randomUUID()));
    }

    @Test
    void nonEditableLvAllowsOnlyUnitPriceAndTextComplements() {
        byte[] original = "<GAEB/>".getBytes(StandardCharsets.UTF_8);
        GaebDocumentEntity document = service.importDocument(original, "test.d81", sampleProject(), false);
        UUID positionId = service.loadPositions(document.getId()).get(0).getId();

        service.updateUnitPrice(positionId, new BigDecimal("7.50"));
        service.upsertTextComplement(positionId, "Neue Ergänzung");

        assertThatThrownBy(() -> service.updatePosition(positionId, "2.0", "x", "y",
                new BigDecimal("1"), "m", new BigDecimal("2")))
                .isInstanceOf(IllegalStateException.class);
        assertThatThrownBy(() -> service.deletePosition(positionId))
                .isInstanceOf(IllegalStateException.class);
        assertThatThrownBy(() -> service.createPosition(document.getId(), "9.9",
                BigDecimal.ONE, "St", "neu", "neu", BigDecimal.TEN))
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void creatingNewLvCreatesEditableProjectWithoutPositions() {
        GaebDocumentEntity document = service.createNewEmptyDocument("Neu");
        assertThat(document.getProjectNumber()).isEqualTo("P00001");
        assertThat(document.isEditable()).isTrue();
        assertThat(service.loadPositions(document.getId())).isEmpty();
    }

    @Test
    void creatingOrUpdatingPositionWithEmptyOzIsRejected() {
        GaebDocumentEntity document = service.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "test.d81", sampleProject(), true);
        UUID positionId = service.loadPositions(document.getId()).get(0).getId();

        assertThatThrownBy(() -> service.createPosition(document.getId(), "   ",
                BigDecimal.ONE, "St", "neu", "neu", BigDecimal.TEN))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> service.updatePosition(positionId, "",
                "Kurz", "Lang", BigDecimal.ONE, "St", BigDecimal.TEN))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void editableModeCanBeSwitchedAfterImport() {
        GaebDocumentEntity document = service.importDocument(
                "<GAEB/>".getBytes(StandardCharsets.UTF_8), "test.d81", sampleProject(), false);
        UUID positionId = service.loadPositions(document.getId()).get(0).getId();

        assertThatThrownBy(() -> service.updatePosition(positionId, "2.0", "x", "y",
                new BigDecimal("1"), "m", new BigDecimal("2")))
                .isInstanceOf(IllegalStateException.class);

        service.updateEditableMode(document.getId(), true);
        service.updatePosition(positionId, "2.0", "x", "y",
                new BigDecimal("1"), "m", new BigDecimal("2"));

        GaebDocumentEntity reloaded = service.loadDocument(document.getId()).orElseThrow();
        assertThat(reloaded.isEditable()).isTrue();
    }

    @Test
    void originalAndWorkingVersionAreStoredSeparately() {
        byte[] original = "<GAEB>ORIGINAL</GAEB>".getBytes(StandardCharsets.UTF_8);
        GaebDocumentEntity document = service.importDocument(original, "test.d81", sampleProject(), true);
        UUID positionId = service.loadPositions(document.getId()).get(0).getId();

        byte[] workingBefore = service.exportWorkingBytes(document.getId());
        assertThat(workingBefore).isEqualTo(original);

        service.updateUnitPrice(positionId, new BigDecimal("99.99"));

        byte[] originalAfter = service.exportOriginalBytes(document.getId());
        byte[] workingAfter = service.exportWorkingBytes(document.getId());
        assertThat(originalAfter).isEqualTo(original);
        assertThat(workingAfter).isNotEqualTo(original);
    }

    private GaebProject sampleProject() {
        GaebProject project = new GaebProject();
        project.setGaebVersion("DA81");
        project.setName("Testprojekt");

        GaebBoQ boq = new GaebBoQ();
        boq.setTitle("Leistungsverzeichnis");

        GaebPosition first = new GaebPosition();
        first.setNumber("1.1");
        first.setShortText("Kurztext 1");
        first.setLongText("Langtext 1");
        first.setQuantity(new BigDecimal("10"));
        first.setUnit("m");
        first.setUnitPrice(new BigDecimal("5.00"));

        GaebTextComplement complement = new GaebTextComplement();
        complement.setMarkLabel("A");
        complement.setCaption("Hersteller");
        complement.setBody("Acme");
        complement.setRequired(true);
        first.setBidderTextComplements(List.of(complement));

        GaebPosition second = new GaebPosition();
        second.setNumber("1.2");
        second.setShortText("Kurztext 2");
        second.setQuantity(new BigDecimal("2"));
        second.setUnit("St");
        second.setUnitPrice(new BigDecimal("100.00"));

        boq.addPosition(first);
        boq.addPosition(second);
        project.addBoQ(boq);
        return project;
    }
}
