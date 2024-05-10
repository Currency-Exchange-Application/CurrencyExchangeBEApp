package org.example.model;

public class AMD extends Currency {

    public AMD() {
        super("AMD", 1d);
    }

    @Override
    public String getSymbol() {
        return "€";
    }
}