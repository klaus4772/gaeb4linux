package com.example.gaebviewer.infrastructure.editor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GaebDocumentOzLevelRepository extends JpaRepository<GaebDocumentOzLevelEntity, UUID> {

    List<GaebDocumentOzLevelEntity> findByDocumentIdOrderByLevelNoAsc(UUID documentId);
}
