package com.example.gaebviewer;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Minimal Spring Boot context used only to load the JPA/repository beans of the
 * gaeb-editor-basic module in tests, against an in-memory H2 database instead of Postgres.
 */
@SpringBootApplication
public class EditorTestApplication {
}
