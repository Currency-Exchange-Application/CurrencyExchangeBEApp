package org.example.repository;

import org.example.model.ExchangeRatesDto;
import org.example.service.RateService;

import java.io.*;

public class RatesRepository {
    private static final String fileName = "exchangeRates.txt";
    private final RateService rateService = new RateService();


    public void addExchangeRates(ExchangeRatesDto exchangeRatesDto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.newLine();
            writer.write(exchangeRatesDto.toString());
            System.out.println("Rates added successfully");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public ExchangeRatesDto loadRates(String date) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(date)) {
                    return rateService.parseRateFromString(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return null;
    }
}
