#!/bin/bash
# GAEB Viewer - Linux Start Script
# Startet die GAEB Viewer Spring Boot Anwendung

set -e

# Konfiguration
APP_NAME="gaebviewer"
JAR_FILE="gaebviewer.jar"
SERVER_PORT=8080
JAVA_OPTS="-Xmx512m -Xms256m"

# Farben für Ausgabe
GREEN='\033[0;32m'
RED='\033[0;31m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

echo ""
echo "=========================================="
echo "  GAEB Viewer - Linux Server"
echo "=========================================="
echo ""

# Prüfe ob Java installiert ist
if ! command -v java &> /dev/null; then
    echo -e "${RED}✗ FEHLER: Java ist nicht installiert.${NC}"
    echo ""
    echo "Bitte installieren Sie Java 21 oder höher:"
    echo ""
    echo -e "${BLUE}Ubuntu/Debian:${NC}"
    echo "  sudo apt update"
    echo "  sudo apt install openjdk-21-jre"
    echo ""
    echo -e "${BLUE}RHEL/CentOS/Fedora:${NC}"
    echo "  sudo dnf install java-21-openjdk"
    echo ""
    echo -e "${BLUE}Alpine:${NC}"
    echo "  apk add openjdk21-jre"
    echo ""
    exit 1
fi

# Zeige Java-Version
JAVA_VERSION=$(java -version 2>&1 | head -n 1)
echo -e "${GREEN}✓ Java gefunden:${NC} $JAVA_VERSION"
echo ""

# Prüfe ob JAR-Datei existiert
if [ ! -f "$JAR_FILE" ]; then
    echo -e "${RED}✗ FEHLER: JAR-Datei nicht gefunden: $JAR_FILE${NC}"
    echo ""
    echo "Bitte stellen Sie sicher, dass die JAR-Datei im gleichen Verzeichnis liegt:"
    echo "  $(pwd)/$JAR_FILE"
    echo ""
    exit 1
fi

echo -e "${GREEN}✓ JAR-Datei gefunden:${NC} $JAR_FILE"
echo ""

# Starte Anwendung
echo "Starte $APP_NAME auf Port $SERVER_PORT..."
echo ""
echo -e "${YELLOW}Die Anwendung ist erreichbar unter:${NC}"
echo "  http://localhost:$SERVER_PORT"
echo "  http://$(hostname -I | awk '{print $1}'):$SERVER_PORT (von außen)"
echo ""
echo -e "${YELLOW}Verfügbare Seiten:${NC}"
echo "  - Startseite:    http://localhost:$SERVER_PORT/"
echo "  - GAEB Viewer:   http://localhost:$SERVER_PORT/gaeb"
echo "  - Span Remover:  http://localhost:$SERVER_PORT/span-remover"
echo ""
echo -e "${YELLOW}Eingaben:${NC}"
echo "  STRG+C  = Anwendung beenden"
echo "=========================================="
echo ""

# Starte Spring Boot Anwendung
java $JAVA_OPTS -jar "$JAR_FILE" --server.port=$SERVER_PORT

echo ""
echo "Anwendung beendet."


