package org.example.model;

// Concrete class representing a specific currency
class GBP extends Currency {
    public GBP() {
        super("GBP");
    }

    @Override
    public String getSymbol() {
        return "£";
    }
}