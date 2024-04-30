package org.example.model;

public class GBP extends Currency {
    public GBP() {
        super("GBP");
    }

    @Override
    public String getSymbol() {
        return "£";
    }
}