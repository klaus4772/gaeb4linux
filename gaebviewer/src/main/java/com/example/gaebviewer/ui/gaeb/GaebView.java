package com.example.gaebviewer.ui.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImportService;
import com.example.gaebviewer.domain.gaeb.GaebPosition;
import com.example.gaebviewer.domain.gaeb.GaebProject;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("gaeb")
public class GaebView extends VerticalLayout {

    private final GaebImportService gaebImportService;
    private final Grid<GaebPosition> positionGrid = new Grid<>();
    private final TextArea shortTextDisplay = new TextArea("Short Text");
    private final TextArea longTextDisplay = new TextArea("Long Text");

    public GaebView(GaebImportService gaebImportService) {

        this.gaebImportService = gaebImportService;

        setSizeFull();
        setPadding(true);
        setSpacing(true);

        add(new H2("GAEB XML Viewer"));

        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);
        upload.setWidthFull();

        upload.setAcceptedFileTypes(
                ".xml", ".XML",
                ".x80", ".X80",
                ".x81", ".X81",
                ".x82", ".X82",
                ".x83", ".X83",
                ".x84", ".X84",
                ".x85", ".X85",
                ".x86", ".X86",
                ".x87", ".X87"
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
                upload.getElement().executeJs("this.files = []");
            } catch (Exception e) {
                Notification.show("Fehler beim Import: " + e.getMessage());
            }
        });

        positionGrid.removeAllColumns();
        positionGrid.addColumn(GaebPosition::getNumber).setHeader("No.").setAutoWidth(true).setFlexGrow(0);
        positionGrid.addColumn(p -> p.getShortText() == null ? "" : p.getShortText()).setHeader("Short Text");
        positionGrid.setSizeFull();

        positionGrid.addSelectionListener(event -> {
            GaebPosition selected = event.getFirstSelectedItem().orElse(null);
            if (selected != null) {
                shortTextDisplay.setValue(selected.getShortText() == null ? "" : selected.getShortText());
                longTextDisplay.setValue(selected.getLongText() == null ? "" : selected.getLongText());
            } else {
                shortTextDisplay.clear();
                longTextDisplay.clear();
            }
        });

        shortTextDisplay.setReadOnly(true);
        shortTextDisplay.setWidthFull();
        shortTextDisplay.setHeight("200px");
        longTextDisplay.setReadOnly(true);
        longTextDisplay.setWidthFull();
        longTextDisplay.setHeight("400px");

        VerticalLayout detailLayout = new VerticalLayout(shortTextDisplay, longTextDisplay);
        detailLayout.setSizeFull();
        detailLayout.setPadding(false);
        detailLayout.setSpacing(true);

        HorizontalLayout mainLayout = new HorizontalLayout(positionGrid, detailLayout);
        mainLayout.setSizeFull();
        mainLayout.setFlexGrow(1, positionGrid);
        mainLayout.setFlexGrow(2, detailLayout);

        add(upload, mainLayout);
        setFlexGrow(1, mainLayout);
    }
}