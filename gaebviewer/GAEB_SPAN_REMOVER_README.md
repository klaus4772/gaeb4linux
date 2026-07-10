# GAEB Span Tag Remover

## Beschreibung

Eigenständiges Java-Programm zum Entfernen von `<span>` Tags aus GAEB DA85 XML-Dateien.

Das Programm:
- Liest GAEB DA85 XML-Dateien ein (*.xml, *.x85)
- Entfernt alle `<span>` und `</span>` Tags (auch verschachtelte) aus `<DetailTxt>` Elementen
- Behält den Textinhalt bei, entfernt nur die Tags
- Speichert die bereinigte XML-Datei

## Funktionen

- ✅ Grafische Benutzeroberfläche (Swing)
- ✅ Dateiauswahl-Dialoge für Eingabe und Ausgabe
- ✅ Automatische Vorschlag für Ausgabedatei (mit "_cleaned" Suffix)
- ✅ Protokoll-Anzeige mit Fortschritt
- ✅ Fehlerbehandlung und Benutzer-Feedback
- ✅ Asynchrone Verarbeitung (UI bleibt responsiv)

## Ausführung

### Variante 1: Mit Maven (empfohlen)

```bash
cd gaebviewer
mvn compile exec:java -Dexec.mainClass="com.example.gaebviewer.util.GaebSpanRemover"
```

### Variante 2: Mit Java direkt

```bash
cd gaebviewer
javac -d target/classes -sourcepath src/main/java src/main/java/com/example/gaebviewer/util/GaebSpanRemover.java
java -cp target/classes com.example.gaebviewer.util.GaebSpanRemover
```

### Variante 3: Mit Batch-Datei (Windows)

Doppelklick auf `run_gaeb_span_remover.bat`

## Verwendung

1. Programm starten
2. "Durchsuchen..." bei Eingabedatei klicken und GAEB DA85 Datei auswählen
3. Optional: Ausgabedatei anpassen (wird automatisch vorgeschlagen)
4. "Verarbeiten" klicken
5. Warten bis "Verarbeitung abgeschlossen" angezeigt wird
6. Bereinigte Datei im ausgewählten Ausgabepfad finden

## Technische Details

- **Programmiersprache**: Java
- **GUI Framework**: Swing
- **XML Verarbeitung**: DOM (javax.xml)
- **Unterstützte Formate**: GAEB DA85 (*.xml, *.x85)
- **Verarbeitete Elemente**: `<DetailTxt>`
- **Entfernte Tags**: `<span>` und `</span>` (mit allen Attributen)

## Beispiel

**Vorher:**
```xml
<DetailTxt>
  <![CDATA[
    Dies ist ein <span style="color:red">wichtiger</span> Text mit 
    <span class="highlight"><span>verschachtelten</span> Tags</span>.
  ]]>
</DetailTxt>
```

**Nachher:**
```xml
<DetailTxt>
  <![CDATA[
    Dies ist ein wichtiger Text mit 
    verschachtelten Tags.
  ]]>
</DetailTxt>
```

## Integration in gaebviewer

Das Programm kann später als Utility-Funktion in den gaebviewer integriert werden:

```java
import com.example.gaebviewer.util.GaebSpanRemover;

// Als eigenständiges Programm starten
GaebSpanRemover.main(new String[]{});
```

## Systemanforderungen

- Java 11 oder höher
- Windows 11 (oder andere Betriebssysteme mit Java-Unterstützung)
- Keine zusätzlichen Abhängigkeiten erforderlich (verwendet nur Java Standard-Bibliotheken)

## Autor

Erstellt für die Verarbeitung von GAEB DA85 Dateien im gaeb4linux Projekt.
