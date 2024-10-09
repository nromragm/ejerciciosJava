package com.es.tema1.ejerProductos.repository;

import com.es.tema1.ejerProductos.model.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository implements GenericRepositoryAPI<String, Empleado> {

    ArrayList<Empleado> bddEmpleados = new ArrayList<>();


    @Override
    public Empleado insert(Empleado x) {
        bddEmpleados.add(x);
        return x;
    }


    public Empleado get(String key) {

        return bddEmpleados.stream().filter(e -> e.getDni().equals(key)).findFirst().orElse(null);
    }


    public List<Empleado> getAll() {
        return bddEmpleados;
    }

    public void delete(String key) {
        bddEmpleados.stream().filter(e -> e.getDni().equals(key)).findFirst().ifPresent(empleado -> bddEmpleados.remove(empleado));
    }


}
