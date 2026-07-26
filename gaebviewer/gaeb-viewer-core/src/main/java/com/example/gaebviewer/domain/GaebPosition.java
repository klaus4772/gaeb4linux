package com.example.gaebviewer.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GaebPosition {

    private String number;
    private String shortText;
    private String longText;

    private BigDecimal quantity;
    private String unit;

    private BigDecimal unitPrice;
    private final List<GaebTextComplement> bidderTextComplements = new ArrayList<>();

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

    public List<GaebTextComplement> getBidderTextComplements() {
        return bidderTextComplements;
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

    public void setBidderTextComplements(List<GaebTextComplement> bidderTextComplements) {
        this.bidderTextComplements.clear();
        if (bidderTextComplements != null) {
            this.bidderTextComplements.addAll(bidderTextComplements);
        }
    }

    public BigDecimal getTotalPrice() {
        if (quantity == null || unitPrice == null) {
            return BigDecimal.ZERO;
        }
        return quantity.multiply(unitPrice);
    }

    public boolean hasBidderTextComplements() {
        return !bidderTextComplements.isEmpty();
    }

    public boolean hasMissingRequiredBidderTextComplements() {
        return bidderTextComplements.stream().anyMatch(GaebTextComplement::isMissingRequiredValue);
    }
}