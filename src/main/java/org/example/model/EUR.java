package org.example.model;

// Concrete class representing a specific currency
class EUR extends Currency {
    public EUR() {
        super("EUR");
    }

    @Override
    public String getSymbol() {
        return "€";
    }
}