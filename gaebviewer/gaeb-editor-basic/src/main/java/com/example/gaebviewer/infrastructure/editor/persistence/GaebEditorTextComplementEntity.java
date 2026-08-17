package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.UUID;

/**
 * Structured mirror of {@code com.example.gaebviewer.domain.GaebTextComplement} for one
 * position, so bidder text complements survive the same import/edit/export cycle as the
 * rest of the position data.
 */
@Entity
@Table(name = "gaeb_editor_text_complement")
public class GaebEditorTextComplementEntity {

    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "position_id", nullable = false)
    private GaebEditorPositionEntity position;

    @Column(name = "mark_label")
    private String markLabel;

    @Column(name = "caption")
    private String caption;

    @Column(name = "body")
    private String body;

    @Column(name = "placeholder")
    private String placeholder;

    @Column(name = "tail")
    private String tail;

    @Column(name = "required", nullable = false)
    private boolean required;

    protected GaebEditorTextComplementEntity() {
        // JPA
    }

    public GaebEditorTextComplementEntity(UUID id,
                                           GaebEditorPositionEntity position,
                                           String markLabel,
                                           String caption,
                                           String body,
                                           String placeholder,
                                           String tail,
                                           boolean required) {
        this.id = id;
        this.position = position;
        this.markLabel = markLabel;
        this.caption = caption;
        this.body = body;
        this.placeholder = placeholder;
        this.tail = tail;
        this.required = required;
    }

    public UUID getId() {
        return id;
    }

    public GaebEditorPositionEntity getPosition() {
        return position;
    }

    public String getMarkLabel() {
        return markLabel;
    }

    public String getCaption() {
        return caption;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public String getTail() {
        return tail;
    }

    public boolean isRequired() {
        return required;
    }
}
