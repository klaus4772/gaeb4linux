package com.example.gaebviewer.application.editor;

import com.example.gaebviewer.domain.GaebBoQ;
import com.example.gaebviewer.domain.GaebPosition;
import com.example.gaebviewer.domain.GaebProject;
import com.example.gaebviewer.domain.GaebTextComplement;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionExtraEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionExtraRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorTextComplementEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorTextComplementRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.HexFormat;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Persists an imported GAEB file for editing: the original bytes go into
 * {@link GaebDocumentEntity} untouched, while positions are copied into an editable,
 * structured mirror ({@link GaebEditorPositionEntity}) that large-scale editor operations
 * (text/quantity/unit changes, deletion, renumbering, copying) work against.
 */
@Service
@Transactional
public class GaebEditorPersistenceService {

    private final GaebDocumentRepository documentRepository;
    private final GaebEditorPositionRepository positionRepository;
    private final GaebEditorTextComplementRepository textComplementRepository;
    private final GaebEditorPositionExtraRepository positionExtraRepository;

    public GaebEditorPersistenceService(GaebDocumentRepository documentRepository,
                                         GaebEditorPositionRepository positionRepository,
                                         GaebEditorTextComplementRepository textComplementRepository,
                                         GaebEditorPositionExtraRepository positionExtraRepository) {
        this.documentRepository = documentRepository;
        this.positionRepository = positionRepository;
        this.textComplementRepository = textComplementRepository;
        this.positionExtraRepository = positionExtraRepository;
    }

    public GaebDocumentEntity importDocument(byte[] originalContent, String originalFilename, GaebProject project) {
        Instant now = Instant.now();
        GaebDocumentEntity document = new GaebDocumentEntity(
                UUID.randomUUID(),
                originalFilename,
                project.getGaebVersion(),
                project.getCurrencyCode(),
                project.getName(),
                originalContent,
                sha256Hex(originalContent),
                now);
        documentRepository.save(document);

        int sortOrder = 0;
        List<GaebBoQ> boqs = project.getBoqs();
        for (int boqIndex = 0; boqIndex < boqs.size(); boqIndex++) {
            GaebBoQ boq = boqs.get(boqIndex);
            for (GaebPosition position : boq.getPositions()) {
                GaebEditorPositionEntity entity = new GaebEditorPositionEntity(
                        UUID.randomUUID(),
                        document,
                        boqIndex,
                        boq.getTitle(),
                        sortOrder++,
                        position.getNumber(),
                        position.getShortText(),
                        position.getLongText(),
                        position.getQuantity(),
                        position.getUnit(),
                        position.getUnitPrice(),
                        now);
                positionRepository.save(entity);

                for (GaebTextComplement complement : position.getBidderTextComplements()) {
                    textComplementRepository.save(new GaebEditorTextComplementEntity(
                            UUID.randomUUID(),
                            entity,
                            complement.getMarkLabel(),
                            complement.getCaption(),
                            complement.getBody(),
                            complement.getPlaceholder(),
                            complement.getTail(),
                            complement.isRequired()));
                }
            }
        }

        return document;
    }

    @Transactional(readOnly = true)
    public Optional<GaebDocumentEntity> loadDocument(UUID documentId) {
        return documentRepository.findById(documentId);
    }

    @Transactional(readOnly = true)
    public List<GaebEditorPositionEntity> loadPositions(UUID documentId) {
        return positionRepository.findByDocumentIdAndDeletedFalseOrderBySortOrderAsc(documentId);
    }

    @Transactional(readOnly = true)
    public byte[] exportOriginalBytes(UUID documentId) {
        return documentRepository.findById(documentId)
                .map(GaebDocumentEntity::getOriginalContent)
                .orElseThrow(() -> new EntityNotFoundException("No GAEB document found for id " + documentId));
    }

    public GaebEditorPositionEntity updateText(UUID positionId, String shortText, String longText) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        position.setShortText(shortText);
        position.setLongText(longText);
        return position;
    }

    public GaebEditorPositionEntity updateQuantityAndUnit(UUID positionId, BigDecimal quantity, String unit) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        position.setQuantity(quantity);
        position.setUnit(unit);
        return position;
    }

    public GaebEditorPositionEntity updateUnitPrice(UUID positionId, BigDecimal unitPrice) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        position.setUnitPrice(unitPrice);
        return position;
    }

    public GaebEditorPositionEntity renumberPosition(UUID positionId, String newPositionNumber) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        position.setPositionNumber(newPositionNumber);
        return position;
    }

    /**
     * Convenience method for editor UIs that let a user change several fields of a
     * position at once and commit them with a single "Save" action.
     */
    public GaebEditorPositionEntity updatePosition(UUID positionId,
                                                    String positionNumber,
                                                    String shortText,
                                                    String longText,
                                                    BigDecimal quantity,
                                                    String unit,
                                                    BigDecimal unitPrice) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        position.setPositionNumber(positionNumber);
        position.setShortText(shortText);
        position.setLongText(longText);
        position.setQuantity(quantity);
        position.setUnit(unit);
        position.setUnitPrice(unitPrice);
        return position;
    }

    public void deletePosition(UUID positionId) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        position.setDeleted(true);
    }

    public GaebEditorPositionEntity copyPosition(UUID positionId, String newPositionNumber) {
        GaebEditorPositionEntity source = requirePosition(positionId);
        int nextSortOrder = positionRepository.countByDocumentId(source.getDocument().getId());

        GaebEditorPositionEntity copy = new GaebEditorPositionEntity(
                UUID.randomUUID(),
                source.getDocument(),
                source.getBoqIndex(),
                source.getBoqTitle(),
                nextSortOrder,
                newPositionNumber,
                source.getShortText(),
                source.getLongText(),
                source.getQuantity(),
                source.getUnit(),
                source.getUnitPrice(),
                Instant.now());
        copy.setCopiedFromPositionId(source.getId());
        positionRepository.save(copy);

        for (GaebEditorTextComplementEntity complement : textComplementRepository.findByPositionId(source.getId())) {
            textComplementRepository.save(new GaebEditorTextComplementEntity(
                    UUID.randomUUID(),
                    copy,
                    complement.getMarkLabel(),
                    complement.getCaption(),
                    complement.getBody(),
                    complement.getPlaceholder(),
                    complement.getTail(),
                    complement.isRequired()));
        }

        return copy;
    }

    public GaebEditorPositionExtraEntity saveExtraInfo(UUID positionId, String note, String reviewStatus, String modifiedBy) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        GaebEditorPositionExtraEntity extra = positionExtraRepository.findByPositionId(positionId)
                .orElseGet(() -> new GaebEditorPositionExtraEntity(UUID.randomUUID(), position));
        extra.setNote(note);
        extra.setReviewStatus(reviewStatus);
        extra.touch(modifiedBy, Instant.now());
        return positionExtraRepository.save(extra);
    }

    private GaebEditorPositionEntity requirePosition(UUID positionId) {
        return positionRepository.findById(positionId)
                .orElseThrow(() -> new EntityNotFoundException("No GAEB editor position found for id " + positionId));
    }

    private static String sha256Hex(byte[] content) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return HexFormat.of().formatHex(digest.digest(content));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 not available", e);
        }
    }
}
