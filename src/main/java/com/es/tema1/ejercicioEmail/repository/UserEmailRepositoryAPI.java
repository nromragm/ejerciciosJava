package com.es.tema1.ejercicioEmail.repository;

import com.es.tema1.ejercicioEmail.model.UserEmail;

public interface UserEmailRepositoryAPI {

    UserEmail getUserEmail(String email);

    UserEmail insertUserEmail(UserEmail u);

    boolean deleteUserEmail(String email);
}
