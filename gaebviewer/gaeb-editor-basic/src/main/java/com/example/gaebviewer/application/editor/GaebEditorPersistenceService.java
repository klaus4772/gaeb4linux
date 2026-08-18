package com.example.gaebviewer.application.editor;

import com.example.gaebviewer.domain.GaebBoQ;
import com.example.gaebviewer.domain.GaebPosition;
import com.example.gaebviewer.domain.GaebProject;
import com.example.gaebviewer.domain.GaebTextComplement;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentOzLevelEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentOzLevelRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionExtraEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionExtraRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorTextComplementEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorTextComplementRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.SettingOptionKey;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.ArrayList;
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
    private final GaebDocumentOzLevelRepository ozLevelRepository;
    private final ProjectNumberService projectNumberService;
    private final GaebEditorSettingsService settingsService;
    private final OzFormattingService ozFormattingService;

    public GaebEditorPersistenceService(GaebDocumentRepository documentRepository,
                                         GaebEditorPositionRepository positionRepository,
                                         GaebEditorTextComplementRepository textComplementRepository,
                                         GaebEditorPositionExtraRepository positionExtraRepository,
                                         GaebDocumentOzLevelRepository ozLevelRepository,
                                         ProjectNumberService projectNumberService,
                                         GaebEditorSettingsService settingsService,
                                         OzFormattingService ozFormattingService) {
        this.documentRepository = documentRepository;
        this.positionRepository = positionRepository;
        this.textComplementRepository = textComplementRepository;
        this.positionExtraRepository = positionExtraRepository;
        this.ozLevelRepository = ozLevelRepository;
        this.projectNumberService = projectNumberService;
        this.settingsService = settingsService;
        this.ozFormattingService = ozFormattingService;
    }

    public GaebDocumentEntity importDocument(byte[] originalContent, String originalFilename, GaebProject project) {
        return importDocument(originalContent, originalFilename, project, true);
    }

    public GaebDocumentEntity importDocument(byte[] originalContent,
                                             String originalFilename,
                                             GaebProject project,
                                             boolean editable) {
        Instant now = Instant.now();
        String projectNumber = projectNumberService.nextProjectNumber();
        GaebDocumentEntity document = new GaebDocumentEntity(
                UUID.randomUUID(),
                projectNumber,
                "upload",
                editable,
                originalFilename == null ? "working.xml" : (originalFilename + ".working"),
                originalFilename,
                project.getGaebVersion(),
                project.getCurrencyCode(),
                project.getName(),
                projectNumber,
                project.getName(),
                null,
                "1",
                null,
                null,
                null,
                null,
                project.getCurrencyCode(),
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                0,
                originalContent,
                sha256Hex(originalContent),
                now);
        document.setWorkingContent(originalContent.clone());
        document.setWorkingChecksumSha256(sha256Hex(originalContent));
        document.setWorkingUpdatedAt(now);
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

    public GaebDocumentEntity createNewEmptyDocument(String projectName) {
        return createNewEmptyDocument(new NewLvCreationCommand(
                projectName,
                null,
                "1",
                null,
                null,
                null,
                null,
                "EUR",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                List.of(new NewLvOzLevelCommand(1, "Ebene 1", 4, 1, "0"))
        ));
    }

    public GaebDocumentEntity createNewEmptyDocument(NewLvCreationCommand command) {
        List<NewLvOzLevelCommand> ozLevels = command.ozLevels() == null ? List.of() : command.ozLevels();
        validateOzStructure(ozLevels);
        validateConfiguredSelections(command);

        byte[] emptyGaebContent = "<GAEB/>".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        Instant now = Instant.now();
        String projectNumber = projectNumberService.nextProjectNumber();
        String boqId = normalizeOrDefault(command.boqId(), "1");

        GaebDocumentEntity document = new GaebDocumentEntity(
                UUID.randomUUID(),
                projectNumber,
                "created",
                true,
                projectNumber + "-working.xml",
                null,
                null,
                normalizeOrDefault(command.cur(), "EUR"),
                normalizeOrDefault(command.namePrj(), projectNumber),
                projectNumber,
                command.namePrj(),
                command.lblPrj(),
                boqId,
                command.name(),
                command.lblBoq(),
                command.ownerId(),
                command.constructionSiteId(),
                command.cur(),
                command.curLbl(),
                command.cpvCode(),
                command.bidDate(),
                command.openDate(),
                command.openTime(),
                command.cnstStart(),
                command.cnstEnd(),
                command.evalEnd(),
                command.submLoc(),
                command.warrDur(),
                command.warrUnit(),
                command.contrNo(),
                command.contrDate(),
                command.requesterId(),
                command.cat(),
                ozLevels.size(),
                emptyGaebContent,
                sha256Hex(emptyGaebContent),
                now);
        document.setWorkingContent(emptyGaebContent.clone());
        document.setWorkingChecksumSha256(sha256Hex(emptyGaebContent));
        document.setWorkingUpdatedAt(now);
        GaebDocumentEntity saved = documentRepository.save(document);
        persistOzLevels(saved, ozLevels);
        return saved;
    }

    @Transactional(readOnly = true)
    public Optional<GaebDocumentEntity> loadDocument(UUID documentId) {
        return documentRepository.findById(documentId);
    }

    public GaebDocumentEntity updateEditableMode(UUID documentId, boolean editable) {
        GaebDocumentEntity document = documentRepository.findById(documentId)
                .orElseThrow(() -> new EntityNotFoundException("No GAEB document found for id " + documentId));
        document.setEditable(editable);
        refreshWorkingVersion(documentId);
        return document;
    }

    @Transactional(readOnly = true)
    public List<GaebDocumentEntity> loadProjects() {
        return documentRepository.findAllByOrderByImportedAtDesc();
    }

    @Transactional(readOnly = true)
    public List<GaebDocumentOzLevelEntity> loadOzLevels(UUID documentId) {
        return ozLevelRepository.findByDocumentIdOrderByLevelNoAsc(documentId);
    }

    @Transactional(readOnly = true)
    public List<GaebEditorPositionEntity> loadPositions(UUID documentId) {
        return positionRepository.findByDocumentIdAndDeletedFalseOrderBySortOrderAsc(documentId);
    }

    @Transactional(readOnly = true)
    public Optional<GaebEditorPositionEntity> loadPosition(UUID positionId) {
        return positionRepository.findById(positionId);
    }

    @Transactional(readOnly = true)
    public String generateNextOz(UUID documentId, String parentOz, Integer level, Integer startValue) {
        requireDocument(documentId);
        List<GaebDocumentOzLevelEntity> levels = loadOzLevels(documentId);
        if (levels.isEmpty()) {
            throw new IllegalStateException("No OZ structure configured for this project");
        }

        String normalizedParent = normalizeParentOz(parentOz);
        int targetLevel = level != null
                ? level
                : (normalizedParent == null ? 1 : normalizedParent.split("\\.").length + 1);
        if (targetLevel < 1) {
            throw new IllegalArgumentException("level must be >= 1");
        }
        int normalizedStart = startValue == null ? 1 : startValue;
        if (normalizedStart < 1) {
            throw new IllegalArgumentException("startValue must be >= 1");
        }

        GaebDocumentOzLevelEntity levelConfig = levels.stream()
                .filter(v -> v.getLevelNo() == targetLevel)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No OZ level configuration found for level " + targetLevel));

        Integer maxValue = null;
        for (GaebEditorPositionEntity position : loadPositions(documentId)) {
            String oz = position.getPositionNumber();
            if (oz == null || !matchesParentAndLevel(oz, normalizedParent, targetLevel)) {
                continue;
            }
            int parsed = parseNumericSegment(getSegmentAtLevel(oz, targetLevel));
            if (parsed < 0) {
                continue;
            }
            if (maxValue == null || parsed > maxValue) {
                maxValue = parsed;
            }
        }

        int next = maxValue == null ? normalizedStart : maxValue + levelConfig.getStep();
        String formattedSegment = ozFormattingService.formatLevelValue(
                next, levelConfig.getDigits(), levelConfig.getFillCharacter() == null ? "" : levelConfig.getFillCharacter());
        return normalizedParent == null ? formattedSegment : normalizedParent + "." + formattedSegment;
    }

    @Transactional(readOnly = true)
    public byte[] exportOriginalBytes(UUID documentId) {
        return documentRepository.findById(documentId)
                .map(GaebDocumentEntity::getOriginalContent)
                .orElseThrow(() -> new EntityNotFoundException("No GAEB document found for id " + documentId));
    }

    @Transactional(readOnly = true)
    public byte[] exportWorkingBytes(UUID documentId) {
        return documentRepository.findById(documentId)
                .map(GaebDocumentEntity::getWorkingContent)
                .orElseThrow(() -> new EntityNotFoundException("No GAEB document found for id " + documentId));
    }

    public GaebEditorPositionEntity updateText(UUID positionId, String shortText, String longText) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        requireEditable(position);
        position.setShortText(shortText);
        position.setLongText(longText);
        refreshWorkingVersion(position.getDocument().getId());
        return position;
    }

    public GaebEditorPositionEntity updateQuantityAndUnit(UUID positionId, BigDecimal quantity, String unit) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        requireEditable(position);
        position.setQuantity(quantity);
        position.setUnit(unit);
        refreshWorkingVersion(position.getDocument().getId());
        return position;
    }

    public GaebEditorPositionEntity updateUnitPrice(UUID positionId, BigDecimal unitPrice) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        position.setUnitPrice(unitPrice);
        refreshWorkingVersion(position.getDocument().getId());
        return position;
    }

    public GaebEditorPositionEntity renumberPosition(UUID positionId, String newPositionNumber) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        requireEditable(position);
        position.setPositionNumber(newPositionNumber);
        refreshWorkingVersion(position.getDocument().getId());
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
        requireEditable(position);
        requireNonEmptyOz(positionNumber);
        position.setPositionNumber(positionNumber);
        position.setShortText(shortText);
        position.setLongText(longText);
        position.setQuantity(quantity);
        position.setUnit(unit);
        position.setUnitPrice(unitPrice);
        refreshWorkingVersion(position.getDocument().getId());
        return position;
    }

    public void deletePosition(UUID positionId) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        requireEditable(position);
        position.setDeleted(true);
        refreshWorkingVersion(position.getDocument().getId());
    }

    public GaebEditorPositionEntity copyPosition(UUID positionId, String newPositionNumber) {
        GaebEditorPositionEntity source = requirePosition(positionId);
        requireEditable(source);
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

        refreshWorkingVersion(source.getDocument().getId());
        return copy;
    }

    public GaebEditorPositionEntity createPosition(UUID documentId,
                                                   String positionNumber,
                                                   BigDecimal quantity,
                                                   String unit,
                                                   String shortText,
                                                   String longText,
                                                   BigDecimal unitPrice) {
        GaebDocumentEntity document = documentRepository.findById(documentId)
                .orElseThrow(() -> new EntityNotFoundException("No GAEB document found for id " + documentId));
        if (!document.isEditable()) {
            throw new IllegalStateException("Positions can only be created for editable LV");
        }
        requireNonEmptyOz(positionNumber);
        int nextSortOrder = positionRepository.countByDocumentId(documentId);
        GaebEditorPositionEntity created = new GaebEditorPositionEntity(
                UUID.randomUUID(),
                document,
                0,
                "Leistungsverzeichnis",
                nextSortOrder,
                positionNumber,
                shortText,
                longText,
                quantity,
                unit,
                unitPrice,
                Instant.now());
        GaebEditorPositionEntity saved = positionRepository.save(created);
        refreshWorkingVersion(documentId);
        return saved;
    }

    @Transactional(readOnly = true)
    public List<GaebEditorTextComplementEntity> loadTextComplements(UUID positionId) {
        requirePosition(positionId);
        return textComplementRepository.findByPositionId(positionId);
    }

    public GaebEditorTextComplementEntity upsertTextComplement(UUID positionId, String body) {
        GaebEditorPositionEntity position = requirePosition(positionId);
        List<GaebEditorTextComplementEntity> existing = textComplementRepository.findByPositionId(positionId);
        if (!existing.isEmpty()) {
            GaebEditorTextComplementEntity first = existing.get(0);
            first.setBody(body);
            refreshWorkingVersion(position.getDocument().getId());
            return first;
        }
        GaebEditorTextComplementEntity saved = textComplementRepository.save(new GaebEditorTextComplementEntity(
                UUID.randomUUID(),
                position,
                "TXT",
                "Textergänzung",
                body,
                null,
                null,
                false));
        refreshWorkingVersion(position.getDocument().getId());
        return saved;
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

    private void requireEditable(GaebEditorPositionEntity position) {
        if (!position.getDocument().isEditable()) {
            throw new IllegalStateException("LV is not editable. Only unit price and text complements can be changed.");
        }
    }

    private void requireNonEmptyOz(String positionNumber) {
        if (positionNumber == null || positionNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("OZ must not be empty");
        }
    }

    private GaebDocumentEntity requireDocument(UUID documentId) {
        return documentRepository.findById(documentId)
                .orElseThrow(() -> new EntityNotFoundException("No GAEB document found for id " + documentId));
    }

    private void validateOzStructure(List<NewLvOzLevelCommand> levels) {
        if (levels.isEmpty()) {
            throw new IllegalArgumentException("hierarchyLevelCount must be >= 1");
        }
        for (NewLvOzLevelCommand level : levels) {
            if (level.digits() < 1) {
                throw new IllegalArgumentException("digits must be >= 1");
            }
            if (level.step() < 1) {
                throw new IllegalArgumentException("step must be >= 1");
            }
        }
    }

    private void validateConfiguredSelections(NewLvCreationCommand command) {
        validateOptionValue(SettingOptionKey.NAME, command.name(), "Name");
        validateOptionValue(SettingOptionKey.LBL_BOQ, command.lblBoq(), "LblBoQ");
        validateOptionValue(SettingOptionKey.CUR, command.cur(), "Cur");
        validateOptionValue(SettingOptionKey.CUR_LBL, command.curLbl(), "CurLbl");
        validateOptionValue(SettingOptionKey.CPV_CODE, command.cpvCode(), "CPVCode");
        validateOptionValue(SettingOptionKey.CAT, command.cat(), "Cat");
    }

    private void validateOptionValue(SettingOptionKey key, String value, String fieldName) {
        if (!settingsService.isAllowedOptionValue(key, value)) {
            throw new IllegalArgumentException(fieldName + " value is not allowed by settings: " + value);
        }
    }

    private void persistOzLevels(GaebDocumentEntity document, List<NewLvOzLevelCommand> levels) {
        List<GaebDocumentOzLevelEntity> entities = new ArrayList<>();
        for (NewLvOzLevelCommand level : levels) {
            entities.add(new GaebDocumentOzLevelEntity(
                    UUID.randomUUID(),
                    document,
                    level.level(),
                    level.label(),
                    level.digits(),
                    level.step(),
                    level.fillCharacter()
            ));
        }
        ozLevelRepository.saveAll(entities);
    }

    private String normalizeOrDefault(String value, String fallback) {
        if (value == null || value.trim().isEmpty()) {
            return fallback;
        }
        return value.trim();
    }

    private String normalizeParentOz(String parentOz) {
        if (parentOz == null) {
            return null;
        }
        String normalized = parentOz.trim();
        return normalized.isEmpty() ? null : normalized;
    }

    private boolean matchesParentAndLevel(String oz, String parentOz, int level) {
        String[] parts = oz.split("\\.");
        if (parts.length != level) {
            return false;
        }
        if (parentOz == null) {
            return level == 1;
        }
        String[] parentParts = parentOz.split("\\.");
        if (parentParts.length != level - 1) {
            return false;
        }
        for (int i = 0; i < parentParts.length; i++) {
            if (!parts[i].equals(parentParts[i])) {
                return false;
            }
        }
        return true;
    }

    private String getSegmentAtLevel(String oz, int level) {
        String[] parts = oz.split("\\.");
        return parts[level - 1];
    }

    private int parseNumericSegment(String segment) {
        String digitsOnly = segment.replaceAll("\\D", "");
        if (digitsOnly.isEmpty()) {
            return -1;
        }
        try {
            return Integer.parseInt(digitsOnly);
        } catch (NumberFormatException ex) {
            return -1;
        }
    }

    private static String sha256Hex(byte[] content) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return HexFormat.of().formatHex(digest.digest(content));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 not available", e);
        }
    }

    private void refreshWorkingVersion(UUID documentId) {
        GaebDocumentEntity document = requireDocument(documentId);
        byte[] snapshot = buildWorkingSnapshot(documentId);
        document.setWorkingContent(snapshot);
        document.setWorkingChecksumSha256(sha256Hex(snapshot));
        document.setWorkingUpdatedAt(Instant.now());
    }

    private byte[] buildWorkingSnapshot(UUID documentId) {
        GaebDocumentEntity document = requireDocument(documentId);
        List<GaebEditorPositionEntity> positions = loadPositions(documentId);
        StringBuilder builder = new StringBuilder();
        builder.append("GAEB-WORKING-SNAPSHOT-V1\n");
        builder.append("projectNumber=").append(escape(document.getProjectNumber())).append('\n');
        builder.append("projectId=").append(document.getId()).append('\n');
        builder.append("editable=").append(document.isEditable()).append('\n');
        for (GaebEditorPositionEntity p : positions) {
            builder.append("position|")
                    .append(escape(p.getPositionNumber())).append('|')
                    .append(escape(decimalString(p.getQuantity()))).append('|')
                    .append(escape(p.getUnit())).append('|')
                    .append(escape(p.getShortText())).append('|')
                    .append(escape(p.getLongText())).append('|')
                    .append(escape(decimalString(p.getUnitPrice())))
                    .append('\n');
            for (GaebEditorTextComplementEntity complement : textComplementRepository.findByPositionId(p.getId())) {
                builder.append("textAddition|")
                        .append(escape(p.getPositionNumber())).append('|')
                        .append(escape(complement.getBody()))
                        .append('\n');
            }
        }
        return builder.toString().getBytes(StandardCharsets.UTF_8);
    }

    private String decimalString(BigDecimal value) {
        return value == null ? "" : value.toPlainString();
    }

    private String escape(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("\\", "\\\\")
                .replace("\n", "\\n")
                .replace("|", "\\|");
    }
}
