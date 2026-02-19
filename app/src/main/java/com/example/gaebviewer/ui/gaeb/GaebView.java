package com.example.gaebviewer.ui.gaeb;

import com.example.gaebviewer.core.gaeb.service.GaebImportService;
import com.example.gaebviewer.core.model.Position;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;

import java.util.List;
import java.util.stream.Collectors;

@Route("gaeb")
public class GaebView extends VerticalLayout {

    private final GaebImportService gaebImportService;
    private final Grid<Position> positionGrid = new Grid<>(Position.class);

    public GaebView(GaebImportService gaebImportService) {

        this.gaebImportService = gaebImportService;

        setPadding(true);
        setSpacing(true);

        add(new H2("GAEB XML Viewer"));

        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);

        upload.setAcceptedFileTypes(
                ".xml",
                ".x81",
                ".x82",
                ".x83",
                ".x84",
                ".x85",
                ".x87"
        );

        upload.setMaxFiles(1);

        upload.addSucceededListener(event -> {
            try {

                List<Position> positionen =
                        gaebImportService.importGaeb(buffer.getInputStream());

                positionGrid.setItems(positionen);

                Notification.show("GAEB erfolgreich geladen.");

            } catch (Exception e) {
                Notification.show("Fehler beim Import: " + e.getMessage());
            }
        });

        positionGrid.setColumns("number", "shortText");

        positionGrid.getColumnByKey("number")
                .setHeader("Position No.");

        positionGrid.getColumnByKey("shortText")
                .setHeader("Short Text");

        positionGrid.addColumn(position ->
                position.getItemTexts().stream()
                        .map(t -> t.getContent())
                        .collect(Collectors.joining("\n"))
        ).setHeader("Item Text");

        add(upload, positionGrid);
    }
}
