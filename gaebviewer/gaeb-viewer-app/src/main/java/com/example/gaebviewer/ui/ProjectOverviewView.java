package com.example.gaebviewer.ui;

import com.example.gaebviewer.application.editor.GaebEditorPersistenceService;
import com.example.gaebviewer.infrastructure.editor.persistence.GaebDocumentEntity;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Route("projects")
public class ProjectOverviewView extends VerticalLayout {

    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.systemDefault());

    private final GaebEditorPersistenceService persistenceService;
    private final Grid<GaebDocumentEntity> grid = new Grid<>();

    public ProjectOverviewView(GaebEditorPersistenceService persistenceService) {
        this.persistenceService = persistenceService;
        setSizeFull();
        add(new H2("Projektübersicht"));

        grid.addColumn(GaebDocumentEntity::getProjectNumber).setHeader("Projektnummer").setAutoWidth(true);
        grid.addColumn(d -> d.getProjectName() == null ? "" : d.getProjectName()).setHeader("Projektname").setAutoWidth(true);
        grid.addColumn(d -> d.getNameValue() == null ? "" : d.getNameValue()).setHeader("LV-Kennung").setAutoWidth(true);
        grid.addColumn(d -> DATE_TIME_FORMATTER.format(d.getImportedAt())).setHeader("Erstellungsdatum").setAutoWidth(true);
        grid.addColumn(d -> d.isEditable() ? "änderbar" : "nicht änderbar").setHeader("Bearbeitungsstatus").setAutoWidth(true);
        grid.addComponentColumn(d -> {
            Button open = new Button("Projekt öffnen");
            Button edit = new Button("LV bearbeiten");
            open.addClickListener(e -> getUI().ifPresent(ui ->
                    ui.navigate("editor", QueryParameters.simple(Map.of("documentId", d.getId().toString())))));
            edit.addClickListener(e -> getUI().ifPresent(ui ->
                    ui.navigate("editor", QueryParameters.simple(Map.of("documentId", d.getId().toString())))));
            return new com.vaadin.flow.component.orderedlayout.HorizontalLayout(open, edit);
        }).setHeader("Aktion").setAutoWidth(true);
        grid.setSizeFull();

        add(grid);
        setFlexGrow(1, grid);
        reload();
    }

    private void reload() {
        List<GaebDocumentEntity> projects = persistenceService.loadProjects();
        grid.setItems(projects);
    }
}
