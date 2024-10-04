package com.es.tema1.ejercicioEmail.repository;

import com.es.tema1.ejercicioEmail.model.UserEmail;

import java.util.ArrayList;

public class UserEmailRepository implements UserEmailRepositoryAPI {


    ArrayList<UserEmail> bddUserEmail;

    public UserEmailRepository() {
        this.bddUserEmail = new ArrayList<>();
        bddUserEmail.add(new UserEmail("Eliaser", "eliaser@gmail.com"));
        bddUserEmail.add(new UserEmail("Sara", "sara@gmail.com"));
        bddUserEmail.add(new UserEmail("Manu", "manu@gmail.com"));
    }

    @Override
    public UserEmail getUserEmail(String email) {
        UserEmail userReturn = null;
        for (UserEmail u : bddUserEmail) {
            if (u.getEmail().equals(email)) {
                userReturn = u;
                break;
            }
        }
        return userReturn;
    }

    @Override
    public UserEmail insertUserEmail(UserEmail u) {
        bddUserEmail.add(u);
        return getUserEmail(u.getEmail());
    }

    @Override
    public boolean deleteUserEmail(String email) {
        return bddUserEmail.remove(getUserEmail(email));
    }
}
