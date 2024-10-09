package com.es.tema1.ejemploHibernateClase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Autor {

    @Id
    private String dni;

    @Column
    private int npeliculas;

    public Autor() {}

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNpeliculas() {
        return npeliculas;
    }

    public void setNpeliculas(int npeliculas) {
        this.npeliculas = npeliculas;
    }
}
