package com.example.gaebviewer.domain.gaeb;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GaebProject {

    private UUID id;
    private String name;
    private String sourceFileName;
    private String gaebVersion;

    private final List<GaebBoQ> boqs = new ArrayList<>();

    public GaebProject() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSourceFileName() {
        return sourceFileName;
    }

    public String getGaebVersion() {
        return gaebVersion;
    }

    public List<GaebBoQ> getBoqs() {
        return boqs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    public void setGaebVersion(String gaebVersion) {
        this.gaebVersion = gaebVersion;
    }

    public void addBoQ(GaebBoQ boq) {
        this.boqs.add(boq);
    }
}