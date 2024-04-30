package org.example.dao;

import org.example.model.User;

import java.util.List;

public class UserDao {

    List<User> users;


    public User findUserByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
    }

    public boolean addUser(User user) {
        return users.add(user);
    }


}
