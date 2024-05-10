package org.example.model;

public abstract class Currency {
    private String code;
    private double rate;

    public Currency(String code) {
        this.code = code;
    }
    public Currency(String code, double rate) {
        this.code = code;
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }
    public double getRate() {
        return rate;
    }

    public abstract String getSymbol();

    @Override
    public String toString() {
        return code + ":" + rate;
    }
}