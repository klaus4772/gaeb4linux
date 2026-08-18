package com.example.gaebviewer.api;

import com.example.gaebviewer.application.editor.GaebMasterDataService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@ConditionalOnProperty(name = "gaeb.api.enabled", havingValue = "true")
@RequestMapping("/api")
public class MasterDataController {

    private final GaebMasterDataService masterDataService;

    public MasterDataController(GaebMasterDataService masterDataService) {
        this.masterDataService = masterDataService;
    }

    @GetMapping("/owners")
    public List<NamedDto> getOwners() {
        return masterDataService.loadOwners().stream().map(v -> new NamedDto(v.id(), v.name())).toList();
    }

    @PostMapping("/owners")
    public NamedDto createOwner(@RequestBody NameRequest request) {
        var created = masterDataService.createOwner(request.name());
        return new NamedDto(created.id(), created.name());
    }

    @GetMapping("/construction-sites")
    public List<NamedDto> getConstructionSites() {
        return masterDataService.loadConstructionSites().stream().map(v -> new NamedDto(v.id(), v.name())).toList();
    }

    @PostMapping("/construction-sites")
    public NamedDto createConstructionSite(@RequestBody NameRequest request) {
        var created = masterDataService.createConstructionSite(request.name());
        return new NamedDto(created.id(), created.name());
    }

    @GetMapping("/requesters")
    public List<NamedDto> getRequesters() {
        return masterDataService.loadRequesters().stream().map(v -> new NamedDto(v.id(), v.name())).toList();
    }

    @PostMapping("/requesters")
    public NamedDto createRequester(@RequestBody NameRequest request) {
        var created = masterDataService.createRequester(request.name());
        return new NamedDto(created.id(), created.name());
    }

    public record NameRequest(String name) {
    }

    public record NamedDto(UUID id, String name) {
    }
}
