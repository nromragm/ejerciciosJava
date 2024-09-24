package com.es.tema0;

import java.util.*;

public class MiClaseJava {

    public static void main(String[] args) {

        System.out.println("Hola mundo");

        int numero = 1;
        String nombre = "hola";

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Arrays ->
        String[] arrayDeString = new String[5];

        arrayDeString[0] = "Cadena";
        arrayDeString[1] = "Cadena2";
        arrayDeString[2] = "Cadena3";
        arrayDeString[3] = "Cadena4";
        arrayDeString[arrayDeString.length -1] = "Ultima Cadena";

        //Bucle for each

        for (String cadenaTemp : arrayDeString) {
            System.out.println(cadenaTemp);
        }


        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.forEach(i -> System.out.println(i));

        Map<Integer, String> mapaNum = new HashMap<>();


    }
}

