package com.es.tema1.ejInstituto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadMySQL");
        EntityManager em = emf.createEntityManager();

        // 1º Empezar una transaccion
        em.getTransaction().begin();


        Director director = new Director("Paco", 55, null);
        List<Departamento> listaDepartamentos = new ArrayList<>();
        Departamento departamento1 = new Departamento("Lengua", 7, null);
        listaDepartamentos.add(departamento1);
        Inspector inspector = new Inspector("Jose", 62, null);
        List<String> productos = Arrays.asList("Agua", "Fanta", "Cocacola", "UnEuro");
        Proveedor proveedor1 = new Proveedor("Pepe", productos, null);
        List<Proveedor> proveedores = new ArrayList<>();
        proveedores.add(proveedor1);
        Instituto instituto = new Instituto("El insti", 323, inspector, listaDepartamentos, director, proveedores);

        em.persist(instituto);

        em.getTransaction().commit();

        Instituto instiBusqueda = em.find(Instituto.class, 1);

        System.out.println(instiBusqueda.getNombre());
        System.out.println(instiBusqueda.getDirector().getNombre());
    }
}
