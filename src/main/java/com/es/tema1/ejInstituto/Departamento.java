package com.es.tema1.ejInstituto;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, length = 3)
    private int numProfesores;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_instituto")
    private Instituto instituto;

    public Departamento(String nombre, int numProfesores, Instituto instituto) {
        this.nombre = nombre;
        this.numProfesores = numProfesores;
        this.instituto = instituto;
    }

    public Departamento() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumProfesores() {
        return numProfesores;
    }

    public void setNumProfesores(int numProfesores) {
        this.numProfesores = numProfesores;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }
}
