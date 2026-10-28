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

## 🗄️ Datenbank

Der GAEB-Editor speichert importierte Dateien und Änderungen standardmäßig dauerhaft in einer
lokalen SQLite-Datenbank. Eine separate Datenbankinstallation ist dafür nicht erforderlich.

### Lokaler Betrieb mit SQLite (Standard)

Die Konfiguration liegt in `gaebviewer/gaeb-viewer-app/src/main/resources/application-sqlite.properties`.
Die persistente Datenbankdatei `gaebviewer.db` wird im aktuellen Arbeitsverzeichnis angelegt.
Der Speicherort kann über `GAEB_SQLITE_URL` gesetzt werden:

```bash
mvn -pl gaebviewer/gaeb-viewer-app -am package -DskipTests
java -jar gaebviewer/gaeb-viewer-app/target/gaebviewer.jar
```

Beispiel für einen absoluten Pfad:

```bash
GAEB_SQLITE_URL=jdbc:sqlite:/var/lib/gaebviewer/gaebviewer.db java -jar gaebviewer.jar
```

Das Zielverzeichnis muss bereits existieren und für den Prozess beschreibbar sein.

### Externes PostgreSQL

Für den Betrieb mit einer separat verwalteten PostgreSQL-Datenbank das Profil `external-db`
aktivieren. Profil- und Verbindungsparameter liegen in
`gaebviewer/gaeb-viewer-app/src/main/resources/application-external-db.properties`;
Verbindungswerte sollten über `SPRING_DATASOURCE_URL`, `SPRING_DATASOURCE_USERNAME` und
`SPRING_DATASOURCE_PASSWORD` bereitgestellt werden:

```bash
SPRING_PROFILES_ACTIVE=external-db \
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/gaebeditor \
SPRING_DATASOURCE_USERNAME=gaebeditor \
SPRING_DATASOURCE_PASSWORD=... \
java -jar gaebviewer.jar
```

## 📋 Verfügbare Funktionen

| Funktion | URL |
|----------|-----|
| **Startseite** | http://localhost:8080 |
| **GAEB Viewer** | http://localhost:8080/gaeb |

### GAEB Viewer
- Upload von GAEB-Dateien (DA80, DA81, DA82, DA83, DA84, DA85, DA86, DA87)
- Anzeige von Positionen und Texten
- Export zu Excel (VOBB)
- CSV-Import für Kostengruppen

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
