package com.example.gaebviewer.infrastructure.gaeb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * Test für die Text-Extraktionslogik in den JAXB-Importern.
 * Da wir die generierten Klassen nicht einfach instanziieren können ohne den Build,
 * testen wir hier die Logik der Da81JaxbImporter.extractAllText Methode 
 * (beispielhaft für alle Importer, da sie identisch sind).
 */
public class TextExtractionTest {

    @Test
    public void testExtraction() throws Exception {
        // Wir nutzen eine Instanz von Da81JaxbImporter für den Test
        Da81JaxbImporter importer = new Da81JaxbImporter();
        
        // Test 1: Einfacher String
        assertEquals("Hallo Welt", importer.invokePrivateExtractAllText("Hallo Welt"));
        
        // Test 2: JAXBElement mit String
        JAXBElement<String> je = new JAXBElement<>(new QName("test"), String.class, "JAXB Inhalt");
        assertEquals("JAXB Inhalt", importer.invokePrivateExtractAllText(je));
        
        // Test 3: Liste von Objekten
        List<Object> list = new ArrayList<>();
        list.add("Punkt 1");
        list.add(new JAXBElement<>(new QName("test"), String.class, "Punkt 2"));
        assertEquals("Punkt 1 Punkt 2", importer.invokePrivateExtractAllText(list));
    }

    // Hilfsklasse / Methode um private Methoden zu testen oder die Logik zu simulieren
    // In diesem Fall rufen wir die Methode über Reflection auf, da sie private ist
    private static class Da81JaxbImporter extends com.example.gaebviewer.infrastructure.gaeb.Da81JaxbImporter {
        public String invokePrivateExtractAllText(Object obj) throws Exception {
            java.lang.reflect.Method m = com.example.gaebviewer.infrastructure.gaeb.Da81JaxbImporter.class.getDeclaredMethod("extractAllText", Object.class);
            m.setAccessible(true);
            return (String) m.invoke(this, obj);
        }
    }
}
