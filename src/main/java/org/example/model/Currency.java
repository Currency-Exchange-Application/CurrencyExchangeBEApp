package org.example.model;

public abstract class Currency {
    private String code;

    public Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public abstract String getSymbol();
}