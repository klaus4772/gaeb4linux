package com.example.gaebviewer.ui.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImportService;
import com.example.gaebviewer.domain.gaeb.GaebPosition;
import com.example.gaebviewer.domain.gaeb.GaebProject;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("gaeb")
public class GaebView extends VerticalLayout {

    private final GaebImportService gaebImportService;
    private final Grid<GaebPosition> positionGrid = new Grid<>();

    public GaebView(GaebImportService gaebImportService) {

        this.gaebImportService = gaebImportService;

        setPadding(true);
        setSpacing(true);

        add(new H2("GAEB XML Viewer"));

        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);

        upload.setAcceptedFileTypes(
                ".xml",
                ".x80",
                ".x81",
                ".x82",
                ".x83",
                ".x84",
                ".x85",
                ".x86",
                ".x87"
        );

        upload.setMaxFiles(1);

        upload.addSucceededListener(event -> {
            try {
                GaebProject project = gaebImportService.importGaeb(buffer.getInputStream());

                List<GaebPosition> positionen = project.getBoqs().isEmpty()
                        ? List.of()
                        : project.getBoqs().get(0).getPositions();

                positionGrid.setItems(positionen);

                Notification.show("GAEB erfolgreich geladen. (" + positionen.size() + " Positionen)");
            } catch (Exception e) {
                Notification.show("Fehler beim Import: " + e.getMessage());
            }
        });

        positionGrid.removeAllColumns();
        positionGrid.addColumn(GaebPosition::getNumber).setHeader("Position No.");
        positionGrid.addColumn(p -> p.getShortText() == null ? "" : p.getShortText()).setHeader("Short Text");
        positionGrid.addColumn(p -> p.getLongText() == null ? "" : p.getLongText()).setHeader("Long Text");
        positionGrid.addColumn(p -> p.getQuantity() == null ? "" : p.getQuantity().toPlainString()).setHeader("Qty");
        positionGrid.addColumn(p -> p.getUnit() == null ? "" : p.getUnit()).setHeader("Unit");
        positionGrid.addColumn(p -> p.getUnitPrice() == null ? "" : p.getUnitPrice().toPlainString()).setHeader("UP");
        positionGrid.addColumn(p -> p.getTotalPrice() == null ? "" : p.getTotalPrice().toPlainString()).setHeader("Total");

        add(upload, positionGrid);
    }
}