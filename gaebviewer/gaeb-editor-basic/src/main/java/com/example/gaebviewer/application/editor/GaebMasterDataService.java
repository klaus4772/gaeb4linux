package com.example.gaebviewer.application.editor;

import com.example.gaebviewer.infrastructure.editor.persistence.GaebConstructionSiteEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebConstructionSiteRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebOwnerEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebOwnerRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebRequesterEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebRequesterRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class GaebMasterDataService {

    private final GaebOwnerRepository ownerRepository;
    private final GaebConstructionSiteRepository siteRepository;
    private final GaebRequesterRepository requesterRepository;

    public GaebMasterDataService(GaebOwnerRepository ownerRepository,
                                 GaebConstructionSiteRepository siteRepository,
                                 GaebRequesterRepository requesterRepository) {
        this.ownerRepository = ownerRepository;
        this.siteRepository = siteRepository;
        this.requesterRepository = requesterRepository;
    }

    @Transactional(readOnly = true)
    public List<NamedMasterData> loadOwners() {
        return ownerRepository.findAllByOrderByNameAsc().stream()
                .map(v -> new NamedMasterData(v.getId(), v.getName()))
                .toList();
    }

    @Transactional(readOnly = true)
    public List<NamedMasterData> loadConstructionSites() {
        return siteRepository.findAllByOrderByNameAsc().stream()
                .map(v -> new NamedMasterData(v.getId(), v.getName()))
                .toList();
    }

    @Transactional(readOnly = true)
    public List<NamedMasterData> loadRequesters() {
        return requesterRepository.findAllByOrderByNameAsc().stream()
                .map(v -> new NamedMasterData(v.getId(), v.getName()))
                .toList();
    }

    public NamedMasterData createOwner(String name) {
        String normalized = normalizeName(name);
        GaebOwnerEntity entity = ownerRepository.findByName(normalized)
                .orElseGet(() -> ownerRepository.save(new GaebOwnerEntity(UUID.randomUUID(), normalized)));
        return new NamedMasterData(entity.getId(), entity.getName());
    }

    public NamedMasterData createConstructionSite(String name) {
        String normalized = normalizeName(name);
        GaebConstructionSiteEntity entity = siteRepository.findByName(normalized)
                .orElseGet(() -> siteRepository.save(new GaebConstructionSiteEntity(UUID.randomUUID(), normalized)));
        return new NamedMasterData(entity.getId(), entity.getName());
    }

    public NamedMasterData createRequester(String name) {
        String normalized = normalizeName(name);
        GaebRequesterEntity entity = requesterRepository.findByName(normalized)
                .orElseGet(() -> requesterRepository.save(new GaebRequesterEntity(UUID.randomUUID(), normalized)));
        return new NamedMasterData(entity.getId(), entity.getName());
    }

    private String normalizeName(String name) {
        String normalized = name == null ? "" : name.trim();
        if (normalized.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        return normalized;
    }
}
