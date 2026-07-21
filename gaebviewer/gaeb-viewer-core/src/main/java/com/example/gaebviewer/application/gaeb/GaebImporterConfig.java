package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImporterFactory.VersionedGaebImporter;
import com.example.gaebviewer.infrastructure.gaeb.GaebXmlParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Configuration
public class GaebImporterConfig {

    @Bean
    public GaebImporterFactory gaebImporterFactory(
            Optional<List<VersionedGaebImporter>> versionedImporters,
            GaebXmlParser fallbackImporter
    ) {
        return new GaebImporterFactory(versionedImporters.orElse(Collections.emptyList()), fallbackImporter);
    }
}