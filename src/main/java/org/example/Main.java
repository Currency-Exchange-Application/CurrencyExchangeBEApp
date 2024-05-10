package org.example;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.service.CurrencyExchangeServiceImpl;
import org.example.service.UserService;

import java.util.Scanner;

public class Main {
    private static UserService userService;
    private static UserRepository userRepository = new UserRepository();
    private static CurrencyExchangeServiceImpl currencyExchangeServiceImpl;
    private static Scanner scanner;

    public static void main(String[] args) {

        userService = new UserService();
        currencyExchangeServiceImpl = new CurrencyExchangeServiceImpl();
        scanner = new Scanner(System.in);

        menu();
    }

    public static void menu() {
        System.out.println("Welcome to Currency Exchange App");
        System.out.println("Please login:");

        User user = login();
        if (user == null) {
            System.out.println("Invalid email or password. Please try again.");
            menu();
        } else {
            System.out.println("Login successful.");
            System.out.println("Hello, " + user.getEmail() + "!");

            switch (user.getUserType()) {
                case ADMIN:
                    adminActions();
                    break;
                case USER:
                    userActions();
                    break;
            }
        }
    }

    public static User login() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        return userService.loginUser(email, password);
    }

    public static void adminActions() {
        System.out.println("Admin actions:");
        //TO-DO
        exit();
    }

    // Actions for regular user
    public static void userActions() {
        System.out.println("Regular user actions:");
        //TO-DO
        exit();
    }

    public static void exit() {
        System.out.println("Goodbye!");
        scanner.close();
        System.exit(0);
    }
}
