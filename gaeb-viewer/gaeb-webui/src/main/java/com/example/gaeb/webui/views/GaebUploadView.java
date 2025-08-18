// Package: com.example.gaeb.webui.view

package com.example.gaeb.webui.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import com.example.gaeb.core.model.Position;
import com.example.gaeb.core.model.Tender;
import com.example.gaeb.core.parser.GaebXmlParser;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Route("")
public class GaebUploadView extends VerticalLayout {

    private final Grid<Position> positionGrid = new Grid<>(Position.class);

    public GaebUploadView() {
        setPadding(true);
        setSpacing(true);
        add(new H2("GAEB XML Viewer"));

        MemoryBuffer buffer = new MemoryBuffer();
        Upload upload = new Upload(buffer);
        upload.setAcceptedFileTypes(".xml");
        upload.setMaxFiles(1);
        upload.setDropAllowed(true);
        upload.addSucceededListener(event -> {
            try (InputStream inputStream = buffer.getInputStream()) {
                // Temporäre Datei anlegen, falls benötigt
                Path tempFile = Files.createTempFile("gaeb", ".xml");
                Files.copy(inputStream, tempFile, java.nio.file.StandardCopyOption.REPLACE_EXISTING);

                GaebXmlParser parser = new GaebXmlParser();
                Tender tender = parser.parse(tempFile.toFile());

                List<Position> positions = tender.getPositions();
                positionGrid.setItems(positions);
                Notification.show("Loaded " + positions.size() + " positions from: " + tender.getTitle());
            } catch (Exception e) {
                Notification.show("Error parsing file: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
                e.printStackTrace();
            }
        });

        positionGrid.setColumns("number", "shortText");
        positionGrid.getColumnByKey("number").setHeader("Position No.");
        positionGrid.getColumnByKey("shortText").setHeader("Short Text");

        add(upload, positionGrid);
    }
}
