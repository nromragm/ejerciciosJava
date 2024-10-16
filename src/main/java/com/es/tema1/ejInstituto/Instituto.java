package com.es.tema1.ejInstituto;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Instituto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column(length = 5)
    private int numAlumnos;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_inspector")
    private Inspector inspector;

    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "departamento")
    @JoinColumn(name = "id_departamento")
    private List<Departamento> departamento;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_director")
    private Director director;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "inst_provee",
    joinColumns = @JoinColumn(name = "id_instituto"),
    inverseJoinColumns = @JoinColumn(name = "id_proveedor"))
    private List<Proveedor> proveedores;

    public Instituto(String nombre, int numAlumnos,Inspector inspector, List<Departamento> departamento, Director director, List<Proveedor> proveedores) {
        this.proveedores = proveedores;
        this.director = director;
        this.departamento = departamento;
        this.inspector = inspector;
        this.numAlumnos = numAlumnos;
        this.nombre = nombre;
    }

    public Instituto() {}

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public List<Departamento> getDepartamento() {
        return departamento;
    }

    public void setDepartamento(List<Departamento> departamento) {
        this.departamento = departamento;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

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

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

}
