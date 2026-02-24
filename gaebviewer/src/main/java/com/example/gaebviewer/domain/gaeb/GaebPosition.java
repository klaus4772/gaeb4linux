package com.example.gaebviewer.domain.gaeb;

import java.math.BigDecimal;

public class GaebPosition {

    private String number;
    private String shortText;
    private String longText;

    private BigDecimal quantity;
    private String unit;

    private BigDecimal unitPrice;

    public String getNumber() {
        return number;
    }

    public String getShortText() {
        return shortText;
    }

    public String getLongText() {
        return longText;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public void setLongText(String longText) {
        this.longText = longText;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        if (quantity == null || unitPrice == null) {
            return BigDecimal.ZERO;
        }
        return quantity.multiply(unitPrice);
    }
}