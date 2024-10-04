package com.es.tema1.ejercicioEmail;

import com.es.tema1.ejercicioEmail.controller.UserEmailController;
import com.es.tema1.ejercicioEmail.model.RespuestaHTTP;

import java.util.Scanner;

public class AppEmail {
    public static void main(String[] args) {
        UserEmailController controller = new UserEmailController();

        Scanner Read = new Scanner(System.in);

        System.out.println();
        String opcion = "";
        while (!opcion.equals("0")) {



            System.out.println("""
                    
                    Elija opcion:
                    1. Insertar Usuario
                    2. Obtener Usuario
                    3. Eliminar Usuario
                    0. Salir
                    
                    """);

            opcion = Read.next();

            switch (opcion) {
                case "1":
                    System.out.println("Inserta el nombre del usuario: ");
                    String unombre = Read.next();

                    System.out.println("Inserta el email del usuario: ");
                    String uemail = Read.next();

                    RespuestaHTTP r1 = controller.insertUserEmail(unombre, uemail);

                    if (r1.getCodigoRespuesta() == 200) {
                        System.out.println(r1.getUserEmail().toString());
                    } else {
                        System.out.println(r1.getMensajeRespuesta());
                    }

                    break;

                case "2":
                    System.out.println("Inserta el email del usuario: ");
                    String email = Read.next();
                    RespuestaHTTP r2 = controller.getUserEmail(email);

                    if (r2.getCodigoRespuesta() == 200) {
                        System.out.println(r2.getUserEmail().toString());
                    } else {
                        System.out.println(r2.getMensajeRespuesta());
                    }
                    break;

                case "3":
                    System.out.println("Inserta el email del usuario a borrar: ");
                    String uemail2 = Read.next();
                    boolean res = controller.deleteUserEmail(uemail2);

                    if (res) {
                        System.out.println("Borrado con exito");
                    } else {
                        System.out.println("Error al borrar el usuario");
                    }
                    break;
                case "0":
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Error opcion no valida");
                    break;
            }
        }

        RespuestaHTTP respuesta = controller.getUserEmail("eliaser@gmail.com");

        System.out.println(respuesta);
    }
}
