package com.example.gaeb.core.model;
import java.util.List;
import java.util.ArrayList;


public class Position {
    private String number;
    private String shortText;
    private List<ItemText> itemTexts = new ArrayList<>();

    // Getters and setters
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getShortText() { return shortText; }
    public void setShortText(String shortText) { this.shortText = shortText; }

    public List<ItemText> getItemTexts() { return itemTexts; }
    public void setItemTexts(List<ItemText> itemTexts) { this.itemTexts = itemTexts; }
}