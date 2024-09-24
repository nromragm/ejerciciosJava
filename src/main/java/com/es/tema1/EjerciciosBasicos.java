package com.es.tema1;

public class EjerciciosBasicos {

    public String ejercicio1() {
        int x = 144;
        int y = 999;
        int suma = x + y;
        int multiplicacion = x * y;
        float division = (float) x /y;

        System.out.println(division);
        return "x = " + x + ", y = " + y + ", suma = " + suma + ", multiplicacion = " + multiplicacion + ", division = " + division;
    }
    public static void main(String[] args) {
        EjerciciosBasicos ejerciciosBasicos = new EjerciciosBasicos();
        System.out.println(ejerciciosBasicos.ejercicio1());
    }
}
