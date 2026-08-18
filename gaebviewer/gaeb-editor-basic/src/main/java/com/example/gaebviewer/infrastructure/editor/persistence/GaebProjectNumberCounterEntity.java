package com.example.gaebviewer.infrastructure.editor.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gaeb_project_number_counter")
public class GaebProjectNumberCounterEntity {

    public static final int SINGLETON_ID = 1;

    @Id
    private Integer id;

    @Column(name = "next_value", nullable = false)
    private long nextValue;

    protected GaebProjectNumberCounterEntity() {
        // JPA
    }

    public GaebProjectNumberCounterEntity(Integer id, long nextValue) {
        this.id = id;
        this.nextValue = nextValue;
    }

    public Integer getId() {
        return id;
    }

    public long getNextValue() {
        return nextValue;
    }

    public void setNextValue(long nextValue) {
        this.nextValue = nextValue;
    }
}
