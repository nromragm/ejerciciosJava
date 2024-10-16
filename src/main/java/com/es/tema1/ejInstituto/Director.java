package com.es.tema1.ejInstituto;

import jakarta.persistence.*;

@Entity
@Table(name = "director")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(length = 2, nullable = false)
    private int edad;

    @OneToOne(mappedBy = "director", fetch = FetchType.LAZY)
    private Instituto instituto;


    public Director(String nombre, int edad, Instituto instituto) {
        this.nombre = nombre;
        this.edad = edad;
        this.instituto = instituto;
    }

    public Director() {}

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }

}
