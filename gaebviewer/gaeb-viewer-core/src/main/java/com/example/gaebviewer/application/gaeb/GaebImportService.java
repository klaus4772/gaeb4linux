package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.domain.GaebProject;
import com.example.gaebviewer.infrastructure.gaeb.GaebNamespaceResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class GaebImportService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GaebImportService.class);

    private final GaebNamespaceResolver namespaceResolver;
    private final GaebImporterFactory importerFactory;

    public GaebImportService(GaebNamespaceResolver namespaceResolver,
                             GaebImporterFactory importerFactory) {
        this.namespaceResolver = namespaceResolver;
        this.importerFactory = importerFactory;
    }

    public GaebProject importGaeb(InputStream inputStream) {
        BufferedGaebInput buffer = BufferedGaebInput.from(inputStream);

        String ns = null;
        GaebSchemaVersion version = GaebSchemaVersion.UNKNOWN;
        try {
            ns = namespaceResolver.detectRootNamespace(buffer.newStream());
            version = namespaceResolver.detectSchemaVersion(ns);
        } catch (RuntimeException detectionException) {
            LOGGER.warn("Failed to detect GAEB namespace/version, using generic parser fallback.");
            LOGGER.debug("Namespace detection error details", detectionException);
        }

        GaebImporter importer = importerFactory.forVersion(version);
        GaebImporter fallbackImporter = importerFactory.forVersion(GaebSchemaVersion.UNKNOWN);

        GaebProject project;
        try {
            project = importer.importGaeb(buffer.newStream());
        } catch (RuntimeException primaryException) {
            if (fallbackImporter == importer) {
                throw primaryException;
            }
            LOGGER.warn("Schema-specific import failed for {}, retrying with generic parser.", version);
            LOGGER.debug("Schema-specific import error details", primaryException);
            project = fallbackImporter.importGaeb(buffer.newStream());
        }

        // Optional: Namespace/Version im Projekt setzen (falls Importer das nicht macht)
        if (project.getGaebVersion() == null) {
            project.setGaebVersion(ns);
        }

        return project;
    }
}