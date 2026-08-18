package com.example.gaebviewer.application.editor;

import com.example.gaebviewer.application.gaeb.GaebImportService;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentOzLevelEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorTextComplementEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class EditorApplicationService {

    private final GaebImportService gaebImportService;
    private final GaebEditorPersistenceService persistenceService;

    public EditorApplicationService(GaebImportService gaebImportService,
                                    GaebEditorPersistenceService persistenceService) {
        this.gaebImportService = gaebImportService;
        this.persistenceService = persistenceService;
    }

    public GaebDocumentEntity importProject(byte[] gaebBytes, String fileName, boolean editable) {
        var project = gaebImportService.importGaeb(new ByteArrayInputStream(gaebBytes));
        return persistenceService.importDocument(gaebBytes, fileName, project, editable);
    }

    public GaebDocumentEntity createNewProject(NewLvCreationCommand command) {
        return persistenceService.createNewEmptyDocument(command);
    }

    @Transactional(readOnly = true)
    public Optional<GaebDocumentEntity> loadDocument(UUID documentId) {
        return persistenceService.loadDocument(documentId);
    }

    @Transactional(readOnly = true)
    public List<GaebDocumentEntity> loadProjects() {
        return persistenceService.loadProjects();
    }

    @Transactional(readOnly = true)
    public List<GaebEditorPositionEntity> loadPositions(UUID documentId) {
        return persistenceService.loadPositions(documentId);
    }

    @Transactional(readOnly = true)
    public Optional<GaebEditorPositionEntity> loadPosition(UUID positionId) {
        return persistenceService.loadPosition(positionId);
    }

    @Transactional(readOnly = true)
    public List<GaebEditorTextComplementEntity> loadTextComplements(UUID positionId) {
        return persistenceService.loadTextComplements(positionId);
    }

    @Transactional(readOnly = true)
    public List<GaebDocumentOzLevelEntity> loadOzLevels(UUID documentId) {
        return persistenceService.loadOzLevels(documentId);
    }

    public GaebDocumentEntity setEditableMode(UUID documentId, boolean editable) {
        return persistenceService.updateEditableMode(documentId, editable);
    }

    public GaebEditorPositionEntity createPosition(UUID documentId, PositionCreateCommand command) {
        requireDocument(documentId);
        GaebEditorPositionEntity created = persistenceService.createPosition(
                documentId,
                command.oz(),
                command.quantity(),
                command.unit(),
                command.shortText(),
                command.longText(),
                command.unitPrice()
        );
        if (command.textAddition() != null) {
            persistenceService.upsertTextComplement(created.getId(), command.textAddition());
        }
        return created;
    }

    public GaebEditorPositionEntity updatePosition(UUID documentId, UUID positionId, PositionUpdateCommand command) {
        GaebDocumentEntity document = requireDocument(documentId);
        GaebEditorPositionEntity existing = requirePositionForProject(positionId, documentId);

        if (document.isEditable()) {
            persistenceService.updatePosition(
                    positionId,
                    fallback(command.oz(), existing.getPositionNumber()),
                    fallback(command.shortText(), existing.getShortText()),
                    fallback(command.longText(), existing.getLongText()),
                    command.quantity() == null ? existing.getQuantity() : command.quantity(),
                    fallback(command.unit(), existing.getUnit()),
                    command.unitPrice() == null ? existing.getUnitPrice() : command.unitPrice()
            );
        } else {
            if (command.oz() != null || command.quantity() != null || command.unit() != null
                    || command.shortText() != null || command.longText() != null) {
                throw new IllegalStateException("Only unitPrice and textAddition can be changed for non-editable LV");
            }
            if (command.unitPrice() != null) {
                persistenceService.updateUnitPrice(positionId, command.unitPrice());
            }
        }

        if (command.textAddition() != null) {
            persistenceService.upsertTextComplement(positionId, command.textAddition());
        }
        return requirePositionForProject(positionId, documentId);
    }

    public void deletePosition(UUID documentId, UUID positionId) {
        requirePositionForProject(positionId, documentId);
        persistenceService.deletePosition(positionId);
    }

    public GaebEditorPositionEntity copyPosition(UUID documentId, UUID positionId, String newOz) {
        requirePositionForProject(positionId, documentId);
        return persistenceService.copyPosition(positionId, newOz);
    }

    @Transactional(readOnly = true)
    public String generateNextOz(UUID documentId, String parentOz, Integer level, Integer startValue) {
        return persistenceService.generateNextOz(documentId, parentOz, level, startValue);
    }

    @Transactional(readOnly = true)
    public byte[] exportOriginalBytes(UUID documentId) {
        return persistenceService.exportOriginalBytes(documentId);
    }

    @Transactional(readOnly = true)
    public byte[] exportWorkingBytes(UUID documentId) {
        return persistenceService.exportWorkingBytes(documentId);
    }

    private GaebDocumentEntity requireDocument(UUID documentId) {
        return persistenceService.loadDocument(documentId)
                .orElseThrow(() -> new EntityNotFoundException("No GAEB document found for id " + documentId));
    }

    private GaebEditorPositionEntity requirePositionForProject(UUID positionId, UUID projectId) {
        GaebEditorPositionEntity position = persistenceService.loadPosition(positionId)
                .orElseThrow(() -> new EntityNotFoundException("No GAEB editor position found for id " + positionId));
        if (!position.getDocument().getId().equals(projectId)) {
            throw new IllegalArgumentException("Position does not belong to project");
        }
        return position;
    }

    private String fallback(String candidate, String existing) {
        return candidate == null ? existing : candidate;
    }
}
