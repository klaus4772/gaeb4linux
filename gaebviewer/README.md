# 📦 GAEB4Linux - Gaebviewer

Eine benutzerfreundliche Web-Anwendung zur Anzeige und Verarbeitung von GAEB-Dateien (Gemeinsamer Ausschreibungstext Elektrotechnik und Bau).

## 🚀 Installation & Start (ohne Java-Installation)

### Windows

1. **Download:**
   - Lade die neueste Version von [GitHub Releases](https://github.com/klaus4772/gaeb4linux/releases) herunter
   - Datei: `gaebviewer-*.zip`

2. **Entpacken:**
   - Entpacke die ZIP-Datei in einen beliebigen Ordner
   - z.B. `C:\Programme\gaebviewer`

3. **Starten:**
   - Doppelklick auf `start-gaebviewer.bat`
   - Falls Java nicht installiert ist: Befolge die Anweisungen im Fenster
   - Die Anwendung öffnet sich automatisch unter http://localhost:8080

### Linux / Mac

1. **Download:**
   - Lade die neueste Version von [GitHub Releases](https://github.com/klaus4772/gaeb4linux/releases) herunter
   - Datei: `gaebviewer-*.zip`

2. **Entpacken:**
   ```bash
   unzip gaebviewer-*.zip
   cd gaebviewer
   ```

3. **Starten:**
   ```bash
   chmod +x start-gaebviewer.sh
   ./start-gaebviewer.sh
   ```
   - Öffne deinen Browser und gehe zu http://localhost:8080

## 📋 Verfügbare Funktionen

| Funktion | URL |
|----------|-----|
| **Startseite** | http://localhost:8080 |
| **GAEB Viewer** | http://localhost:8080/gaeb |
| **Span Remover** | http://localhost:8080/span-remover |

### GAEB Viewer
- Upload von GAEB-Dateien (DA80, DA81, DA82, DA83, DA84, DA85, DA86, DA87)
- Anzeige von Positionen und Texten
- Export zu Excel (VOBB)
- CSV-Import für Kostengruppen

### Span Remover
- Entfernt `<span>` Tags aus GAEB XML-Dateien
- Behält den Textinhalt
- Download der bereinigte Datei

## 🔧 Java-Installation (falls nötig)

Falls die Anwendung nicht startet, installiere Java 21:

### Windows
```powershell
winget install OpenJDK.JDK.21
```

Oder lade von hier herunter: https://adoptium.net/temurin/releases/

### Ubuntu/Debian
```bash
sudo apt update
sudo apt install openjdk-21-jre
```

### RHEL/CentOS/Fedora
```bash
sudo dnf install java-21-openjdk
```

### macOS
```bash
brew install openjdk@21
```

## 🐳 Docker (Alternative)

Falls du Docker installiert hast, kannst du die Anwendung auch im Container starten:

```bash
docker run -p 8080:8080 gaebviewer:latest
```

## 🛠️ Konfiguration

Die Anwendung kann durch die Umgebungsvariable `JAVA_OPTS` konfiguriert werden:

```bash
# Linux/Mac
export JAVA_OPTS="-Xmx1g -Xms512m"
./start-gaebviewer.sh

# Windows (PowerShell)
$env:JAVA_OPTS="-Xmx1g -Xms512m"
.\start-gaebviewer.bat
```

### Speicher-Optionen
- `-Xms512m`: Minimum Heap Size
- `-Xmx1g`: Maximum Heap Size
- Standard: 256MB - 512MB

## 📊 Systemanforderungen

| Komponente | Anforderung |
|-----------|------------|
| **Java** | Java 21 oder höher |
| **Speicher** | Minimum 512 MB RAM |
| **Disk** | ~200 MB Speicherplatz |
| **Browser** | Moderner Browser (Chrome, Firefox, Safari, Edge) |
| **Netzwerk** | Lokal (localhost) oder Netzwerk |

## 🔍 Troubleshooting

### Problem: "Java nicht installiert"
**Lösung:** Installiere Java 21 gemäß der Anleitung oben

### Problem: "Port 8080 bereits in Verwendung"
**Lösung:** Beende die andere Anwendung oder ändere den Port:

```bash
# Linux/Mac
java -Xmx512m -Xms256m -jar gaebviewer.jar --server.port=8081

# Windows
java -Xmx512m -Xms256m -jar gaebviewer.jar --server.port=8081
```

Dann öffne: http://localhost:8081

### Problem: "Keine Verbindung zu localhost:8080"
- Warte 10-15 Sekunden nach dem Start
- Prüfe die Konsole auf Fehlermeldungen
- Versuche im Browser zu refreshen (F5)
- Prüfe die Firewall-Einstellungen

## 📝 Linux Systemd Service (Optional)

Für den Betrieb auf einem Linux-Server:

1. Kopiere die JAR-Datei nach `/opt/gaebviewer/`
2. Kopiere die Systemd Service-Datei:
   ```bash
   sudo cp gaebviewer.service /etc/systemd/system/
   ```
3. Aktiviere und starte den Service:
   ```bash
   sudo systemctl enable gaebviewer
   sudo systemctl start gaebviewer
   ```
4. Prüfe den Status:
   ```bash
   sudo systemctl status gaebviewer
   ```

Weitere Infos: Siehe `INSTALL_LINUX.md`

## 📚 Dokumentation

- [Build-Anleitung](BUILD_INSTRUCTIONS.md) - Für Entwickler
- [Linux-Installation](INSTALL_LINUX.md) - Für Server-Deployment
- [GAEB Span Remover](GAEB_SPAN_REMOVER_README.md) - Tool-spezifische Infos

## 🐛 Bug-Reports & Feature Requests

Erstelle ein Issue auf GitHub:
- https://github.com/klaus4772/gaeb4linux/issues

## 📄 Lizenz

Siehe LICENSE-Datei im Projekt-Root

## 👥 Beiträge

Contributions sind willkommen! Bitte erstelle einen Pull Request.

---

**Versionsinfo:**
- Version: 0.1.0-SNAPSHOT
- Java: 21+
- Spring Boot: 3.2.5
- Vaadin: 24.1.3

**Zuletzt aktualisiert:** 2026-07-10

