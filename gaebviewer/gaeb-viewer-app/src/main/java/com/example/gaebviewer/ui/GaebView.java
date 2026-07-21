package com.example.gaebviewer.ui.gaeb;

import com.example.gaebviewer.application.gaeb.GaebImportService;
import com.example.gaebviewer.domain.gaeb.GaebPosition;
import com.example.gaebviewer.domain.gaeb.GaebProject;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Route("gaeb")
public class GaebView extends VerticalLayout {

    private final GaebImportService gaebImportService;
    private final TreeGrid<GaebPosition> positionGrid = new TreeGrid<>();
    private final TextField numberDisplay = new TextField("Positionsnummer");
    private final TextField quantityDisplay = new TextField("Menge");
    private final TextField unitDisplay = new TextField("Einheit");
    private final TextField unitPriceDisplay = new TextField("Einheitspreis");
    private final TextField totalPriceDisplay = new TextField("Gesamtpreis");
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

                showAsHierarchy(positionen);

                Notification.show("GAEB erfolgreich geladen. (" + positionen.size() + " Positionen)");
                upload.getElement().executeJs("this.files = []");
            } catch (Exception e) {
                Notification.show("Fehler beim Import: " + e.getMessage());
            }
        });

        positionGrid.removeAllColumns();
        positionGrid.addHierarchyColumn(GaebPosition::getNumber).setHeader("No.").setWidth("220px").setFlexGrow(0);
        positionGrid.addColumn(p -> p.getShortText() == null ? "" : p.getShortText()).setHeader("Short Text");
        positionGrid.setSizeFull();

        positionGrid.addSelectionListener(event -> {
            GaebPosition selected = event.getFirstSelectedItem().orElse(null);
            if (selected != null) {
                numberDisplay.setValue(selected.getNumber() == null ? "" : selected.getNumber());
                quantityDisplay.setValue(selected.getQuantity() == null ? "" : selected.getQuantity().toString());
                unitDisplay.setValue(selected.getUnit() == null ? "" : selected.getUnit());
                unitPriceDisplay.setValue(selected.getUnitPrice() == null ? "" : selected.getUnitPrice().toString());
                totalPriceDisplay.setValue(selected.getTotalPrice() == null ? "" : selected.getTotalPrice().toString());
                shortTextDisplay.setValue(selected.getShortText() == null ? "" : selected.getShortText());
                longTextDisplay.setValue(selected.getLongText() == null ? "" : selected.getLongText());
            } else {
                numberDisplay.clear();
                quantityDisplay.clear();
                unitDisplay.clear();
                unitPriceDisplay.clear();
                totalPriceDisplay.clear();
                shortTextDisplay.clear();
                longTextDisplay.clear();
            }
        });

        numberDisplay.setReadOnly(true);
        quantityDisplay.setReadOnly(true);
        unitDisplay.setReadOnly(true);
        unitPriceDisplay.setReadOnly(true);
        totalPriceDisplay.setReadOnly(true);

        HorizontalLayout positionInfoRow = new HorizontalLayout(
                numberDisplay, quantityDisplay, unitDisplay, unitPriceDisplay);
        positionInfoRow.setWidthFull();
        positionInfoRow.setFlexGrow(2, numberDisplay);
        positionInfoRow.setFlexGrow(1, quantityDisplay);
        positionInfoRow.setFlexGrow(1, unitDisplay);
        positionInfoRow.setFlexGrow(1, unitPriceDisplay);

        shortTextDisplay.setReadOnly(true);
        shortTextDisplay.setWidthFull();
        shortTextDisplay.setHeight("200px");
        longTextDisplay.setReadOnly(true);
        longTextDisplay.setWidthFull();
        longTextDisplay.setHeight("400px");

        HorizontalLayout shortTextRow = new HorizontalLayout(shortTextDisplay, totalPriceDisplay);
        shortTextRow.setWidthFull();
        shortTextRow.setFlexGrow(4, shortTextDisplay);
        shortTextRow.setFlexGrow(1, totalPriceDisplay);

        VerticalLayout detailLayout = new VerticalLayout(positionInfoRow, shortTextRow, longTextDisplay);
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

    /**
     * Derives the parent/child hierarchy from the dot-joined position numbers
     * (e.g. "1.2.12" is a child of "1.2") and feeds it into the TreeGrid so
     * only the top hierarchy level is shown initially; deeper levels are
     * revealed by expanding each node.
     */
    private void showAsHierarchy(List<GaebPosition> positionen) {
        Map<String, GaebPosition> byNumber = new LinkedHashMap<>();
        for (GaebPosition p : positionen) {
            byNumber.put(p.getNumber(), p);
        }

        Map<String, List<GaebPosition>> childrenByParentNumber = new LinkedHashMap<>();
        List<GaebPosition> roots = new ArrayList<>();

        for (GaebPosition p : positionen) {
            String number = p.getNumber();
            int lastDot = number == null ? -1 : number.lastIndexOf('.');
            String parentNumber = lastDot > 0 ? number.substring(0, lastDot) : null;

            if (parentNumber != null && byNumber.containsKey(parentNumber)) {
                childrenByParentNumber.computeIfAbsent(parentNumber, k -> new ArrayList<>()).add(p);
            } else {
                roots.add(p);
            }
        }

        positionGrid.setItems(roots,
                p -> childrenByParentNumber.getOrDefault(p.getNumber(), List.of()));
    }
}