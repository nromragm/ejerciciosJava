package com.es.tema1.ejInstituto;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column
    private List<String> productos;

    @ManyToMany(mappedBy = "proveedores", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Instituto> institutos;

    public Proveedor(String nombre, List<String> productos, List<Instituto> institutos) {
        this.nombre = nombre;
        this.productos = productos;
        this.institutos = institutos;
    }

    public Proveedor() {}

    public List<Instituto> getInstitutos() {
        return institutos;
    }

    public void setInstitutos(List<Instituto> institutos) {
        this.institutos = institutos;
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

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }
}
