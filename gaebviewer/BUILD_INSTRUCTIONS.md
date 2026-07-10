# Build-Anleitung für Linux-Deployment

## JAR-Datei mit IntelliJ IDEA erstellen

### Schritt 1: Maven Build ausführen

1. Öffnen Sie das Projekt in IntelliJ IDEA
2. Öffnen Sie das Maven-Tool-Fenster (View → Tool Windows → Maven)
3. Navigieren Sie zu: `gaeb4linux → gaebviewer → Lifecycle`
4. Führen Sie folgende Befehle in dieser Reihenfolge aus:
   - `clean` (Doppelklick)
   - `package` (Doppelklick)

**ODER** verwenden Sie das Terminal in IntelliJ:

```bash
cd gaebviewer
mvn clean package -DskipTests
```

### Schritt 2: JAR-Datei finden

Nach erfolgreichem Build finden Sie die JAR-Datei hier:

```
gaebviewer/target/gaebviewer-0.1.0-SNAPSHOT.jar
```

Diese Datei enthält alle Abhängigkeiten und ist bereit für das Deployment auf dem Linux-Server.

### Schritt 3: Deployment-Paket erstellen

Kopieren Sie folgende Dateien in einen neuen Ordner `gaebviewer-linux-deployment`:

1. `gaebviewer-0.1.0-SNAPSHOT.jar` (aus target/)
2. `start-gaebviewer.sh` (Start-Skript für Linux)
3. `gaebviewer.service` (Systemd Service-Datei)
4. `INSTALL.md` (Installationsanleitung für Linux)

---

## Alternative: Build auf dem Linux-Server

Falls Sie Maven auf dem Linux-Server installieren möchten:

```bash
# Projekt auf Server kopieren
scp -r gaeb4linux user@server:/opt/

# Auf dem Server
cd /opt/gaeb4linux/gaebviewer
mvn clean package -DskipTests
```

---

## Benötigte Software auf dem Linux-Server

- **Java Runtime Environment (JRE) 21** oder höher
- Optional: systemd (für automatischen Start als Service)

Installation auf Ubuntu/Debian:
```bash
sudo apt update
sudo apt install openjdk-21-jre
```

Installation auf RHEL/CentOS/Fedora:
```bash
sudo dnf install java-21-openjdk
```
