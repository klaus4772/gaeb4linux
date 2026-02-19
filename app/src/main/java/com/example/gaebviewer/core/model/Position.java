package com.example.gaebviewer.core.model;

import java.util.List;
import java.util.ArrayList;

public class Position {

    private String number;
    private String shortText;
    private List<ItemText> itemTexts = new ArrayList<>();

    // NEU: Vertragsdaten
    private String unit;
    private double contractQuantity;
    private double unitPrice;

    // optional später
    private PriceBreakdown priceBreakdown;

    // ===== Getter / Setter =====

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getShortText() { return shortText; }
    public void setShortText(String shortText) { this.shortText = shortText; }

    public List<ItemText> getItemTexts() { return itemTexts; }
    public void setItemTexts(List<ItemText> itemTexts) { this.itemTexts = itemTexts; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public double getContractQuantity() { return contractQuantity; }
    public void setContractQuantity(double contractQuantity) {
        this.contractQuantity = contractQuantity;
    }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public PriceBreakdown getPriceBreakdown() {
        return priceBreakdown;
    }

    public void setPriceBreakdown(PriceBreakdown priceBreakdown) {
        this.priceBreakdown = priceBreakdown;
    }

    // Hilfsmethode
    public double getContractAmount() {
        return contractQuantity * unitPrice;
    }
}
