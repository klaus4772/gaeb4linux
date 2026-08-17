package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.UUID;

/**
 * Editor-only information about a position that has no counterpart in the original GAEB
 * file (internal notes, review status, ...). Kept in its own table, separate from
 * {@link GaebEditorPositionEntity}, so it is obvious this data is additive and can be
 * discarded without affecting the ability to reconstruct the original document.
 */
@Entity
@Table(name = "gaeb_editor_position_extra")
public class GaebEditorPositionExtraEntity {

    @Id
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "position_id", nullable = false, unique = true)
    private GaebEditorPositionEntity position;

    @Column(name = "note")
    private String note;

    @Column(name = "review_status", length = 50)
    private String reviewStatus;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    @Column(name = "last_modified_at")
    private Instant lastModifiedAt;

    protected GaebEditorPositionExtraEntity() {
        // JPA
    }

    public GaebEditorPositionExtraEntity(UUID id, GaebEditorPositionEntity position) {
        this.id = id;
        this.position = position;
    }

    public UUID getId() {
        return id;
    }

    public GaebEditorPositionEntity getPosition() {
        return position;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void touch(String modifiedBy, Instant when) {
        this.lastModifiedBy = modifiedBy;
        this.lastModifiedAt = when;
    }
}
