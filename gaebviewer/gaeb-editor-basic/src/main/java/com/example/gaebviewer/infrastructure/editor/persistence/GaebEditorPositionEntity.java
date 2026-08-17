package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

/**
 * Editable working copy of a single GAEB position, belonging to one {@link GaebDocumentEntity}.
 * This is what the editor UI reads and mutates (text, quantity, unit, price, Ordnungszahl,
 * soft-delete, copies) - the original file itself is never touched.
 */
@Entity
@Table(name = "gaeb_editor_position")
public class GaebEditorPositionEntity {

    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "document_id", nullable = false)
    private GaebDocumentEntity document;

    @Column(name = "boq_index", nullable = false)
    private int boqIndex;

    @Column(name = "boq_title")
    private String boqTitle;

    @Column(name = "sort_order", nullable = false)
    private int sortOrder;

    @Column(name = "position_number")
    private String positionNumber;

    @Column(name = "original_position_number")
    private String originalPositionNumber;

    @Column(name = "short_text")
    private String shortText;

    @Column(name = "long_text")
    private String longText;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "unit")
    private String unit;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "deleted", nullable = false)
    private boolean deleted;

    @Column(name = "copied_from_position_id")
    private UUID copiedFromPositionId;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    protected GaebEditorPositionEntity() {
        // JPA
    }

    public GaebEditorPositionEntity(UUID id,
                                     GaebDocumentEntity document,
                                     int boqIndex,
                                     String boqTitle,
                                     int sortOrder,
                                     String positionNumber,
                                     String shortText,
                                     String longText,
                                     BigDecimal quantity,
                                     String unit,
                                     BigDecimal unitPrice,
                                     Instant now) {
        this.id = id;
        this.document = document;
        this.boqIndex = boqIndex;
        this.boqTitle = boqTitle;
        this.sortOrder = sortOrder;
        this.positionNumber = positionNumber;
        this.originalPositionNumber = positionNumber;
        this.shortText = shortText;
        this.longText = longText;
        this.quantity = quantity;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.deleted = false;
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PrePersist
    void onCreate() {
        if (createdAt == null) {
            createdAt = Instant.now();
        }
        if (updatedAt == null) {
            updatedAt = createdAt;
        }
    }

    @PreUpdate
    void onUpdate() {
        updatedAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public GaebDocumentEntity getDocument() {
        return document;
    }

    public int getBoqIndex() {
        return boqIndex;
    }

    public String getBoqTitle() {
        return boqTitle;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    public String getOriginalPositionNumber() {
        return originalPositionNumber;
    }

    void setOriginalPositionNumber(String originalPositionNumber) {
        this.originalPositionNumber = originalPositionNumber;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getLongText() {
        return longText;
    }

    public void setLongText(String longText) {
        this.longText = longText;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public UUID getCopiedFromPositionId() {
        return copiedFromPositionId;
    }

    public void setCopiedFromPositionId(UUID copiedFromPositionId) {
        this.copiedFromPositionId = copiedFromPositionId;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
