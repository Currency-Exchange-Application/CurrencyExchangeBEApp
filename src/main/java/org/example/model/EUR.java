package org.example.model;

public class EUR extends Currency {
    public EUR() {
        super("EUR");
    }

    @Override
    public String getSymbol() {
        return "€";
    }
}