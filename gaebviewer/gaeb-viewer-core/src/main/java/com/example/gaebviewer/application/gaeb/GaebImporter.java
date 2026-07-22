package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.domain.GaebProject;

import java.io.InputStream;

public interface GaebImporter {
    GaebProject importGaeb(InputStream inputStream);
}