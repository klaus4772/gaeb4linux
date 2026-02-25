package com.example.gaebviewer.application.gaeb;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class GaebImporterFactory {

    private final Map<GaebSchemaVersion, GaebImporter> byVersion = new EnumMap<>(GaebSchemaVersion.class);
    private final GaebImporter fallback;

    public GaebImporterFactory(List<VersionedGaebImporter> importers, GaebImporter fallback) {
        this.fallback = fallback;
        for (VersionedGaebImporter i : importers) {
            byVersion.put(i.supports(), i);
        }
    }

    public GaebImporter forVersion(GaebSchemaVersion version) {
        return byVersion.getOrDefault(version, fallback);
    }

    public interface VersionedGaebImporter extends GaebImporter {
        GaebSchemaVersion supports();
    }
}