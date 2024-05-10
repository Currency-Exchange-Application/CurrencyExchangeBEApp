package org.example.model;

public class EUR extends Currency {

    public EUR(double rate) {
        super("EUR", rate);
    }

    @Override
    public String getSymbol() {
        return "€";
    }
}