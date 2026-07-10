# GAEB Viewer - Installationsanleitung für Linux-Server

## Übersicht

Diese Anleitung beschreibt die Installation und Konfiguration des GAEB Viewers auf einem Linux-Server.

## Voraussetzungen

### Benötigte Software

- **Java Runtime Environment (JRE) 21** oder höher
- **Linux-Distribution**: Ubuntu 20.04+, Debian 11+, RHEL 8+, CentOS 8+, Fedora 35+
- Optional: systemd (für automatischen Start als Service)

### Java installieren

#### Ubuntu/Debian:
```bash
sudo apt update
sudo apt install openjdk-21-jre
```

#### RHEL/CentOS/Fedora:
```bash
sudo dnf install java-21-openjdk
```

#### Java-Version prüfen:
```bash
java -version
```

Erwartete Ausgabe: `openjdk version "21.x.x"` oder höher

---

## Installation

### Variante 1: Manuelle Installation (empfohlen für Tests)

#### Schritt 1: Deployment-Verzeichnis erstellen

```bash
sudo mkdir -p /opt/gaebviewer
sudo chown $USER:$USER /opt/gaebviewer
cd /opt/gaebviewer
```

#### Schritt 2: Dateien kopieren

Kopieren Sie folgende Dateien in das Verzeichnis `/opt/gaebviewer`:

- `gaebviewer-0.1.0-SNAPSHOT.jar`
- `start-gaebviewer.sh`

```bash
# Beispiel: Von lokalem PC auf Server kopieren
scp gaebviewer-0.1.0-SNAPSHOT.jar user@server:/opt/gaebviewer/
scp start-gaebviewer.sh user@server:/opt/gaebviewer/
```

#### Schritt 3: Start-Skript ausführbar machen

```bash
cd /opt/gaebviewer
chmod +x start-gaebviewer.sh
```

#### Schritt 4: Anwendung starten

```bash
./start-gaebviewer.sh
```

Die Anwendung ist nun erreichbar unter:
- **GAEB Viewer**: http://SERVER-IP:8080/gaeb
- **Span Remover**: http://SERVER-IP:8080/span-remover

Zum Beenden: `STRG+C` drücken

---

### Variante 2: Installation als systemd Service (empfohlen für Produktion)

#### Schritt 1: Benutzer erstellen

```bash
sudo useradd -r -s /bin/false gaebviewer
```

#### Schritt 2: Deployment-Verzeichnis erstellen

```bash
sudo mkdir -p /opt/gaebviewer/logs
sudo chown -R gaebviewer:gaebviewer /opt/gaebviewer
```

#### Schritt 3: Dateien kopieren

```bash
# JAR-Datei kopieren
sudo cp gaebviewer-0.1.0-SNAPSHOT.jar /opt/gaebviewer/
sudo chown gaebviewer:gaebviewer /opt/gaebviewer/gaebviewer-0.1.0-SNAPSHOT.jar
```

#### Schritt 4: systemd Service installieren

```bash
# Service-Datei kopieren
sudo cp gaebviewer.service /etc/systemd/system/

# systemd neu laden
sudo systemctl daemon-reload

# Service aktivieren (automatischer Start beim Booten)
sudo systemctl enable gaebviewer

# Service starten
sudo systemctl start gaebviewer
```

#### Schritt 5: Status prüfen

```bash
# Service-Status anzeigen
sudo systemctl status gaebviewer

# Logs anzeigen
sudo journalctl -u gaebviewer -f
```

#### Service-Befehle

```bash
# Service starten
sudo systemctl start gaebviewer

# Service stoppen
sudo systemctl stop gaebviewer

# Service neu starten
sudo systemctl restart gaebviewer

# Service-Status anzeigen
sudo systemctl status gaebviewer

# Logs anzeigen (letzte 100 Zeilen)
sudo journalctl -u gaebviewer -n 100

# Logs live verfolgen
sudo journalctl -u gaebviewer -f
```

---

## Konfiguration

### Port ändern

#### Manuelle Installation:
Bearbeiten Sie `start-gaebviewer.sh` und ändern Sie:
```bash
SERVER_PORT=8080  # Ändern Sie auf gewünschten Port
```

#### systemd Service:
Bearbeiten Sie `/etc/systemd/system/gaebviewer.service` und ändern Sie:
```
ExecStart=/usr/bin/java -Xmx512m -Xms256m -jar /opt/gaebviewer/gaebviewer-0.1.0-SNAPSHOT.jar --server.port=NEUER_PORT
```

Dann Service neu laden:
```bash
sudo systemctl daemon-reload
sudo systemctl restart gaebviewer
```

### Speicher-Einstellungen anpassen

Standardmäßig verwendet die Anwendung:
- Minimum: 256 MB RAM (`-Xms256m`)
- Maximum: 512 MB RAM (`-Xmx512m`)

Für größere Dateien oder mehr Benutzer erhöhen Sie die Werte:
```bash
-Xmx1024m -Xms512m  # 1 GB Maximum, 512 MB Minimum
```

---

## Firewall konfigurieren

### Ubuntu/Debian (ufw):
```bash
sudo ufw allow 8080/tcp
sudo ufw reload
```

### RHEL/CentOS/Fedora (firewalld):
```bash
sudo firewall-cmd --permanent --add-port=8080/tcp
sudo firewall-cmd --reload
```

---

## Reverse Proxy (optional)

### Nginx als Reverse Proxy

#### Installation:
```bash
sudo apt install nginx  # Ubuntu/Debian
sudo dnf install nginx  # RHEL/CentOS/Fedora
```

#### Konfiguration (`/etc/nginx/sites-available/gaebviewer`):
```nginx
server {
    listen 80;
    server_name gaebviewer.example.com;

    client_max_body_size 100M;

    location / {
        proxy_pass http://localhost:8080;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
    }
}
```

#### Aktivieren:
```bash
sudo ln -s /etc/nginx/sites-available/gaebviewer /etc/nginx/sites-enabled/
sudo nginx -t
sudo systemctl restart nginx
```

---

## Troubleshooting

### Anwendung startet nicht

1. **Java-Version prüfen:**
   ```bash
   java -version
   ```
   Muss Version 21 oder höher sein.

2. **Port bereits belegt:**
   ```bash
   sudo netstat -tulpn | grep 8080
   ```
   Falls Port belegt, anderen Port verwenden.

3. **Logs prüfen:**
   ```bash
   # Bei systemd Service:
   sudo journalctl -u gaebviewer -n 100
   
   # Bei manueller Installation:
   # Logs werden in der Konsole angezeigt
   ```

### Datei-Upload funktioniert nicht

1. **Dateigrößen-Limit erhöhen:**
   
   Erstellen Sie `/opt/gaebviewer/application.properties`:
   ```properties
   spring.servlet.multipart.max-file-size=100MB
   spring.servlet.multipart.max-request-size=100MB
   ```

2. **Service neu starten:**
   ```bash
   sudo systemctl restart gaebviewer
   ```

### Anwendung ist langsam

1. **Mehr Speicher zuweisen** (siehe Konfiguration oben)
2. **Server-Ressourcen prüfen:**
   ```bash
   htop
   free -h
   df -h
   ```

---

## Deinstallation

### systemd Service:
```bash
sudo systemctl stop gaebviewer
sudo systemctl disable gaebviewer
sudo rm /etc/systemd/system/gaebviewer.service
sudo systemctl daemon-reload
sudo userdel gaebviewer
sudo rm -rf /opt/gaebviewer
```

### Manuelle Installation:
```bash
rm -rf /opt/gaebviewer
```

---

## Sicherheitshinweise

1. **Firewall aktivieren** und nur benötigte Ports öffnen
2. **Reverse Proxy verwenden** (Nginx/Apache) mit SSL/TLS
3. **Regelmäßige Updates** von Java und Betriebssystem
4. **Backup** der Anwendung und Konfiguration
5. **Monitoring** einrichten (z.B. mit Prometheus/Grafana)

---

## Support

Bei Problemen oder Fragen:
1. Logs prüfen (`journalctl -u gaebviewer`)
2. Java-Version prüfen (`java -version`)
3. Netzwerk-Konnektivität prüfen (`curl http://localhost:8080`)

---

## Zusammenfassung der benötigten Software

| Software | Version | Zweck | Erforderlich |
|----------|---------|-------|--------------|
| Java JRE | 21+ | Ausführung der Anwendung | Ja |
| systemd | - | Automatischer Start | Optional |
| Nginx/Apache | - | Reverse Proxy | Optional |
| firewalld/ufw | - | Firewall | Empfohlen |

---

**Version:** 0.1.0-SNAPSHOT  
**Letzte Aktualisierung:** 2026-07-03
