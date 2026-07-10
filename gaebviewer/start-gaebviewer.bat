@echo off
REM GAEB Viewer - Windows Start Script
REM Startet die GAEB Viewer Spring Boot Anwendung

setlocal enabledelayedexpansion

REM Konfiguration
set APP_NAME=gaebviewer
set JAR_FILE=gaebviewer.jar
set SERVER_PORT=8080
set JAVA_OPTS=-Xmx512m -Xms256m

echo.
echo ==========================================
echo   GAEB Viewer - Windows
echo ==========================================
echo.

REM Prüfe ob Java installiert ist
java -version >nul 2>&1
if errorlevel 1 (
    echo FEHLER: Java ist nicht installiert.
    echo.
    echo Bitte installieren Sie Java 21 oder höher:
    echo   https://adoptium.net/temurin/releases/
    echo   oder: winget install OpenJDK.JDK.21
    echo.
    pause
    exit /b 1
)

REM Zeige Java-Version
for /f "tokens=*" %%i in ('java -version 2^>^&1') do (
    set JAVA_VERSION=%%i
    goto :java_found
)
:java_found
echo Java gefunden: %JAVA_VERSION%
echo.

REM Prüfe ob JAR-Datei existiert
if not exist "%JAR_FILE%" (
    echo FEHLER: JAR-Datei nicht gefunden: %JAR_FILE%
    echo.
    echo Bitte stellen Sie sicher, dass die JAR-Datei im gleichen Verzeichnis liegt.
    echo.
    pause
    exit /b 1
)

echo JAR-Datei gefunden: %JAR_FILE%
echo.

REM Starte Anwendung
echo Starte %APP_NAME% auf Port %SERVER_PORT%...
echo.
echo Die Anwendung ist erreichbar unter:
echo   http://localhost:%SERVER_PORT%
echo.
echo Verfügbare Seiten:
echo   - Startseite:    http://localhost:%SERVER_PORT%
echo   - GAEB Viewer:   http://localhost:%SERVER_PORT%/gaeb
echo   - Span Remover:  http://localhost:%SERVER_PORT%/span-remover
echo.
echo Drücken Sie STRG+C zum Beenden
echo ==========================================
echo.

REM Starte Spring Boot Anwendung
java %JAVA_OPTS% -jar "%JAR_FILE%" --server.port=%SERVER_PORT%

if errorlevel 1 (
    echo.
    echo FEHLER: Die Anwendung ist mit einem Fehler beendet worden.
    echo.
    pause
    exit /b 1
)

pause

