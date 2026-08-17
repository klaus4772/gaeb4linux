package com.example.gaebviewer.application.gaeb;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * Parses price-like number inputs with either comma or dot decimal separators.
 */
public final class PriceNumberParser {

    private PriceNumberParser() {
    }

    public static Optional<BigDecimal> parse(String rawValue) {
        if (rawValue == null) {
            return Optional.empty();
        }

        String value = rawValue
                .trim()
                .replace("\u00A0", "")
                .replace(" ", "")
                .replace("'", "");

        if (value.isEmpty() || !value.matches("[+-]?\\d[\\d.,]*")) {
            return Optional.empty();
        }

        int commaCount = count(value, ',');
        int dotCount = count(value, '.');

        String normalized = value;

        if (commaCount > 0 && dotCount > 0) {
            int lastComma = value.lastIndexOf(',');
            int lastDot = value.lastIndexOf('.');
            char decimalSeparator = lastComma > lastDot ? ',' : '.';
            char groupingSeparator = decimalSeparator == ',' ? '.' : ',';

            normalized = value.replace(String.valueOf(groupingSeparator), "");
            if (decimalSeparator == ',') {
                normalized = normalized.replace(',', '.');
            }
        } else if (commaCount > 0) {
            normalized = commaCount == 1 ? value.replace(',', '.') : value.replace(",", "");
        } else if (dotCount > 1) {
            normalized = value.replace(".", "");
        }

        try {
            return Optional.of(new BigDecimal(normalized));
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }
    }

    private static int count(String value, char target) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
