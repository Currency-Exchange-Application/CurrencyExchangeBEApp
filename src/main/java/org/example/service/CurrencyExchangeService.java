package org.example.service;

import org.example.model.Currency;
import org.example.model.User;
import org.example.model.UserType;

public class CurrencyExchangeService {
    private CurrencyExchange currencyExchange;

    public CurrencyExchangeService(CurrencyExchange currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    public double convertCurrency(double amount, Currency fromCurrency, Currency toCurrency) {
        return currencyExchange.convertCurrency(amount, fromCurrency, toCurrency);
    }

    public void setExchangeRate(User user, String currencyCode, double rate) {
        if (user.getUserType() == UserType.ADMIN) {
            currencyExchange.setExchangeRate(currencyCode, rate);
        } else {
            throw new IllegalArgumentException("Regular users are not authorized to set exchange rates");
        }
    }
}
