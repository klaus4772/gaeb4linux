package com.example.gaebviewer.infrastructure.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImporterFactory;
import com.example.gaebviewer.application.gaeb.GaebSchemaVersion;
import com.example.gaebviewer.domain.gaeb.GaebBoQ;
import com.example.gaebviewer.domain.gaeb.GaebPosition;
import com.example.gaebviewer.domain.gaeb.GaebProject;
import com.example.gaebviewer.schema.da81.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.math.BigDecimal;

@Component
public class Da81JaxbImporter implements GaebImporterFactory.VersionedGaebImporter {

    // ⚠️ JAXBContext ist teuer → einmal erzeugen
    private static final JAXBContext CONTEXT = createContext();

    private static JAXBContext createContext() {
        try {
            return JAXBContext.newInstance("com.example.gaebviewer.schema.da81");
        } catch (Exception e) {
            throw new RuntimeException("Failed to create JAXBContext for DA81", e);
        }
    }

    @Override
    public GaebSchemaVersion supports() {
        return GaebSchemaVersion.DA81;
    }

    @Override
    public GaebProject importGaeb(InputStream inputStream) {

        try {
            Unmarshaller unmarshaller = CONTEXT.createUnmarshaller();

            Object root = unmarshaller.unmarshal(inputStream);

            // ⚠️ Hier prüfen wir erstmal nur Typ
            System.out.println("Unmarshalled root type: " + root.getClass());

            // Domain-Objekt vorbereiten
            GaebProject project = new GaebProject();
            project.setGaebVersion("DA81");

            // TODO: echtes Mapping kommt gleich

            return project;

        } catch (Exception e) {
            throw new RuntimeException("DA81 JAXB import failed", e);
        }
    }
}