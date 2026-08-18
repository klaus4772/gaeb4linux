package com.example.gaebviewer.infrastructure.editor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GaebOwnerRepository extends JpaRepository<GaebOwnerEntity, UUID> {

    Optional<GaebOwnerEntity> findByName(String name);

    List<GaebOwnerEntity> findAllByOrderByNameAsc();
}
