package com.example.gaebviewer.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("")
public class StartView extends VerticalLayout {

    public StartView() {
        setSizeFull();
        setPadding(true);
        setSpacing(true);
        setAlignItems(Alignment.CENTER);
        addClassNames(LumoUtility.Padding.LARGE, LumoUtility.Gap.MEDIUM);

        H1 title = new H1("GAEB4Linux");
        title.addClassNames(LumoUtility.FontSize.XXLARGE, LumoUtility.Margin.Bottom.NONE);

        Button gaebButton = new Button("GAEB Viewer",
                e -> getUI().ifPresent(ui -> ui.navigate("gaeb")));
        gaebButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        gaebButton.addClassNames(LumoUtility.Width.FULL);

        Button editorButton = new Button("GAEB Editor",
                e -> getUI().ifPresent(ui -> ui.navigate("editor")));
        editorButton.addClassNames(LumoUtility.Width.FULL);

        Button projectsButton = new Button("Projektübersicht",
                e -> getUI().ifPresent(ui -> ui.navigate("projects")));
        projectsButton.addClassNames(LumoUtility.Width.FULL);

        Button settingsButton = new Button("Einstellungen",
                e -> getUI().ifPresent(ui -> ui.navigate("settings")));
        settingsButton.addClassNames(LumoUtility.Width.FULL);

        add(title, gaebButton, editorButton, projectsButton, settingsButton);
    }
}
