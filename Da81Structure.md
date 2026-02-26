DA81Structure.md
GAEB DA81 – JAXB-Struktur und Importpfad

Dieses Dokument beschreibt die aus den generierten JAXB-Klassen rekonstruierte Struktur einer GAEB DA81 Datei und den exakten Pfad zu den Leistungsverzeichnis-Positionen.

Die Struktur basiert ausschließlich auf den generierten Klassen aus dem Package:

com.example.gaebviewer.schema.da81
1. Root-Struktur
   1.1 TgGAEB2 (Root-Element)
   TgGAEB2 extends OriginalTgGAEB

Die tatsächlichen Felder befinden sich in OriginalTgGAEB.

OriginalTgGAEB enthält:
Element	Typ	Pflicht
GAEBInfo	TgGAEBInfo2	ja
PrjInfo	TgPrjInfo2	nein
Award	TgAward2	nein
Invoice	TgInvoice2	nein
Order	List<TgOrder2>	nein
AddText	List<TgAddText2>	nein
Für DA81-Import relevant:
getAward()
2. Vergabe-Ebene
   2.1 TgAward2

Relevante Struktur:

Element	Typ
DP	String
AwardInfo	TgAwardInfo2
BoQ	TgBoQ2
Für Positionen relevant:
getBoQ()
3. Leistungsverzeichnis
   3.1 TgBoQ2

Struktur:

Element	Typ
BoQInfo	TgBoQInfo2
BoQBody	TgBoQBody2
LotGrp	List<TgLotGrp2>
ID	String (Attribut)
Für Positionen relevant:
getBoQBody()
4. LV-Hauptteil
   4.1 TgBoQBody2

Struktur:

Element	Typ
remarkOrPerfDescrOrBoQCtgy	List<Object>
itemlist	TgItemlist2
Für Positionen relevant:
getItemlist()
5. Positionsliste
   5.1 TgItemlist2
   TgItemlist2 extends OriginalTgItemlist

Die eigentliche Struktur liegt in OriginalTgItemlist.

5.2 OriginalTgItemlist
@XmlElements({
Remark
PerfDescr
Item (TgItem2)
MarkupItem (TgMarkupItem2)
MastAgrItems
})
List<Object> remarkOrPerfDescrOrItem;

Diese Liste enthält gemischte Typen.

Relevante Typen für Positionen:

TgItem2 → echte LV-Position

optional: TgMarkupItem2

6. Finaler Pfad zu einer Position

Der exakte, schema-konforme Pfad lautet:

gaeb.getAward()
.getBoQ()
.getBoQBody()
.getItemlist()
.getRemarkOrPerfDescrOrItem()

Dann:

if (entry instanceof TgItem2 item)
7. Strukturdiagramm (vereinfacht)
   GAEB
   └── Award
   └── BoQ
   └── BoQBody
   └── Itemlist
   ├── Remark
   ├── PerfDescr
   ├── Item        ← Position
   ├── MarkupItem
   └── MastAgrItems
8. Importstrategie (ohne Reflection)
   8.1 Traversierung

Nur explizite Schema-Navigation:

TgAward2 award = gaeb.getAward();
TgBoQ2 boq = award.getBoQ();
TgBoQBody2 body = boq.getBoQBody();
TgItemlist2 itemlist = body.getItemlist();

for (Object entry : itemlist.getRemarkOrPerfDescrOrItem()) {
if (entry instanceof TgItem2 item) {
mapItem(item);
}
}
8.2 Kein Graph-Scan

Es wird kein Reflection-Scan des gesamten Objektgraphen durchgeführt.

Vorteile:

Keine Duplikate

Keine Heuristik

Compile-time Safety

Schema-konform

Bessere Performance

Wartbarer Code

9. Mapping-Zielstruktur

TgItem2 wird gemappt auf:

GaebPosition

Relevante Felder:

GAEB Feld	Ziel
RNoPart	number
OutlineText	shortText
Qty	quantity
QU	unit
UP	unitPrice
10. Architektur-Hinweis

Der DA81-Importer:

navigiert ausschließlich über JAXB-Getter

enthält keine Reflection

folgt exakt der GAEB-Schema-Hierarchie

ist erweiterbar für:

rekursive Positionsstrukturen

weitere DA-Phasen

alternative Mapping-Strategien

11. Erweiterungspotential

Mögliche nächste Schritte:

Rekursive Item-Hierarchie unterstützen

OutlineText typisiert flatten

Wrapper-Typen für Qty/UP vollständig ohne Reflection behandeln

Gemeinsame Strukturabstraktion für DA80/DA81

Stand: Erarbeitet aus generierten JAXB-Klassen
Projekt: GAEB4Linux
Schema: GAEB DA XML 3.3 – Phase DA81