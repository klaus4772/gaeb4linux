#!/usr/bin/env bash
set -euo pipefail

APP_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
APP_JAR="$APP_DIR/gaebviewer.jar"
APP_PORT="${APP_PORT:-8080}"
APP_URL="http://localhost:${APP_PORT}"

if [[ ! -f "$APP_JAR" ]]; then
  echo "[ERROR] Datei nicht gefunden: $APP_JAR"
  echo "Bitte pruefen, ob dieses Skript im entpackten gaebviewer-Ordner liegt."
  exit 1
fi

if ! command -v java >/dev/null 2>&1; then
  echo "[ERROR] Java wurde nicht gefunden."
  echo "Bitte Java 21 oder hoeher installieren und erneut starten."
  exit 1
fi

echo "Starte GAEB Viewer auf Port ${APP_PORT}..."
nohup java ${JAVA_OPTS:-} -Xms256m -Xmx1024m -jar "$APP_JAR" --server.port="$APP_PORT" >/tmp/gaebviewer.log 2>&1 &
APP_PID=$!

echo "Warte auf Server-Start und oeffne Browser..."
for _ in {1..60}; do
  if command -v curl >/dev/null 2>&1 && curl -fsS "$APP_URL" >/dev/null 2>&1; then
    break
  fi
  sleep 1
done

if command -v xdg-open >/dev/null 2>&1; then
  xdg-open "$APP_URL" >/dev/null 2>&1 || true
elif command -v open >/dev/null 2>&1; then
  open "$APP_URL" >/dev/null 2>&1 || true
fi

echo "Anwendung gestartet: $APP_URL (PID $APP_PID)"
echo "Logs: /tmp/gaebviewer.log"
