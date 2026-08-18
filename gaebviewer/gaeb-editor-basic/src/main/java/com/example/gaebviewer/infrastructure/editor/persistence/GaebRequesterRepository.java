package com.example.gaebviewer.infrastructure.editor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GaebRequesterRepository extends JpaRepository<GaebRequesterEntity, UUID> {

    Optional<GaebRequesterEntity> findByName(String name);

    List<GaebRequesterEntity> findAllByOrderByNameAsc();
}
