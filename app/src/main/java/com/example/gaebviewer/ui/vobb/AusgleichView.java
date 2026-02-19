package com.example.gaebviewer.ui.vobb;

import com.example.gaebviewer.core.model.Position;
import com.example.gaebviewer.core.vobb.csv.CsvImportService;
import com.example.gaebviewer.core.vobb.csv.CsvRow;
import com.example.gaebviewer.core.vobb.model.AusgleichZeile;
import com.example.gaebviewer.core.vobb.model.PositionAbrechnung;
import com.example.gaebviewer.core.vobb.model.ZuschlagsKonfiguration;
import com.example.gaebviewer.core.vobb.service.AusgleichBerechnungService;
import com.example.gaebviewer.core.vobb.service.ExcelExportService;
import com.example.gaebviewer.core.vobb.service.PositionMatchingService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

@Route("ausgleich")
public class AusgleichView extends VerticalLayout {

    private final CsvImportService csvImportService;
    private final AusgleichBerechnungService berechnungService;
    private final ExcelExportService excelExportService;
    private final PositionMatchingService matchingService;

    private final Grid<AusgleichZeile> grid = new Grid<>();
    private final Span gesamtAusgleichLabel =
            new Span("Gesamtausgleich: 0,00 €");

    private List<CsvRow> geladenePositionen;
    private List<Position> gaebPositionen = new ArrayList<>();

    public AusgleichView(CsvImportService csvImportService,
                         AusgleichBerechnungService berechnungService,
                         ExcelExportService excelExportService,
                         PositionMatchingService matchingService) {

        this.csvImportService = csvImportService;
        this.berechnungService = berechnungService;
        this.excelExportService = excelExportService;
        this.matchingService = matchingService;

        H1 title = new H1("Gerüstbau – Ausgleichsberechnung");

        /* =============================
           Zuschlagsfelder
        ============================== */

        NumberField bgkField = createPercentField("BGK %", 10.0);
        NumberField agkField = createPercentField("AGK %", 5.0);
        NumberField gField   = createPercentField("Gewinn %", 3.0);
        NumberField lwField  = createPercentField("LW %", 2.0);
        NumberField bwField  = createPercentField("BW %", 1.0);

        RadioButtonGroup<ZuschlagsKonfiguration.Variante> varianteGroup =
                new RadioButtonGroup<>();
        varianteGroup.setLabel("Berechnungsvariante");
        varianteGroup.setItems(ZuschlagsKonfiguration.Variante.A,
                ZuschlagsKonfiguration.Variante.B);
        varianteGroup.setValue(ZuschlagsKonfiguration.Variante.A);

        Button neuBerechnenButton = new Button("Neu berechnen");
        Button exportButton = new Button("Excel Export");

        exportButton.addClickListener(e -> {
            try {
                byte[] file = excelExportService.export(
                        grid.getListDataView().getItems().toList()
                );

                com.vaadin.flow.component.html.Anchor link =
                        new com.vaadin.flow.component.html.Anchor(
                                new com.vaadin.flow.server.StreamResource(
                                        "ausgleich.xlsx",
                                        () -> new java.io.ByteArrayInputStream(file)
                                ),
                                "Download starten"
                        );

                link.getElement().setAttribute("download", true);
                add(link);

            } catch (Exception ex) {
                Notification.show("Export fehlgeschlagen");
            }
        });

        HorizontalLayout zuschlagsLayout = new HorizontalLayout(
                bgkField, agkField, gField, lwField, bwField,
                varianteGroup,
                neuBerechnenButton,
                exportButton
        );

        /* =============================
           Grid konfigurieren
        ============================== */

        grid.removeAllColumns();

        grid.addColumn(AusgleichZeile::getOz).setHeader("OZ");

        grid.addColumn(z ->
                        z.getPosition() == null ? "GESAMT" : z.getKurztext())
                .setHeader("Kurztext");

        grid.addColumn(z ->
                        String.format("%,.3f %s",
                                z.getAufMenge(),
                                z.getEinheit()))
                .setHeader("Auf.Menge");

        grid.addColumn(z ->
                        String.format("%,.3f %s",
                                z.getRechMenge(),
                                z.getEinheit()))
                .setHeader("Rech.Menge");

        grid.addColumn(z ->
                        String.format("%,.2f €", z.getRechBetrag()))
                .setHeader("Rech.Betrag");

        grid.addColumn(z ->
                        String.format("%,.2f €", z.getEpEffektiv()))
                .setHeader("EP eff.");

        grid.addColumn(z ->
                        String.format("%,.2f €",
                                z.getZuschlagsAnteilJeEinheit()))
                .setHeader("Zuschlag/Einheit");

        grid.addColumn(z ->
                        String.format("%,.3f %s",
                                z.getAusgleichMenge(),
                                z.getEinheit()))
                .setHeader("Ausgleichsmenge");

        grid.setAllRowsVisible(true);

        /* =============================
           CSV Upload
        ============================== */

        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);
        upload.setAcceptedFileTypes(".csv");

        upload.addSucceededListener(event -> {
            try {
                geladenePositionen =
                        csvImportService.importCsv(buffer.getInputStream());

                berechneUndAnzeigeAktualisieren(
                        bgkField, agkField, gField, lwField, bwField, varianteGroup
                );

                Notification.show("CSV erfolgreich geladen.");

            } catch (Exception e) {
                Notification.show("Fehler: " + e.getMessage());
            }
        });

        neuBerechnenButton.addClickListener(e ->
                berechneUndAnzeigeAktualisieren(
                        bgkField, agkField, gField, lwField, bwField, varianteGroup
                )
        );

        gesamtAusgleichLabel.getStyle().set("font-size", "1.3em");
        gesamtAusgleichLabel.getStyle().set("font-weight", "600");

        add(title, zuschlagsLayout, upload, grid, gesamtAusgleichLabel);
    }

    /* ========================================================= */

    private NumberField createPercentField(String label, double defaultValue) {
        NumberField field = new NumberField(label);
        field.setValue(defaultValue);
        field.setStep(0.5);
        field.setWidth("110px");
        return field;
    }

    /* ========================================================= */

    private void berechneUndAnzeigeAktualisieren(
            NumberField bgkField,
            NumberField agkField,
            NumberField gField,
            NumberField lwField,
            NumberField bwField,
            RadioButtonGroup<ZuschlagsKonfiguration.Variante> varianteGroup
    ) {

        if (geladenePositionen == null) {
            return;
        }

        if (gaebPositionen == null || gaebPositionen.isEmpty()) {
            Notification.show("Keine GAEB-Positionen geladen – Matching nicht möglich.");
            return;
        }

        ZuschlagsKonfiguration config =
                new ZuschlagsKonfiguration(
                        bgkField.getValue(),
                        agkField.getValue(),
                        gField.getValue(),
                        lwField.getValue(),
                        bwField.getValue(),
                        varianteGroup.getValue()
                );

        List<PositionAbrechnung> abrechnungen =
                matchingService.match(gaebPositionen, geladenePositionen);

        List<AusgleichZeile> zeilen =
                berechnungService.berechneAlle(abrechnungen, config);

        double gesamt = berechnungService.berechneGesamtAusgleich(zeilen);

        AusgleichZeile summenzeile = new AusgleichZeile(null);
        summenzeile.setAusgleichBetrag(gesamt);

        List<AusgleichZeile> mitSumme = new ArrayList<>(zeilen);
        mitSumme.add(summenzeile);

        grid.setItems(mitSumme);

        gesamtAusgleichLabel.setText(
                String.format("Gesamtausgleich: %,.2f €", gesamt)
        );
    }
}
