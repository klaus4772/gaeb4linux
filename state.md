Projektstatus

Projektname (Root/Aggregator): gaeb4linux
Module (IntelliJ zeigt genau 4, alles läuft):

gaeb4linux (Root, packaging=pom)

gaebviewer (App, Spring Boot + Vaadin, packaging=jar, Parent = spring-boot-starter-parent 3.2.5)

gaeb-schema-da80 (JAXB-Generierung, packaging=jar)

gaeb-schema-da81 (JAXB-Generierung, packaging=jar)

Build läuft wieder (Maven + IntelliJ).

JAXB/GAEB: Was vorher das Kernproblem war

GAEB-LIB hat Namenskollisionen in redefine-Kontext:

Beispiel (LIB):

<xs:complexType name="tgOutlTxt">
<xs:sequence>
<xs:element name="Style" type="tgStyle"/>
</xs:sequence>
<xs:attribute name="style" type="tgAttStyle"/>
</xs:complexType>

JAXB mappt beides zu einer Property → Property-Kollision.

Funktionierendes Binding (Property-Kollision gelöst)

bindings.xjb (liegt in jedem Schema-Modul unter src/main/resources/xsd und referenziert die LIB als schemaLocation):

Für tgOutlTxt/@style → styleAttr

Für tgBoQText/@style → styleAttr

Wichtig:

schemaLocation MUSS auf die LIB-XSD zeigen

LIB muss in schemaIncludes enthalten sein

propertyTransformation wird von JAXB 4.x nicht unterstützt → nicht verwenden

JAXB-Generierung: Wichtige Regeln & Setup

Niemals mehrere X.. (DA80/DA81/DA83…) in einer execution mischen (früher in Single-POM wichtig).

In der neuen Multi-Modul-Struktur hat jedes DAxx sein eigenes Modul, damit ist es automatisch getrennt.

Plugin im Schema-Modul (gaeb-schema-da80 / da81):

org.jvnet.jaxb:jaxb-maven-plugin:4.0.8

phase=generate-sources

-extension und -XautoNameResolution

schemaIncludes: LIB + die jeweilige DAxx-XSD

generatePackage wird verwendet:

com.example.gaebviewer.schema.da80

com.example.gaebviewer.schema.da81

Wichtiger Fix: generateDirectory statt forceRegenerate (deprecated).
Damit gab’s keine “up-to-date skip”-Probleme mehr.

Abhängigkeiten (wichtig für jakarta.xml.bind Fehler)

Warum der Fehler „Package jakarta.xml.bind ist nicht vorhanden“ auftrat:

Die generierten Klassen in gaeb-schema-da80/da81 importieren jakarta.xml.bind.*

Deshalb brauchen die Schema-Module Compile-Dependency auf JAXB API.

In gaeb-schema-da80 und gaeb-schema-da81:

jakarta.xml.bind:jakarta.xml.bind-api:4.0.2 als Dependency (explizite Version, weil kein Spring Boot Parent).

In gaebviewer (App):

JAXB Runtime vorhanden:

jakarta.xml.bind-api

org.glassfish.jaxb:jaxb-runtime
(im Spring Boot Parent idealerweise ohne Version oder konsistent gehalten)

Wichtiger App-Fix:

gaebviewer muss packaging=jar sein (nicht pom), sonst fehlen Compile-Classpath/Dependencies.

Repo/IDE Zustand

Git komplett neu initialisiert, neues GitHub-Repo angelegt.

Projekt umbenannt:

Root: gaeb4linux

App-Modul: gaebviewer

IntelliJ Modules sind sauber: gaeb4linux, gaebviewer, gaeb-schema-da80, gaeb-schema-da81.

Alles baut und läuft.

Nächster Schritt im neuen Chat

Ziel: bestehenden Code in gaebviewer (und ggf. parser/service) so umbauen, dass konsequent Jakarta JAXB (jakarta.xml.bind) genutzt wird:

Imports auf jakarta.xml.bind.* umstellen (weg von javax.xml.bind.* falls irgendwo noch vorhanden)

JAXBContext/Unmarshaller sauber bauen (pro DAxx)

Langfristige Architekturidee bleibt:

Namespace erkennen → passendes JAXBContext:

JAXBContext.newInstance("com.example.gaebviewer.schema.da80")

JAXBContext.newInstance("com.example.gaebviewer.schema.da81")

Danach: Parser/Service-Code refactoren, sodass Import generisch wird.

25.2.2026:
1) ui.gaeb.GaebView

Was ist das?
Deine Vaadin-View (UI-Schicht) unter der Route /gaeb.

Was macht sie konkret?

Baut die Oberfläche: Überschrift, Upload-Komponente, Grid.

Nimmt eine Datei über Upload + MemoryBuffer entgegen.

Ruft beim erfolgreichen Upload nur einen Use Case auf:

gaebImportService.importGaeb(inputStream)

Nimmt das Ergebnis (GaebProject) und zeigt daraus die Positionen im Grid an.

Wichtiges Architekturprinzip hier:

UI macht keine XML-/GAEB-Logik.

UI kennt keine JAXB/DOM-Details.

UI zeigt nur Domain-Daten an.

2) application.gaeb.GaebImportService

Was ist das?
Ein Application-Service (Use-Case-Schicht).

Was macht er konkret?

Er repräsentiert den Anwendungsfall: „GAEB-Datei importieren“.

Er ist die “Fassade” für die UI: Die UI muss nur diesen Service kennen.

Er delegiert die technische Arbeit an einen Importer (ideal: ein Interface/Port wie GaebImporter).

Warum ist das wichtig?

Wenn du später umstellst von DOM → JAXB, ändert sich nicht die UI.

Wenn du später Projektverwaltung/DB einbaust, kommt Logik hier rein wie:

„nach Import als Projekt speichern“

„letzte Projekte laden“

„Versionierung“

3) infrastructure.gaeb.GaebXmlParser

Was ist das?
Ein technischer Importer (Infrastruktur-Schicht). Im Moment ist es ein DOM-basierter Import.

Was macht er konkret?

Liest das XML mit DocumentBuilderFactory (namespace-aware).

Holt den Root-Namespace (damit erkennst du grundsätzlich schon DA80/DA81-artige Welten).

Sucht nach Item-Elementen und liest daraus:

OZ (RNoPart)

Kurztext (OutlineText)

Menge (Qty)

Einheit (QU)

Einheitspreis (UP)

Baut daraus Domain-Objekte:

GaebProject (ein Projekt)

GaebBoQ (ein LV, derzeit nur eins)

GaebPosition (Positionen)

Warum gehört das in infrastructure?

Weil DOM/XML parsing Technik ist.

Später ersetzt du diese Klasse durch:

Da80JaxbImporter

Da81JaxbImporter
…ohne die Domain oder UI anfassen zu müssen.

Zusammenspiel als Ablauf

User lädt Datei hoch (UI)

GaebView ruft GaebImportService.importGaeb(InputStream) auf (Application)

GaebImportService ruft den technischen Importer/Parser auf (Infrastructure)

Infrastructure baut ein GaebProject (Domain)

UI zeigt GaebPosition-Daten an

Kurz:

UI → Application → Infrastructure → Domain (Objekte zurück) → UI
