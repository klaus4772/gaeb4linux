package com.example.gaebviewer.domain.gaeb;

import java.util.ArrayList;
import java.util.List;

public class GaebBoQ {

    private String title;
    private final List<GaebPosition> positions = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public List<GaebPosition> getPositions() {
        return positions;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addPosition(GaebPosition position) {
        this.positions.add(position);
    }
}