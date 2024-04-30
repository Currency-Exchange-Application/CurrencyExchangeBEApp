package org.example.service;

import org.example.model.Currency;

import java.util.HashMap;

abstract class CurrencyExchange {
    protected HashMap<String, Double> exchangeRates;

    public CurrencyExchange() {
        exchangeRates = new HashMap<>();
    }

    public void setExchangeRate(String currencyCode, double rate) {
        exchangeRates.put(currencyCode, rate);
    }

    public double getExchangeRate(String currencyCode) {
        return exchangeRates.get(currencyCode);
    }

    public abstract double convertCurrency(double amount, Currency fromCurrency, Currency toCurrency);
}