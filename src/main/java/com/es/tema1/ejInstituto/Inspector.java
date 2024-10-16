package com.es.tema1.ejInstituto;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "inspector")
public class Inspector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    private String nombre;

    @Column(length = 2)
    private int edad;

    @OneToMany(mappedBy = "inspector", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Instituto> institutos;

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

    public List<Instituto> getInstitutos() {
        return institutos;
    }

    public void setInstitutos(List<Instituto> institutos) {
        this.institutos = institutos;
    }

    public Inspector() {}

    public Inspector(String nombre, int edad, List<Instituto> institutos) {
        this.nombre = nombre;
        this.edad = edad;
        this.institutos = institutos;
    }
}
