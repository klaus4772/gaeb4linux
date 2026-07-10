@echo off
REM GAEB Span Tag Remover - Portable Version
REM Dieses Skript kompiliert und startet das GAEB Span Tag Remover Programm

echo ========================================
echo GAEB Span Tag Remover
echo ========================================
echo.

REM Prüfe ob Java installiert ist
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo FEHLER: Java ist nicht installiert oder nicht im PATH.
    echo Bitte installieren Sie Java 8 oder hoeher.
    echo.
    pause
    exit /b 1
)

echo Java gefunden. Kompiliere Programm...
echo.

REM Erstelle classes Verzeichnis falls nicht vorhanden
if not exist "classes" mkdir "classes"

REM Kompiliere das Programm (Java 8 kompatibel)
javac -source 8 -target 8 -d classes src\com\example\gaebviewer\util\GaebSpanRemover.java

if %errorlevel% neq 0 (
    echo.
    echo FEHLER: Kompilierung fehlgeschlagen.
    echo.
    pause
    exit /b 1
)

echo Kompilierung erfolgreich.
echo Starte Programm...
echo.

REM Starte das Programm
java -cp classes com.example.gaebviewer.util.GaebSpanRemover

echo.
echo Programm beendet.
pause
