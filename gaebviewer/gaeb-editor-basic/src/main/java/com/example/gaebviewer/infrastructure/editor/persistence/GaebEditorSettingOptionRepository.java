package com.example.gaebviewer.infrastructure.editor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GaebEditorSettingOptionRepository extends JpaRepository<GaebEditorSettingOptionEntity, UUID> {

    List<GaebEditorSettingOptionEntity> findByOptionKeyOrderBySortOrderAsc(SettingOptionKey optionKey);

    boolean existsByOptionKeyAndOptionValue(SettingOptionKey optionKey, String optionValue);

    @Query("select max(o.sortOrder) from GaebEditorSettingOptionEntity o where o.optionKey = ?1")
    Optional<Integer> findMaxSortOrderByOptionKey(SettingOptionKey optionKey);
}
