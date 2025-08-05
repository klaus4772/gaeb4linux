// Package: de.example.gaeb.webui

package com.example.gaeb.webui;
package com.example.gaeb.core.model;

import com.vaadin.flow.spring.annotation.EnableVaadin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableVaadin
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
