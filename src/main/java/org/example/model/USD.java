package org.example.model;

// Concrete class representing a specific currency
class USD extends Currency {
    public USD() {
        super("USD");
    }

    @Override
    public String getSymbol() {
        return "$";
    }
}