package com.example.gaebviewer.application.editor;

import org.springframework.stereotype.Service;

@Service
public class OzFormattingService {

    public String formatLevelValue(int value, int digits, String fillCharacter) {
        if (digits < 1) {
            throw new IllegalArgumentException("digits must be >= 1");
        }
        String base = Integer.toString(value);
        if (fillCharacter == null || fillCharacter.isEmpty()) {
            return base;
        }
        if (base.length() >= digits) {
            return base;
        }
        String fill = fillCharacter.substring(0, 1);
        StringBuilder builder = new StringBuilder(digits);
        for (int i = base.length(); i < digits; i++) {
            builder.append(fill);
        }
        builder.append(base);
        return builder.toString();
    }
}
