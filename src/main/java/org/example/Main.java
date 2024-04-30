package org.example;

import org.example.model.User;
import org.example.service.CurrencyExchangeService;
import org.example.service.SimpleCurrencyExchange;
import org.example.service.UserService;

import java.util.Scanner;

public class Main {
    private static UserService userService;
    private static CurrencyExchangeService currencyExchangeService;
    private static Scanner scanner;

    public static void main(String[] args) {
        SimpleCurrencyExchange exchange = new SimpleCurrencyExchange();
        exchange.setExchangeRate("USD", 1.0);
        exchange.setExchangeRate("EUR", 0.85);
        exchange.setExchangeRate("GBP", 0.75);

        userService = new UserService();
        currencyExchangeService = new CurrencyExchangeService(exchange);
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
                case REGULAR_USER:
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
        return userService.authenticateUser(email, password);
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
