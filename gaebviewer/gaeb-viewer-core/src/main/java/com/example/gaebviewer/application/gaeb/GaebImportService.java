package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.domain.GaebProject;
import com.example.gaebviewer.infrastructure.gaeb.GaebNamespaceResolver;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class GaebImportService {

    private final GaebNamespaceResolver namespaceResolver;
    private final GaebImporterFactory importerFactory;

    public GaebImportService(GaebNamespaceResolver namespaceResolver,
                             GaebImporterFactory importerFactory) {
        this.namespaceResolver = namespaceResolver;
        this.importerFactory = importerFactory;
    }

    public GaebProject importGaeb(InputStream inputStream) {
        BufferedGaebInput buffer = BufferedGaebInput.from(inputStream);

        String ns = namespaceResolver.detectRootNamespace(buffer.newStream());
        GaebSchemaVersion version = namespaceResolver.detectSchemaVersion(ns);

        GaebImporter importer = importerFactory.forVersion(version);

        GaebProject project = importer.importGaeb(buffer.newStream());

        // Optional: Namespace/Version im Projekt setzen (falls Importer das nicht macht)
        if (project.getGaebVersion() == null) {
            project.setGaebVersion(ns);
        }

        return project;
    }
}