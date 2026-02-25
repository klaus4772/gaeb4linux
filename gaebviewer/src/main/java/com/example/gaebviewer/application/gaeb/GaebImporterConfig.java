package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImporterFactory.VersionedGaebImporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class GaebImporterConfig {

    @Bean
    public GaebImporterFactory gaebImporterFactory(
            List<VersionedGaebImporter> versionedImporters,
            GaebImporter fallbackImporter
    ) {
        return new GaebImporterFactory(versionedImporters, fallbackImporter);
    }
}