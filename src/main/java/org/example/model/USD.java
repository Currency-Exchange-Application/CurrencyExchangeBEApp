package org.example.model;

public class USD extends Currency {
    public USD(double rate) {
        super("USD", rate);
    }

    @Override
    public String getSymbol() {
        return "$";
    }
}