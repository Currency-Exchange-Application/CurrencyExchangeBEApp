package org.example.service;

import org.example.model.User;
import org.example.model.UserType;
import org.example.repository.UserRepository;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public User parseUserFromString(String s) {
        String[] userDetails = s.split(" ");
        return new User(userDetails[1], userDetails[3], UserType.valueOf(userDetails[5]));
    }

    public User loginUser(String email, String password) {
        User user = userRepository.loadUser(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean registerUser(String email, String password, String userType) {
        return userRepository.saveUser(new User(email, password, UserType.valueOf(userType)));
    }
}