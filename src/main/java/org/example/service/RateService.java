package org.example.service;

import org.example.model.ExchangeRatesDto;
import org.example.model.*;

public class RateService {

    public ExchangeRatesDto parseRateFromString(String s) {
        String[] rates = s.split(" ");
        return new ExchangeRatesDto(rates[0], new USD(Double.parseDouble(rates[1].split(":")[1])),
                new EUR(Double.parseDouble(rates[2].split(":")[1])),
                new GBP(Double.parseDouble(rates[3].split(":")[1])));
    }
}
