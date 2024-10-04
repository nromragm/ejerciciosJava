package com.es.tema1.ejercicioEmail.services;

import com.es.tema1.ejercicioEmail.model.UserEmail;
import com.es.tema1.ejercicioEmail.repository.UserEmailRepository;
import com.es.tema1.ejercicioEmail.repository.UserEmailRepositoryAPI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEmailService {

    private final UserEmailRepositoryAPI repository;
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private static final String NAME_REGEX = "^[a-zA-Z]{1,15}$";
    private static final Pattern NAME_PATTERN = Pattern.compile(NAME_REGEX);


    public boolean validarEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public static boolean validarNombre(String name) {
        if (name == null) {
            return false;
        }
        Matcher matcher = NAME_PATTERN.matcher(name);
        return matcher.matches();
    }

    public UserEmailService() {
        this.repository = new UserEmailRepository();
    }

    public UserEmail getUserEmail(String email) {
        if (email == null || email.isEmpty()) return null;

        return repository.getUserEmail(email);

    }

    public UserEmail insertUserEmail(String nombre, String email) {
        if (validarNombre(nombre) && validarEmail(email)) {
            return repository.insertUserEmail(new UserEmail(nombre, email));
        } else return null;
    }

    public UserEmail deleteUserEmail(String email) {
        if (email == null || email.isEmpty()) return null;

        UserEmail u = repository.getUserEmail(email);

        repository.deleteUserEmail(email);

        return u;
    }
}
