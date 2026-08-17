package com.example.gaebviewer.infrastructure.editor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface GaebEditorPositionExtraRepository extends JpaRepository<GaebEditorPositionExtraEntity, UUID> {

    Optional<GaebEditorPositionExtraEntity> findByPositionId(UUID positionId);
}
