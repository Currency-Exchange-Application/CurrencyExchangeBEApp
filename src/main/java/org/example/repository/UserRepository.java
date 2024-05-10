package org.example.repository;

import org.example.model.User;
import org.example.service.UserService;

import java.io.*;

public class UserRepository {

    private UserService userService;
    private static final String fileName = "users.txt";


    public boolean saveUser(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            if (loadUser(user.getEmail()) != null) {
                return false;
            }
            writer.write(user.toString());
            System.out.println("User added successfully");
            return true;
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        return false;
    }

    public User loadUser(String email) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(email)) {
                    return userService.parseUserFromString(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return null;
    }
}
