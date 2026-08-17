package com.example.gaebviewer.application.gaeb;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PriceNumberParserTest {

    @Test
    void parsesDotAsDecimalSeparator() {
        assertEquals(new BigDecimal("1.234"), PriceNumberParser.parse("1.234").orElseThrow());
    }

    @Test
    void parsesCommaAsDecimalSeparator() {
        assertEquals(new BigDecimal("1.234"), PriceNumberParser.parse("1,234").orElseThrow());
    }

    @Test
    void parsesGermanThousandsFormat() {
        assertEquals(new BigDecimal("1234.56"), PriceNumberParser.parse("1.234,56").orElseThrow());
    }

    @Test
    void parsesUsThousandsFormat() {
        assertEquals(new BigDecimal("1234.56"), PriceNumberParser.parse("1,234.56").orElseThrow());
    }

    @Test
    void returnsEmptyForInvalidInput() {
        assertTrue(PriceNumberParser.parse("abc").isEmpty());
    }
}
