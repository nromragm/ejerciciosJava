package com.es.tema1.ejercicioEmail.controller;

import com.es.tema1.ejercicioEmail.model.RespuestaHTTP;
import com.es.tema1.ejercicioEmail.model.UserEmail;
import com.es.tema1.ejercicioEmail.services.UserEmailService;

public class UserEmailController {

    private UserEmailService service;

    public UserEmailController() {
        this.service = new UserEmailService();
    }

    public RespuestaHTTP login(String email, String password) {
        try {

            if (email == null || email.isEmpty()) {
                return new RespuestaHTTP(400,"Bad Request");
            }
            if (password == null || password.isEmpty()) {
                return new RespuestaHTTP(400,"Bad Request");
            }

            boolean respuestaService = service.login(email, password);

            if (respuestaService) {
                return new RespuestaHTTP(200, "Todo ok");

            } else return new RespuestaHTTP(403, "no autorizado");

        } catch (Exception e) {
            return new RespuestaHTTP(500, "Error");
        }
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

    public RespuestaHTTP insertUserEmail(String nombre, String email, String password) {
        try {
            UserEmail u = service.insertUserEmail(nombre, email, password);
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
