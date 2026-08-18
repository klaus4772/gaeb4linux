package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "gaeb_construction_site")
public class GaebConstructionSiteEntity {

    @Id
    private UUID id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    protected GaebConstructionSiteEntity() {
        // JPA
    }

    public GaebConstructionSiteEntity(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
