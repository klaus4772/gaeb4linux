package com.example.gaeb.webui.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("") // erreichbar unter http://localhost:8080/
public class MainView extends VerticalLayout {

    public MainView() {
        add(new H1("This ist gaeb viewer's first view 🚀"));
    }
}
