package org.example.service;

import org.example.model.Currency;


public class SimpleCurrencyExchange extends CurrencyExchange {
    @Override
    public double convertCurrency(double amount, Currency fromCurrency, Currency toCurrency) {
        double fromRate = exchangeRates.get(fromCurrency.getCode());
        double toRate = exchangeRates.get(toCurrency.getCode());
        return (amount / fromRate) * toRate;
    }

}