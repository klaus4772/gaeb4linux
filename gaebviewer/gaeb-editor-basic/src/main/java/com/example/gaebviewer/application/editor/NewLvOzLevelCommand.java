package com.example.gaebviewer.application.editor;

public record NewLvOzLevelCommand(
        int level,
        String label,
        int digits,
        int step,
        String fillCharacter
) {
}
