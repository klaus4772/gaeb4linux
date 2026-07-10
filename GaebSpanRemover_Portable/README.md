# GAEB Span Tag Remover - Portable Version

## Beschreibung

Dieses Programm entfernt alle `<span>` und `</span>` Tags aus GAEB DA85 XML-Dateien, speziell aus den `<DetailTxt>` Elementen (Long Text). Auch verschachtelte Span-Tags werden entfernt.

## Systemvoraussetzungen

- **Windows 11** (oder Windows 10)
- **Java 8 oder höher** muss installiert sein
  - Prüfen Sie Ihre Java-Version mit: `java -version`
  - Download: https://www.java.com/de/download/

## Installation

Keine Installation erforderlich! Einfach den gesamten Ordner `GaebSpanRemover_Portable` auf einen beliebigen PC kopieren.

## Verwendung

### Methode 1: Doppelklick (Einfachste Methode)

1. Doppelklicken Sie auf `GaebSpanRemover.bat`
2. Das Programm wird kompiliert und gestartet
3. Ein Fenster mit Dateiauswahl-Dialogen erscheint:
   - **Schritt 1:** Wählen Sie die GAEB-Eingabedatei (DA85 XML)
   - **Schritt 2:** Wählen Sie den Speicherort für die bereinigte Datei
4. Das Programm verarbeitet die Datei und zeigt eine Erfolgsmeldung

### Methode 2: Kommandozeile

```cmd
GaebSpanRemover.bat
```

## Was macht das Programm?

1. **Liest** eine GAEB DA85 XML-Datei ein
2. **Entfernt** alle `<span>` und `</span>` Tags aus `<DetailTxt>` Elementen
3. **Behält** den Text-Inhalt bei (nur die Tags werden entfernt)
4. **Speichert** die bereinigte XML-Datei

### Beispiel

**Vorher:**
```xml
<DetailTxt>
  <p>Dies ist <span>ein</span> Text mit <span>verschachtelten <span>Span</span> Tags</span>.</p>
</DetailTxt>
```

**Nachher:**
```xml
<DetailTxt>
  <p>Dies ist ein Text mit verschachtelten Span Tags.</p>
</DetailTxt>
```

## Ordnerstruktur

```
GaebSpanRemover_Portable/
├── GaebSpanRemover.bat          # Startskript (Doppelklick zum Starten)
├── README.md                     # Diese Datei
├── src/                          # Quellcode
│   └── com/example/gaebviewer/util/
│       └── GaebSpanRemover.java
└── classes/                      # Wird automatisch erstellt beim ersten Start
```

## Fehlerbehebung

### "Java ist nicht installiert oder nicht im PATH"

**Lösung:** Installieren Sie Java von https://www.java.com/de/download/

### "Kompilierung fehlgeschlagen"

**Lösung:** 
- Stellen Sie sicher, dass Sie Java 8 oder höher installiert haben
- Prüfen Sie, ob der `src` Ordner vorhanden ist

### "Fehler beim Parsen der XML-Datei"

**Lösung:**
- Stellen Sie sicher, dass die Eingabedatei eine gültige XML-Datei ist
- Prüfen Sie, ob die Datei im DA85 Format vorliegt

## Technische Details

- **Programmiersprache:** Java
- **Java-Version:** Kompatibel mit Java 8 und höher
- **Abhängigkeiten:** Keine (verwendet nur Java Standard-Bibliotheken)
- **GUI-Framework:** Java Swing (AWT)

## Integration in andere Projekte

Der Quellcode kann einfach in andere Java-Projekte integriert werden:

```java
import com.example.gaebviewer.util.GaebSpanRemover;

// Programmatischer Aufruf
GaebSpanRemover remover = new GaebSpanRemover();
remover.processFile("eingabe.xml", "ausgabe.xml");
```

## Lizenz

Dieses Programm ist Teil des gaebviewer-Projekts.

## Support

Bei Fragen oder Problemen wenden Sie sich bitte an den Entwickler.
