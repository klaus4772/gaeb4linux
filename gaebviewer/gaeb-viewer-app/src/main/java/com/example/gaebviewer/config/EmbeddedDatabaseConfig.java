package com.example.gaebviewer.config;

import io.zonky.test.db.postgres.embedded.EmbeddedPostgres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Starts a real, throwaway PostgreSQL server (binary downloaded on first use, no Docker or
 * local Postgres install required) so the app can be tried out immediately. Activate with
 * {@code --spring.profiles.active=embedded-db}. Data lives only for the lifetime of the
 * process - fitting, since the editor's storage is itself meant to be temporary.
 * <p>
 * Defining a {@link DataSource} bean here makes Spring Boot back off its own
 * datasource auto-configuration, and Flyway migrates against this datasource automatically.
 */
@Configuration
@Profile("embedded-db")
public class EmbeddedDatabaseConfig {

    @Bean(destroyMethod = "close")
    public EmbeddedPostgres embeddedPostgres() throws IOException {
        return EmbeddedPostgres.builder().start();
    }

    @Bean
    public DataSource dataSource(EmbeddedPostgres embeddedPostgres) {
        return embeddedPostgres.getPostgresDatabase();
    }
}
