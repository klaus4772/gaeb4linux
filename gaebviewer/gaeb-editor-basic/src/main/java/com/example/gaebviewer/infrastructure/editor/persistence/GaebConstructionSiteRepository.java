package com.example.gaebviewer.infrastructure.editor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GaebConstructionSiteRepository extends JpaRepository<GaebConstructionSiteEntity, UUID> {

    Optional<GaebConstructionSiteEntity> findByName(String name);

    List<GaebConstructionSiteEntity> findAllByOrderByNameAsc();
}
