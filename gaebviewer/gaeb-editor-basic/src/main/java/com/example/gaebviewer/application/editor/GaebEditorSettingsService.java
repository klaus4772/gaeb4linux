package com.example.gaebviewer.application.editor;

import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorSettingOptionEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorSettingOptionRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorSettingsEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorSettingsRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.SettingOptionKey;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class GaebEditorSettingsService {

    private final GaebEditorSettingsRepository settingsRepository;
    private final GaebEditorSettingOptionRepository optionRepository;

    public GaebEditorSettingsService(GaebEditorSettingsRepository settingsRepository,
                                     GaebEditorSettingOptionRepository optionRepository) {
        this.settingsRepository = settingsRepository;
        this.optionRepository = optionRepository;
    }

    @Transactional(readOnly = true)
    public GaebEditorSettingsEntity loadSettings() {
        return settingsRepository.findById(GaebEditorSettingsEntity.SINGLETON_ID)
                .orElse(new GaebEditorSettingsEntity(GaebEditorSettingsEntity.SINGLETON_ID, "P", 5));
    }

    public GaebEditorSettingsEntity saveProjectNumberSettings(String prefix, int digits) {
        String normalizedPrefix = prefix == null ? "" : prefix.trim();
        if (digits < 1) {
            throw new IllegalArgumentException("projectNumberDigits must be >= 1");
        }
        GaebEditorSettingsEntity settings = settingsRepository.findById(GaebEditorSettingsEntity.SINGLETON_ID)
                .orElse(new GaebEditorSettingsEntity(GaebEditorSettingsEntity.SINGLETON_ID, "P", 5));
        settings.setProjectNumberPrefix(normalizedPrefix);
        settings.setProjectNumberDigits(digits);
        return settingsRepository.save(settings);
    }

    @Transactional(readOnly = true)
    public List<GaebEditorSettingOptionEntity> loadOptions(SettingOptionKey key) {
        return optionRepository.findByOptionKeyOrderBySortOrderAsc(key);
    }

    public GaebEditorSettingOptionEntity addOption(SettingOptionKey key, String value) {
        String normalized = normalizeValue(value);
        if (optionRepository.existsByOptionKeyAndOptionValue(key, normalized)) {
            throw new IllegalArgumentException("Option already exists: " + normalized);
        }
        int sortOrder = optionRepository.findMaxSortOrderByOptionKey(key).orElse(-1) + 1;
        return optionRepository.save(new GaebEditorSettingOptionEntity(UUID.randomUUID(), key, normalized, sortOrder));
    }

    @Transactional(readOnly = true)
    public boolean isAllowedOptionValue(SettingOptionKey key, String value) {
        if (value == null || value.trim().isEmpty()) {
            return true;
        }
        var options = optionRepository.findByOptionKeyOrderBySortOrderAsc(key);
        if (options.isEmpty()) {
            return true;
        }
        return optionRepository.existsByOptionKeyAndOptionValue(key, value.trim());
    }

    public GaebEditorSettingOptionEntity updateOption(UUID optionId, String newValue) {
        GaebEditorSettingOptionEntity option = optionRepository.findById(optionId)
                .orElseThrow(() -> new EntityNotFoundException("No option found for id " + optionId));
        String normalized = normalizeValue(newValue);
        if (!option.getOptionValue().equals(normalized)
                && optionRepository.existsByOptionKeyAndOptionValue(option.getOptionKey(), normalized)) {
            throw new IllegalArgumentException("Option already exists: " + normalized);
        }
        option.setOptionValue(normalized);
        return option;
    }

    public void deleteOption(UUID optionId) {
        GaebEditorSettingOptionEntity option = optionRepository.findById(optionId)
                .orElseThrow(() -> new EntityNotFoundException("No option found for id " + optionId));
        SettingOptionKey key = option.getOptionKey();
        optionRepository.delete(option);
        normalizeSortOrder(key);
    }

    public void moveOptionUp(UUID optionId) {
        moveOption(optionId, -1);
    }

    public void moveOptionDown(UUID optionId) {
        moveOption(optionId, 1);
    }

    private void moveOption(UUID optionId, int direction) {
        GaebEditorSettingOptionEntity option = optionRepository.findById(optionId)
                .orElseThrow(() -> new EntityNotFoundException("No option found for id " + optionId));
        List<GaebEditorSettingOptionEntity> options = optionRepository.findByOptionKeyOrderBySortOrderAsc(option.getOptionKey());
        int currentIndex = indexOfOption(options, optionId);
        int targetIndex = currentIndex + direction;
        if (targetIndex < 0 || targetIndex >= options.size()) {
            return;
        }
        GaebEditorSettingOptionEntity target = options.get(targetIndex);
        int currentOrder = option.getSortOrder();
        option.setSortOrder(target.getSortOrder());
        target.setSortOrder(currentOrder);
    }

    private int indexOfOption(List<GaebEditorSettingOptionEntity> options, UUID optionId) {
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).getId().equals(optionId)) {
                return i;
            }
        }
        throw new EntityNotFoundException("No option found for id " + optionId);
    }

    private void normalizeSortOrder(SettingOptionKey key) {
        List<GaebEditorSettingOptionEntity> options = optionRepository.findByOptionKeyOrderBySortOrderAsc(key);
        for (int i = 0; i < options.size(); i++) {
            options.get(i).setSortOrder(i);
        }
    }

    private String normalizeValue(String value) {
        String normalized = value == null ? "" : value.trim();
        if (normalized.isEmpty()) {
            throw new IllegalArgumentException("Option value must not be empty");
        }
        return normalized;
    }
}
