package com.example.gaebviewer.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class GaebProject {

    private UUID id;
    private String name;
    private String sourceFileName;
    private String gaebVersion;
    private String currencyCode = "EUR";

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

    public String getCurrencyCode() {
        return currencyCode;
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

    public void setCurrencyCode(String currencyCode) {
        if (currencyCode == null || currencyCode.isBlank()) {
            this.currencyCode = "EUR";
            return;
        }
        this.currencyCode = currencyCode.trim().toUpperCase(Locale.ROOT);
    }

    public void addBoQ(GaebBoQ boq) {
        this.boqs.add(boq);
    }
}