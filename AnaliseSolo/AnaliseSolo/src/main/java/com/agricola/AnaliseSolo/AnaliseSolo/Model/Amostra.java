package com.agricola.AnaliseSolo.AnaliseSolo.Model;

import java.time.LocalDate;

public class Amostra {
    private long id;
    private LocalDate dataColeta;

    public Amostra(long id, LocalDate dataColeta) {
        this.id = id;
        this.dataColeta = dataColeta;
    }

    // Getters e setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(LocalDate dataColeta) {
        this.dataColeta = dataColeta;
    }
}