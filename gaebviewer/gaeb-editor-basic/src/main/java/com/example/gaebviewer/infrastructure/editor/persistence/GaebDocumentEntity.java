package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.UUID;

/**
 * The untouched original GAEB file as it was imported into the editor, plus a checksum.
 * Fields here are never mutated after insert: this row is the guarantee that the original
 * document can always be reproduced exactly, independent of anything done in the editable
 * position tables.
 */
@Entity
@Table(name = "gaeb_document")
public class GaebDocumentEntity {

    @Id
    private UUID id;

    @Column(name = "original_filename")
    private String originalFilename;

    @Column(name = "gaeb_version")
    private String gaebVersion;

    @Column(name = "currency_code", length = 3)
    private String currencyCode;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "original_content", columnDefinition = "bytea", nullable = false)
    private byte[] originalContent;

    @Column(name = "original_checksum_sha256", length = 64, nullable = false)
    private String originalChecksumSha256;

    @Column(name = "imported_at", nullable = false)
    private Instant importedAt;

    protected GaebDocumentEntity() {
        // JPA
    }

    public GaebDocumentEntity(UUID id,
                               String originalFilename,
                               String gaebVersion,
                               String currencyCode,
                               String projectName,
                               byte[] originalContent,
                               String originalChecksumSha256,
                               Instant importedAt) {
        this.id = id;
        this.originalFilename = originalFilename;
        this.gaebVersion = gaebVersion;
        this.currencyCode = currencyCode;
        this.projectName = projectName;
        this.originalContent = originalContent;
        this.originalChecksumSha256 = originalChecksumSha256;
        this.importedAt = importedAt;
    }

    public UUID getId() {
        return id;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public String getGaebVersion() {
        return gaebVersion;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public byte[] getOriginalContent() {
        return originalContent;
    }

    public String getOriginalChecksumSha256() {
        return originalChecksumSha256;
    }

    public Instant getImportedAt() {
        return importedAt;
    }
}
