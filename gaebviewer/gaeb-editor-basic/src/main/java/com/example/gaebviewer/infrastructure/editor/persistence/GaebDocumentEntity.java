package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
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

    @Column(name = "project_number", nullable = false, unique = true)
    private String projectNumber;

    @Column(name = "source", nullable = false, length = 20)
    private String source;

    @Column(name = "is_editable", nullable = false)
    private boolean editable;

    @Column(name = "working_filename")
    private String workingFilename;

    @Column(name = "original_filename")
    private String originalFilename;

    @Column(name = "gaeb_version")
    private String gaebVersion;

    @Column(name = "currency_code", length = 3)
    private String currencyCode;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "prj_id")
    private String prjId;

    @Column(name = "name_prj")
    private String namePrj;

    @Column(name = "lbl_prj")
    private String lblPrj;

    @Column(name = "boq_id")
    private String boqId;

    @Column(name = "name_value")
    private String nameValue;

    @Column(name = "lbl_boq")
    private String lblBoq;

    @Column(name = "owner_id")
    private UUID ownerId;

    @Column(name = "cnst_site_id")
    private UUID cnstSiteId;

    @Column(name = "cur")
    private String cur;

    @Column(name = "cur_lbl")
    private String curLbl;

    @Column(name = "cpv_code")
    private String cpvCode;

    @Column(name = "bid_date")
    private LocalDate bidDate;

    @Column(name = "open_date")
    private LocalDate openDate;

    @Column(name = "open_time")
    private LocalTime openTime;

    @Column(name = "cnst_start")
    private LocalDate cnstStart;

    @Column(name = "cnst_end")
    private LocalDate cnstEnd;

    @Column(name = "eval_end")
    private LocalDate evalEnd;

    @Column(name = "subm_loc")
    private String submLoc;

    @Column(name = "warr_dur")
    private String warrDur;

    @Column(name = "warr_unit")
    private String warrUnit;

    @Column(name = "contr_no")
    private String contrNo;

    @Column(name = "contr_date")
    private LocalDate contrDate;

    @Column(name = "requester_id")
    private UUID requesterId;

    @Column(name = "cat")
    private String cat;

    @Column(name = "hierarchy_level_count", nullable = false)
    private int hierarchyLevelCount;

    @Column(name = "original_content", columnDefinition = "bytea", nullable = false)
    private byte[] originalContent;

    @Column(name = "original_checksum_sha256", length = 64, nullable = false)
    private String originalChecksumSha256;

    @Column(name = "working_content", columnDefinition = "bytea", nullable = false)
    private byte[] workingContent;

    @Column(name = "working_checksum_sha256", length = 64, nullable = false)
    private String workingChecksumSha256;

    @Column(name = "working_updated_at", nullable = false)
    private Instant workingUpdatedAt;

    @Column(name = "imported_at", nullable = false)
    private Instant importedAt;

    protected GaebDocumentEntity() {
        // JPA
    }

    public GaebDocumentEntity(UUID id,
                               String projectNumber,
                               String source,
                               boolean editable,
                               String workingFilename,
                               String originalFilename,
                               String gaebVersion,
                               String currencyCode,
                               String projectName,
                               String prjId,
                               String namePrj,
                               String lblPrj,
                               String boqId,
                               String nameValue,
                               String lblBoq,
                               UUID ownerId,
                               UUID cnstSiteId,
                               String cur,
                               String curLbl,
                               String cpvCode,
                               LocalDate bidDate,
                               LocalDate openDate,
                               LocalTime openTime,
                               LocalDate cnstStart,
                               LocalDate cnstEnd,
                               LocalDate evalEnd,
                               String submLoc,
                               String warrDur,
                               String warrUnit,
                               String contrNo,
                               LocalDate contrDate,
                               UUID requesterId,
                               String cat,
                               int hierarchyLevelCount,
                               byte[] originalContent,
                               String originalChecksumSha256,
                               Instant importedAt) {
        this.id = id;
        this.projectNumber = projectNumber;
        this.source = source;
        this.editable = editable;
        this.workingFilename = workingFilename;
        this.originalFilename = originalFilename;
        this.gaebVersion = gaebVersion;
        this.currencyCode = currencyCode;
        this.projectName = projectName;
        this.prjId = prjId;
        this.namePrj = namePrj;
        this.lblPrj = lblPrj;
        this.boqId = boqId;
        this.nameValue = nameValue;
        this.lblBoq = lblBoq;
        this.ownerId = ownerId;
        this.cnstSiteId = cnstSiteId;
        this.cur = cur;
        this.curLbl = curLbl;
        this.cpvCode = cpvCode;
        this.bidDate = bidDate;
        this.openDate = openDate;
        this.openTime = openTime;
        this.cnstStart = cnstStart;
        this.cnstEnd = cnstEnd;
        this.evalEnd = evalEnd;
        this.submLoc = submLoc;
        this.warrDur = warrDur;
        this.warrUnit = warrUnit;
        this.contrNo = contrNo;
        this.contrDate = contrDate;
        this.requesterId = requesterId;
        this.cat = cat;
        this.hierarchyLevelCount = hierarchyLevelCount;
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

    public String getProjectNumber() {
        return projectNumber;
    }

    public String getSource() {
        return source;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public String getWorkingFilename() {
        return workingFilename;
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

    public String getNameValue() {
        return nameValue;
    }

    public String getPrjId() {
        return prjId;
    }

    public String getNamePrj() {
        return namePrj;
    }

    public String getLblPrj() {
        return lblPrj;
    }

    public String getBoqId() {
        return boqId;
    }

    public String getLblBoq() {
        return lblBoq;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public UUID getCnstSiteId() {
        return cnstSiteId;
    }

    public String getCur() {
        return cur;
    }

    public String getCurLbl() {
        return curLbl;
    }

    public String getCpvCode() {
        return cpvCode;
    }

    public LocalDate getBidDate() {
        return bidDate;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalDate getCnstStart() {
        return cnstStart;
    }

    public LocalDate getCnstEnd() {
        return cnstEnd;
    }

    public LocalDate getEvalEnd() {
        return evalEnd;
    }

    public String getSubmLoc() {
        return submLoc;
    }

    public String getWarrDur() {
        return warrDur;
    }

    public String getWarrUnit() {
        return warrUnit;
    }

    public String getContrNo() {
        return contrNo;
    }

    public LocalDate getContrDate() {
        return contrDate;
    }

    public UUID getRequesterId() {
        return requesterId;
    }

    public String getCat() {
        return cat;
    }

    public int getHierarchyLevelCount() {
        return hierarchyLevelCount;
    }

    public byte[] getOriginalContent() {
        return originalContent;
    }

    public String getOriginalChecksumSha256() {
        return originalChecksumSha256;
    }

    public byte[] getWorkingContent() {
        return workingContent;
    }

    public void setWorkingContent(byte[] workingContent) {
        this.workingContent = workingContent;
    }

    public String getWorkingChecksumSha256() {
        return workingChecksumSha256;
    }

    public void setWorkingChecksumSha256(String workingChecksumSha256) {
        this.workingChecksumSha256 = workingChecksumSha256;
    }

    public Instant getWorkingUpdatedAt() {
        return workingUpdatedAt;
    }

    public void setWorkingUpdatedAt(Instant workingUpdatedAt) {
        this.workingUpdatedAt = workingUpdatedAt;
    }

    public Instant getImportedAt() {
        return importedAt;
    }
}
