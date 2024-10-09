package com.es.tema1.ejerProductos.repository;

import com.es.tema1.ejerProductos.model.Producto;

import java.util.*;

public class ProductoRepository implements GenericRepositoryAPI<String, Producto> {

    private final Set<Producto> bddProducto;

    public ProductoRepository(Set<Producto> bddProducto) {
        this.bddProducto = bddProducto;
    }

    //c
    public Producto insert(Producto x) {
        bddProducto.add(x);
        return x;
    }

    //r
    public Producto get(String key) {
        return bddProducto.stream().filter(p -> p.getId().equals(key)).findFirst().orElse(null);
    }

    public List<Producto> getAll() {
        return bddProducto.stream().toList();
    }


    public void delete(String key) {
        bddProducto.stream().filter(p -> p.getId().equals(key)).findFirst().ifPresent(bddProducto::remove);
    }
}
