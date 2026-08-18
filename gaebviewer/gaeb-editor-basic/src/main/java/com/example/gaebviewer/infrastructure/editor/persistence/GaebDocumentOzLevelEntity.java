package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "gaeb_document_oz_level")
public class GaebDocumentOzLevelEntity {

    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "document_id", nullable = false)
    private GaebDocumentEntity document;

    @Column(name = "level_no", nullable = false)
    private int levelNo;

    @Column(name = "level_label")
    private String levelLabel;

    @Column(name = "digits", nullable = false)
    private int digits;

    @Column(name = "step", nullable = false)
    private int step;

    @Column(name = "fill_character")
    private String fillCharacter;

    protected GaebDocumentOzLevelEntity() {
        // JPA
    }

    public GaebDocumentOzLevelEntity(UUID id,
                                     GaebDocumentEntity document,
                                     int levelNo,
                                     String levelLabel,
                                     int digits,
                                     int step,
                                     String fillCharacter) {
        this.id = id;
        this.document = document;
        this.levelNo = levelNo;
        this.levelLabel = levelLabel;
        this.digits = digits;
        this.step = step;
        this.fillCharacter = fillCharacter;
    }

    public UUID getId() {
        return id;
    }

    public int getLevelNo() {
        return levelNo;
    }

    public String getLevelLabel() {
        return levelLabel;
    }

    public int getDigits() {
        return digits;
    }

    public int getStep() {
        return step;
    }

    public String getFillCharacter() {
        return fillCharacter;
    }
}
