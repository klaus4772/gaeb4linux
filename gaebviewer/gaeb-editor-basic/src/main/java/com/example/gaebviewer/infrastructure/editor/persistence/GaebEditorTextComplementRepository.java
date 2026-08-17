package com.example.gaebviewer.infrastructure.editor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GaebEditorTextComplementRepository extends JpaRepository<GaebEditorTextComplementEntity, UUID> {

    List<GaebEditorTextComplementEntity> findByPositionId(UUID positionId);

    void deleteByPositionId(UUID positionId);
}
