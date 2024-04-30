package org.example.dao;

import org.example.model.Currency;
import org.example.model.*;

import java.util.HashMap;
import java.util.Map;

public class CurrencyDao {

    Map<String, Currency> currencies;

    public CurrencyDao() {
        currencies = new HashMap<>();
        currencies.put("USD", new USD());
        currencies.put("GBP", new GBP());
        currencies.put("EUR", new EUR());
        currencies.put("AMD", new AMD());
    }
}
