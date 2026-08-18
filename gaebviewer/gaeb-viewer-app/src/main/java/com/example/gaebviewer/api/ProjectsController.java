package com.example.gaebviewer.api;

import com.example.gaebviewer.application.editor.EditorApplicationService;
import com.example.gaebviewer.application.editor.NewLvCreationCommand;
import com.example.gaebviewer.application.editor.NewLvOzLevelCommand;
import com.example.gaebviewer.application.editor.PositionCreateCommand;
import com.example.gaebviewer.application.editor.PositionUpdateCommand;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorPositionEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@RestController
@ConditionalOnProperty(name = "gaeb.api.enabled", havingValue = "true")
@RequestMapping("/api/projects")
public class ProjectsController {

    private final EditorApplicationService editorApplicationService;

    public ProjectsController(EditorApplicationService editorApplicationService) {
        this.editorApplicationService = editorApplicationService;
    }

    @GetMapping
    public List<ProjectDto> getProjects() {
        return editorApplicationService.loadProjects().stream().map(this::toDto).toList();
    }

    @GetMapping("/{id}")
    public ProjectDto getProject(@PathVariable("id") UUID id) {
        GaebDocumentEntity document = editorApplicationService.loadDocument(id)
                .orElseThrow(() -> new jakarta.persistence.EntityNotFoundException("No GAEB document found for id " + id));
        return toDto(document);
    }

    @PostMapping
    public ProjectDto createProject(@RequestBody NewLvRequest request) {
        NewLvCreationCommand command = new NewLvCreationCommand(
                request.namePrj(),
                request.lblPrj(),
                request.boqId(),
                request.name(),
                request.lblBoq(),
                request.ownerId(),
                request.constructionSiteId(),
                request.cur(),
                request.curLbl(),
                request.cpvCode(),
                request.bidDate(),
                request.openDate(),
                request.openTime(),
                request.cnstStart(),
                request.cnstEnd(),
                request.evalEnd(),
                request.submLoc(),
                request.warrDur(),
                request.warrUnit(),
                request.contrNo(),
                request.contrDate(),
                request.requesterId(),
                request.cat(),
                request.ozLevels() == null ? List.of() : request.ozLevels().stream()
                        .map(v -> new NewLvOzLevelCommand(v.level(), v.label(), v.digits(), v.step(), v.fillCharacter()))
                        .toList()
        );
        return toDto(editorApplicationService.createNewProject(command));
    }

    @PatchMapping("/{id}/editable")
    public ProjectDto setEditable(@PathVariable("id") UUID id, @RequestBody EditableRequest request) {
        return toDto(editorApplicationService.setEditableMode(id, request.editable()));
    }

    @GetMapping("/{id}/original")
    public ResponseEntity<byte[]> downloadOriginal(@PathVariable("id") UUID id) {
        GaebDocumentEntity document = requireDocument(id);
        String fileName = document.getOriginalFilename() == null ? "original.gaeb" : document.getOriginalFilename();
        return downloadBytes(fileName, editorApplicationService.exportOriginalBytes(id));
    }

    @GetMapping("/{id}/working")
    public ResponseEntity<byte[]> downloadWorking(@PathVariable("id") UUID id) {
        GaebDocumentEntity document = requireDocument(id);
        String fileName = document.getWorkingFilename() == null ? "working.gaeb" : document.getWorkingFilename();
        return downloadBytes(fileName, editorApplicationService.exportWorkingBytes(id));
    }

    @GetMapping("/{id}/positions")
    public List<PositionDto> getPositions(@PathVariable("id") UUID id) {
        requireDocument(id);
        return editorApplicationService.loadPositions(id).stream().map(this::toPositionDto).toList();
    }

    @GetMapping("/{id}/oz/next")
    public NextOzDto getNextOz(@PathVariable("id") UUID id,
                               @RequestParam(value = "parentOz", required = false) String parentOz,
                               @RequestParam(value = "level", required = false) Integer level,
                               @RequestParam(value = "startValue", required = false) Integer startValue) {
        String nextOz = editorApplicationService.generateNextOz(id, parentOz, level, startValue);
        return new NextOzDto(nextOz);
    }

    @PostMapping("/{id}/positions")
    public PositionDto createPosition(@PathVariable("id") UUID id, @RequestBody PositionUpsertRequest request) {
        GaebEditorPositionEntity created = editorApplicationService.createPosition(
                id,
                new PositionCreateCommand(
                        request.oz(),
                        request.quantity(),
                        request.unit(),
                        request.shortText(),
                        request.longText(),
                        request.unitPrice(),
                        request.textAddition()
                ));
        return toPositionDto(created);
    }

    @PatchMapping("/{id}/positions/{positionId}")
    public PositionDto updatePosition(@PathVariable("id") UUID id,
                                      @PathVariable("positionId") UUID positionId,
                                      @RequestBody PositionUpsertRequest request) {
        GaebEditorPositionEntity updated = editorApplicationService.updatePosition(
                id,
                positionId,
                new PositionUpdateCommand(
                        request.oz(),
                        request.quantity(),
                        request.unit(),
                        request.shortText(),
                        request.longText(),
                        request.unitPrice(),
                        request.textAddition()
                ));
        return toPositionDto(updated);
    }

    @DeleteMapping("/{id}/positions/{positionId}")
    public void deletePosition(@PathVariable("id") UUID id, @PathVariable("positionId") UUID positionId) {
        editorApplicationService.deletePosition(id, positionId);
    }

    private GaebDocumentEntity requireDocument(UUID id) {
        return editorApplicationService.loadDocument(id)
                .orElseThrow(() -> new jakarta.persistence.EntityNotFoundException("No GAEB document found for id " + id));
    }

    private ProjectDto toDto(GaebDocumentEntity document) {
        return new ProjectDto(
                document.getId(),
                document.getProjectNumber(),
                document.getNamePrj(),
                document.getNameValue(),
                document.getImportedAt(),
                document.isEditable(),
                document.getSource()
        );
    }

    private PositionDto toPositionDto(GaebEditorPositionEntity p) {
        return new PositionDto(
                p.getId(),
                p.getPositionNumber(),
                p.getQuantity(),
                p.getUnit(),
                p.getShortText(),
                p.getLongText(),
                p.getUnitPrice()
        );
    }

    public record EditableRequest(boolean editable) {
    }

    public record ProjectDto(UUID id, String projectNumber, String projectName, String lvIdentifier,
                             java.time.Instant createdAt, boolean editable, String source) {
    }

    public record PositionDto(UUID id, String oz, BigDecimal quantity, String unit,
                              String shortText, String longText, BigDecimal unitPrice) {
    }

    public record PositionUpsertRequest(String oz, BigDecimal quantity, String unit,
                                        String shortText, String longText, BigDecimal unitPrice, String textAddition) {
    }

    public record NewLvRequest(
            String namePrj,
            String lblPrj,
            String boqId,
            String name,
            String lblBoq,
            UUID ownerId,
            UUID constructionSiteId,
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
            List<OzLevelRequest> ozLevels
    ) {
    }

    public record OzLevelRequest(int level, String label, int digits, int step, String fillCharacter) {
    }

    public record NextOzDto(String oz) {
    }

    private ResponseEntity<byte[]> downloadBytes(String fileName, byte[] content) {
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(content);
    }
}
