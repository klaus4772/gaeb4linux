#!/bin/bash
#
# GAEB Viewer Application Startup Script
#
# Starts the GAEB Viewer Spring Boot application with Maven.
# Usage: ./run.sh [options]
#
# Options:
#   --port <port>        Set custom HTTP port (default: 8080)
#   --profile <name>     Set Spring profile (e.g., prod)
#   --jar                Build JAR and run it instead of using Maven
#   --help               Show this help message
#

set -e

# Farben für Output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Standard-Werte
PORT=8080
PROFILE=""
USE_JAR=false
PROJECT_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)"

# Parse Argumente
while [[ $# -gt 0 ]]; do
  case $1 in
    --port)
      PORT="$2"
      shift 2
      ;;
    --profile)
      PROFILE="$2"
      shift 2
      ;;
    --jar)
      USE_JAR=true
      shift
      ;;
    --help)
      sed -n '/^#!/,/^$/p' "$0" | tail -n +2
      exit 0
      ;;
    *)
      echo -e "${RED}Unbekannte Option: $1${NC}"
      exit 1
      ;;
  esac
done

echo -e "${GREEN}=== GAEB Viewer Application ===${NC}"
echo "Port: $PORT"
[ -n "$PROFILE" ] && echo "Spring Profile: $PROFILE"
echo ""

cd "$PROJECT_ROOT"

if [ "$USE_JAR" = true ]; then
  # Build JAR and run
  echo -e "${YELLOW}Baue JAR-Paket...${NC}"
  mvn -pl gaebviewer/gaeb-viewer-app -am -DskipTests clean package > /dev/null 2>&1

  JAR_FILE=$(find gaebviewer/gaeb-viewer-app/target -name "*.jar" -type f | head -1)
  if [ -z "$JAR_FILE" ]; then
    echo -e "${RED}JAR nicht gefunden!${NC}"
    exit 1
  fi

  echo -e "${GREEN}Starte Anwendung aus JAR: $JAR_FILE${NC}"
  echo ""

  JVM_ARGS="-Dserver.port=$PORT"
  [ -n "$PROFILE" ] && JVM_ARGS="$JVM_ARGS -Dspring.profiles.active=$PROFILE"

  java $JVM_ARGS -jar "$JAR_FILE"
else
  # Run mit Maven
  echo -e "${GREEN}Starte Anwendung mit Maven...${NC}"
  echo ""

  JVM_ARGS="-Dserver.port=$PORT"
  [ -n "$PROFILE" ] && JVM_ARGS="$JVM_ARGS -Dspring.profiles.active=$PROFILE"

  mvn -pl gaebviewer/gaeb-viewer-app -am spring-boot:run \
    -Dspring-boot.run.jvmArguments="$JVM_ARGS"
fi

