package com.example.gaebviewer.infrastructure.editor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GaebEditorPositionRepository extends JpaRepository<GaebEditorPositionEntity, UUID> {

    List<GaebEditorPositionEntity> findByDocumentIdOrderBySortOrderAsc(UUID documentId);

    List<GaebEditorPositionEntity> findByDocumentIdAndDeletedFalseOrderBySortOrderAsc(UUID documentId);

    int countByDocumentId(UUID documentId);
}
