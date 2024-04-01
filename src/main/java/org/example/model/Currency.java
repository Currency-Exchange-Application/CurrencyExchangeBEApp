package org.example.model;

// Abstract class representing a generic currency
public abstract class Currency {
    private String code;

    public Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    // Abstract method to get symbol for the currency
    public abstract String getSymbol();
}