package com.example.gaebviewer.application.editor;

import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorSettingsEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebEditorSettingsRepository;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebProjectNumberCounterEntity;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebProjectNumberCounterRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;

@Service
@Transactional
public class ProjectNumberService {

    private final GaebEditorSettingsRepository settingsRepository;
    private final GaebProjectNumberCounterRepository counterRepository;
    private final GaebDocumentRepository documentRepository;

    public ProjectNumberService(GaebEditorSettingsRepository settingsRepository,
                                GaebProjectNumberCounterRepository counterRepository,
                                GaebDocumentRepository documentRepository) {
        this.settingsRepository = settingsRepository;
        this.counterRepository = counterRepository;
        this.documentRepository = documentRepository;
    }

    public String nextProjectNumber() {
        GaebEditorSettingsEntity settings = settingsRepository.findById(GaebEditorSettingsEntity.SINGLETON_ID)
                .orElseGet(() -> settingsRepository.save(
                        new GaebEditorSettingsEntity(GaebEditorSettingsEntity.SINGLETON_ID, "P", 5)));
        if (settings.getProjectNumberDigits() < 1) {
            throw new IllegalStateException("projectNumberDigits must be >= 1");
        }

        GaebProjectNumberCounterEntity counter = counterRepository
                .findByIdForUpdate(GaebProjectNumberCounterEntity.SINGLETON_ID)
                .orElseGet(() -> counterRepository.save(
                        new GaebProjectNumberCounterEntity(GaebProjectNumberCounterEntity.SINGLETON_ID, 1)));

        long nextValue = counter.getNextValue();
        int maxAttempts = 1000;
        for (int i = 0; i < maxAttempts; i++) {
            String candidate = format(settings.getProjectNumberPrefix(), settings.getProjectNumberDigits(), nextValue);
            nextValue++;
            if (!documentRepository.existsByProjectNumber(candidate)) {
                counter.setNextValue(nextValue);
                return candidate;
            }
        }

        throw new IllegalStateException("Unable to generate unique project number after " + maxAttempts + " attempts");
    }

    @Transactional(readOnly = true)
    public String previewNextProjectNumber() {
        GaebEditorSettingsEntity settings = settingsRepository.findById(GaebEditorSettingsEntity.SINGLETON_ID)
                .orElse(new GaebEditorSettingsEntity(GaebEditorSettingsEntity.SINGLETON_ID, "P", 5));
        if (settings.getProjectNumberDigits() < 1) {
            throw new IllegalStateException("projectNumberDigits must be >= 1");
        }
        long nextValue = counterRepository.findById(GaebProjectNumberCounterEntity.SINGLETON_ID)
                .map(GaebProjectNumberCounterEntity::getNextValue)
                .orElse(1L);
        return format(settings.getProjectNumberPrefix(), settings.getProjectNumberDigits(), nextValue);
    }

    private String format(String prefix, int digits, long value) {
        String normalizedPrefix = prefix == null ? "" : prefix.trim().toUpperCase(Locale.ROOT);
        String number = String.format("%0" + digits + "d", value);
        return normalizedPrefix + number;
    }
}
