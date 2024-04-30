package org.example.service;

import org.example.dao.UserDao;
import org.example.model.User;
import org.example.model.UserType;

public class UserService {

    private UserDao users;

    public UserService() {

    }

    public User authenticateUser(String email, String password) {
        User user = users.findUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean createUser(String email, String password, String userType) {
        return users.addUser(new User(email, password, UserType.valueOf(userType)));
    }
}