// Package: de.example.gaeb.webui

package com.example.gaeb.webui;

import com.vaadin.flow.spring.annotation.EnableVaadin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
@EnableVaadin
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
