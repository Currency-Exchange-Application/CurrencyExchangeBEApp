package org.example.service;

import org.example.model.Currency;
import org.example.model.ExchangeRatesDto;
import org.example.model.User;
import org.example.model.UserType;
import org.example.repository.RatesRepository;

public class CurrencyExchangeServiceImpl {
    private final RatesRepository exchangeRepository = new RatesRepository();

    public double convertCurrency(double amount, Currency fromCurrency, Currency toCurrency) {
        return fromCurrency.getRate() / toCurrency.getRate() * amount;
    }

    public void addExchangeRate(User user, ExchangeRatesDto exchangeRatesDto) {
        if (user.getUserType() == UserType.ADMIN) {
            exchangeRepository.addExchangeRates(exchangeRatesDto);
        } else {
            throw new IllegalArgumentException("Regular users are not authorized to set exchange rates");
        }
    }
}
