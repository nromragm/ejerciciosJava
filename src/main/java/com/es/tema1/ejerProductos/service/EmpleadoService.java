package com.es.tema1.ejerProductos.service;

import com.es.tema1.ejerProductos.model.Empleado;
import com.es.tema1.ejerProductos.repository.EmpleadoRepository;
import com.es.tema1.ejerProductos.repository.GenericRepositoryAPI;

public class EmpleadoService {

    private final GenericRepositoryAPI<String, Empleado> repository;

    public EmpleadoService() {
        this.repository = new EmpleadoRepository();
    }


}
