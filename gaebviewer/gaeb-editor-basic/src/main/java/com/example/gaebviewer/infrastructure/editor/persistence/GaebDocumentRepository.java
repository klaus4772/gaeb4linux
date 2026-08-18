package com.example.gaebviewer.infrastructure.editor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GaebDocumentRepository extends JpaRepository<GaebDocumentEntity, UUID> {

    boolean existsByProjectNumber(String projectNumber);

    java.util.List<GaebDocumentEntity> findAllByOrderByImportedAtDesc();
}
