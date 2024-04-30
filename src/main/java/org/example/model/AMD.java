package org.example.model;

public class AMD extends Currency {

    public AMD() {
        super("AMD");
    }

    @Override
    public String getSymbol() {
        return "€";
    }
}