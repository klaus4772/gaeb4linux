# GAEB Viewer - Modulare Architektur

Das gaebviewer-Projekt wurde in eine modulare Struktur aufgeteilt, um bessere Trennung von Concerns und zukünftige Erweiterbarkeit zu ermöglichen.

## Module

### 1. **gaeb-viewer-core** 
   - **Zweck**: Kernfunktionalität für die Anzeige und das Parsing von GAEB-Dateien
   - **Verantwortlichkeiten**:
     - GAEB-Datei-Importe (DA80-DA87)
     - XML-Parsing und Namensraum-Behandlung
     - Domänenmodelle für GAEB-Strukturen (GaebProject, GaebBoQ, GaebPosition)
     - Basis-Domänenmodelle (Tender, Position, ItemText, PriceBreakdown)
   - **Abhängigkeiten**: GAEB-Schema-Module, Jakarta XML Bind, Spring Boot
   - **Verzeichnisse**:
     - `infrastructure/gaeb/` - JAXB-Importer für verschiedene DA-Versionen
     - `application/gaeb/` - Import-Services
     - `domain/gaeb/` - GAEB-spezifische Domänenmodelle
     - `domain/` - Basis-Domänenmodelle
     - `util/` - Utility-Funktionen

### 2. **gaeb-editor-basic**
   - **Zweck**: Basis-Funktionalität für Preis-Eingabe und Bearbeitung
   - **Verantwortlichkeiten**:
     - VOBB-Geschäftslogik (Zuschlag-Kalkulation)
     - CSV-Import für Preise
     - Excel-Export für Ergebnisse
     - Positionsabrechnung und Preisberechnungen
   - **Abhängigkeiten**: gaeb-viewer-core, Apache POI, Commons CSV
   - **Verzeichnisse**:
     - `domain/vobb/` - VOBB-Geschäftslogik
     - `infrastructure/vobb/` - CSV-Import, Excel-Export
     - `application/vobb/` - Geschäfts-Use-Cases

### 3. **gaeb-viewer-app**
   - **Zweck**: Main-Anwendung mit UI-Layer
   - **Verantwortlichkeiten**:
     - Vaadin-UI-Komponenten
     - Startpunkt der Anwendung
     - REST-API-Endpoints
     - Frontend-Integration
     - Deployment und Packaging
   - **Abhängigkeiten**: gaeb-viewer-core, gaeb-editor-basic, Vaadin, Spring Boot Web
   - **Verzeichnisse**:
     - `ui/` - Vaadin-UI-Views
     - `api/` - REST-Controller
     - `frontend/` - Typescript/JavaScript-Resourcen
     - `src/assembly/` - Deployment-Konfiguration

## Architektur-Übersicht

```
┌─────────────────────────────────────────┐
│     gaeb-viewer-app (Spring Boot App)   │
│  - Vaadin UI                            │
│  - REST Endpoints                       │
│  - Application Main                     │
└────────────┬────────────┬───────────────┘
             │            │
    ┌────────▼────┐  ┌────▼──────────────┐
    │gaeb-viewer  │  │ gaeb-editor-basic  │
    │-core        │  │ - VOBB Logic       │
    │- GAEB I/O   │  │ - CSV/Excel        │
    │- Parsing    │  │ - Calculations     │
    └────────┬────┘  └────┬──────────────┘
             │            │
             └────────┬───┘
                      │
         ┌────────────▼──────────┐
         │ gaeb-schema-da80..87  │
         │ (JAXB-Generated)      │
         └───────────────────────┘
```

## Zukünftige Erweiterungen

Die modulare Struktur ermöglicht einfach neue Module hinzuzufügen:

- **gaeb-editor-advanced** - Erweiterte Bearbeitungsfunktionen
- **gaeb-exporter-pdf** - PDF-Export
- **gaeb-analyzer** - Analyse und Reporting
- **gaeb-validator** - Schema-Validierung
- **gaeb-cli** - Command-Line-Interface

## Build und Ausführung

### Build des gesamten Projekts
```bash
cd /home/klaus/IdeaProjects/gaeb4linux
mvn clean install
```

### Build eines spezifischen Moduls
```bash
mvn clean install -pl gaebviewer/gaeb-viewer-core
```

### Ausführung der App
```bash
mvn spring-boot:run -pl gaebviewer/gaeb-viewer-app
```

## Abhängigkeitsbaum

```
gaeb-viewer-app
├── gaeb-viewer-core
│   ├── gaeb-schema-da80 ... da87
│   └── Jakarta XML Bind
└── gaeb-editor-basic
    └── gaeb-viewer-core
```

## Paket-Struktur

Alle Module verwenden die Base-Package `com.example.gaebviewer` mit Sub-Packages für spezifische Funktionalität:

- **core**: `com.example.gaebviewer.{infrastructure.gaeb, application.gaeb, domain.gaeb}`
- **editor-basic**: `com.example.gaebviewer.{domain.vobb, infrastructure.vobb, application.vobb}`
- **app**: `com.example.gaebviewer.{ui, api}`

Dies ermöglicht:
- Klare Trennung der Verantwortlichkeiten
- Einfache Navigation im Code
- Möglichkeit, Module unabhängig zu testen
- Klare Abhängigkeitsrichtung: app → editor-basic → core
 
## Archivierung der alten Quelldateien

Damit die ursprünglichen Quellen nicht verloren gehen und die Umstellung reversibel bleibt, wurden die alten Java-Quellen aus
`gaebviewer/src/main/java` in das Verzeichnis `gaebviewer/archived-src-java` verschoben. Dadurch vermeidest du doppelte Klassen während
der Modul-Entwicklung und IDE-Indexierungskonflikte.

Wiederherstellung (falls benötigt):

```bash
# Zurückkopieren (vorsichtig - überschreibt vorhandene Dateien)
mv gaebviewer/archived-src-java gaebviewer/src/main/java
```

Empfehlung: Sobald du bestätigt hast, dass alle Klassen korrekt in den neuen Modulen liegen und die IDE das Projekt sauber lädt, kannst du
`gaebviewer/archived-src-java` löschen oder ins Repository-Backup verschieben.

