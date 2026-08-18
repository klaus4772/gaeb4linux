package com.example.gaebviewer.api;

import com.example.gaebviewer.application.editor.GaebEditorSettingsService;
import com.example.gaebviewer.infrastructure.editor.persistence.SettingOptionKey;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@ConditionalOnProperty(name = "gaeb.api.enabled", havingValue = "true")
@RequestMapping("/api/settings")
public class SettingsController {

    private final GaebEditorSettingsService settingsService;

    public SettingsController(GaebEditorSettingsService settingsService) {
        this.settingsService = settingsService;
    }

    @GetMapping
    public Map<String, Object> getSettings() {
        var settings = settingsService.loadSettings();
        return Map.of(
                "projectNumberPrefix", settings.getProjectNumberPrefix(),
                "projectNumberDigits", settings.getProjectNumberDigits(),
                "nameOptions", values(SettingOptionKey.NAME),
                "lblBoQOptions", values(SettingOptionKey.LBL_BOQ),
                "currencyOptions", values(SettingOptionKey.CUR),
                "currencyLabelOptions", values(SettingOptionKey.CUR_LBL),
                "cpvCodeOptions", values(SettingOptionKey.CPV_CODE),
                "categoryOptions", values(SettingOptionKey.CAT)
        );
    }

    @PatchMapping
    public Map<String, Object> updateSettings(@RequestBody ProjectNumberSettingsRequest request) {
        var updated = settingsService.saveProjectNumberSettings(request.projectNumberPrefix(), request.projectNumberDigits());
        return Map.of(
                "projectNumberPrefix", updated.getProjectNumberPrefix(),
                "projectNumberDigits", updated.getProjectNumberDigits()
        );
    }

    @GetMapping("/options/{key}")
    public List<OptionDto> getOptions(@PathVariable("key") SettingOptionKey key) {
        return settingsService.loadOptions(key).stream()
                .map(v -> new OptionDto(v.getId(), v.getOptionValue(), v.getSortOrder()))
                .toList();
    }

    @PostMapping("/options/{key}")
    public OptionDto addOption(@PathVariable("key") SettingOptionKey key, @RequestBody OptionValueRequest request) {
        var created = settingsService.addOption(key, request.value());
        return new OptionDto(created.getId(), created.getOptionValue(), created.getSortOrder());
    }

    @PatchMapping("/options/{optionId}")
    public OptionDto updateOption(@PathVariable("optionId") UUID optionId, @RequestBody OptionValueRequest request) {
        var updated = settingsService.updateOption(optionId, request.value());
        return new OptionDto(updated.getId(), updated.getOptionValue(), updated.getSortOrder());
    }

    @DeleteMapping("/options/{optionId}")
    public void deleteOption(@PathVariable("optionId") UUID optionId) {
        settingsService.deleteOption(optionId);
    }

    @PostMapping("/options/{optionId}/move")
    public void moveOption(@PathVariable("optionId") UUID optionId, @RequestParam("direction") String direction) {
        if ("up".equalsIgnoreCase(direction)) {
            settingsService.moveOptionUp(optionId);
            return;
        }
        if ("down".equalsIgnoreCase(direction)) {
            settingsService.moveOptionDown(optionId);
            return;
        }
        throw new IllegalArgumentException("direction must be 'up' or 'down'");
    }

    private List<String> values(SettingOptionKey key) {
        return settingsService.loadOptions(key).stream().map(v -> v.getOptionValue()).toList();
    }

    public record ProjectNumberSettingsRequest(String projectNumberPrefix, int projectNumberDigits) {
    }

    public record OptionValueRequest(String value) {
    }

    public record OptionDto(UUID id, String value, int sortOrder) {
    }
}
