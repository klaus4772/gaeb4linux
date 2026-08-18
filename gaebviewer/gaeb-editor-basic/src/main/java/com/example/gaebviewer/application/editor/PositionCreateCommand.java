package com.example.gaebviewer.application.editor;

import java.math.BigDecimal;

public record PositionCreateCommand(
        String oz,
        BigDecimal quantity,
        String unit,
        String shortText,
        String longText,
        BigDecimal unitPrice,
        String textAddition
) {
}
