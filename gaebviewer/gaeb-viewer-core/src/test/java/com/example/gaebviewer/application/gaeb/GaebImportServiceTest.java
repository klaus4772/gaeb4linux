package com.example.gaebviewer.application.gaeb;

import com.example.gaebviewer.domain.GaebBoQ;
import com.example.gaebviewer.domain.GaebPosition;
import com.example.gaebviewer.domain.GaebProject;
import com.example.gaebviewer.infrastructure.gaeb.GaebNamespaceResolver;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GaebImportServiceTest {

    @Test
    void fallsBackToGenericParserWhenSchemaImporterFails() {
        GaebNamespaceResolver namespaceResolver = new GaebNamespaceResolver() {
            @Override
            public String detectRootNamespace(InputStream in) {
                return "http://www.gaeb.de/GAEB_DA_XML/DA81/3.3";
            }

            @Override
            public GaebSchemaVersion detectSchemaVersion(String namespace) {
                return GaebSchemaVersion.DA81;
            }
        };

        GaebImporterFactory.VersionedGaebImporter da81Importer = new GaebImporterFactory.VersionedGaebImporter() {
            @Override
            public GaebSchemaVersion supports() {
                return GaebSchemaVersion.DA81;
            }

            @Override
            public GaebProject importGaeb(InputStream inputStream) {
                throw new RuntimeException("DA81 JAXB import failed");
            }
        };

        GaebProject expected = new GaebProject();
        GaebImporter fallbackImporter = inputStream -> expected;
        GaebImporterFactory importerFactory = new GaebImporterFactory(List.of(da81Importer), fallbackImporter);

        GaebImportService service = new GaebImportService(namespaceResolver, importerFactory);
        GaebProject project = service.importGaeb(new ByteArrayInputStream("<GAEB/>".getBytes()));

        assertSame(expected, project);
        assertEquals("EUR", project.getCurrencyCode());
    }

    @Test
    void readsCurrencyCodeFromCurElement() {
        GaebNamespaceResolver namespaceResolver = new GaebNamespaceResolver();
        GaebImporter fallbackImporter = inputStream -> new GaebProject();
        GaebImporterFactory importerFactory = new GaebImporterFactory(List.of(), fallbackImporter);

        GaebImportService service = new GaebImportService(namespaceResolver, importerFactory);
        GaebProject project = service.importGaeb(new ByteArrayInputStream("<GAEB><Cur>CHF</Cur></GAEB>".getBytes()));

        assertEquals("CHF", project.getCurrencyCode());
    }

    @Test
    void defaultsCurrencyCodeToEuroWhenCurElementIsMissing() {
        GaebNamespaceResolver namespaceResolver = new GaebNamespaceResolver();
        GaebImporter fallbackImporter = inputStream -> new GaebProject();
        GaebImporterFactory importerFactory = new GaebImporterFactory(List.of(), fallbackImporter);

        GaebImportService service = new GaebImportService(namespaceResolver, importerFactory);
        GaebProject project = service.importGaeb(new ByteArrayInputStream("<GAEB/>".getBytes()));

        assertEquals("EUR", project.getCurrencyCode());
    }

    @Test
    void importsBidderTextComplementsAndRequiredFlags() {
        GaebProject importedProject = new GaebProject();
        GaebBoQ boq = new GaebBoQ();
        GaebPosition position = new GaebPosition();
        position.setNumber("1");
        boq.addPosition(position);
        importedProject.addBoQ(boq);

        GaebImporter fallbackImporter = inputStream -> importedProject;
        GaebImporterFactory importerFactory = new GaebImporterFactory(List.of(), fallbackImporter);
        GaebImportService service = new GaebImportService(new GaebNamespaceResolver(), importerFactory);

        String xml = """
                <GAEB>
                  <Item RNoPart="1">
                    <Description>
                      <CompleteText>
                        <ComplTSB>Yes</ComplTSB>
                        <DetailTxt>
                          <TextComplement MarkLbl="42" Kind="Bidder" Empty="Yes">
                            <ComplCaption>Erzeugnis des Belages</ComplCaption>
                            <ComplBody>'................................'</ComplBody>
                            <ComplTail>Optional</ComplTail>
                          </TextComplement>
                          <TextComplement MarkLbl="52" Kind="Bidder">
                            <ComplCaption>Erzeugnis</ComplCaption>
                            <ComplBody>Produkt A</ComplBody>
                            <ComplTail>Pflicht</ComplTail>
                          </TextComplement>
                        </DetailTxt>
                      </CompleteText>
                    </Description>
                  </Item>
                </GAEB>
                """;

        GaebProject project = service.importGaeb(new ByteArrayInputStream(xml.getBytes()));

        assertEquals(2, project.getBoqs().get(0).getPositions().get(0).getBidderTextComplements().size());
        assertFalse(project.getBoqs().get(0).getPositions().get(0).getBidderTextComplements().get(0).isRequired());
        assertEquals("", project.getBoqs().get(0).getPositions().get(0).getBidderTextComplements().get(0).getBody());
        assertEquals("Produkt A", project.getBoqs().get(0).getPositions().get(0).getBidderTextComplements().get(1).getBody());
        assertTrue(project.getBoqs().get(0).getPositions().get(0).getBidderTextComplements().get(1).isRequired());
    }
}
