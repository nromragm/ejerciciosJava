package com.es.tema1.ejercicioEmail.controller;

import com.es.tema1.ejercicioEmail.model.RespuestaHTTP;
import com.es.tema1.ejercicioEmail.model.UserEmail;
import com.es.tema1.ejercicioEmail.services.UserEmailService;

public class UserEmailController {

    private UserEmailService service;

    public UserEmailController() {
        this.service = new UserEmailService();
    }

    public RespuestaHTTP getUserEmail(String email) {

        try {
            UserEmail u = service.getUserEmail(email);
            return u != null ?
                    new RespuestaHTTP(200, "TODO OK", u) :
                    new RespuestaHTTP(400, "Bad Request");

        } catch (Exception e) {
            return new RespuestaHTTP(500, "Fatal Internal Error");
        }
    }

    public RespuestaHTTP insertUserEmail(String nombre, String email) {
        try {
            UserEmail u = service.insertUserEmail(nombre, email);
            return u != null ?
                    new RespuestaHTTP(200, "TODO OK", u) :
                    new RespuestaHTTP(400, "Bad Request");

        } catch (Exception e) {
            return new RespuestaHTTP(500, "Fatal Internal Error");
        }
    }

    public boolean deleteUserEmail(String email) {
        try {
            UserEmail u = service.deleteUserEmail(email);
            return u != null;

        } catch (Exception e) {
            return false;
        }
    }
}
