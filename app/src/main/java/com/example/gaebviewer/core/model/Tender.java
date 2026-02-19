package com.example.gaebviewer.core.model;

import java.util.List;
import java.util.ArrayList;

public class Tender {
    private String id;
    private String title;
    private List<Position> positions = new ArrayList<>();

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<Position> getPositions() { return positions; }
    public void setPositions(List<Position> positions) { this.positions = positions; }
}