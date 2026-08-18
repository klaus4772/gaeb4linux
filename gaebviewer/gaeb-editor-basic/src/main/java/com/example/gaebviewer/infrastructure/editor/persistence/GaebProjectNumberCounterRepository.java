package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface GaebProjectNumberCounterRepository extends JpaRepository<GaebProjectNumberCounterEntity, Integer> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("select c from GaebProjectNumberCounterEntity c where c.id = ?1")
    Optional<GaebProjectNumberCounterEntity> findByIdForUpdate(Integer id);
}
