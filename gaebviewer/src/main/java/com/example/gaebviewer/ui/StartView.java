package com.example.gaebviewer.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class StartView extends VerticalLayout {

    public StartView() {

        add(new H1("GAEB4Linux"));

        Button gaebButton = new Button("GAEB Viewer",
                e -> getUI().ifPresent(ui -> ui.navigate("gaeb")));

        Button ausgleichButton = new Button("Ausgleichsberechnung",
                e -> getUI().ifPresent(ui -> ui.navigate("ausgleich")));

        add(gaebButton, ausgleichButton);
    }
}
