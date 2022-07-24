package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperatures() {

        double sum = 0;
        double quantityOfTemperaturs = temperatures.getTemperatures().size();
        double average;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        average = sum / quantityOfTemperaturs;

        return average;
    }

    public double calculateMedianOfTemperatures() {
        List<Double> doubleList = new ArrayList<>();
        double median = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            doubleList.add(temperature.getValue());
        }

        Collections.sort(doubleList);
        if (doubleList.size() % 2 == 0) {
            median = doubleList.get(doubleList.size() / 2 + doubleList.size() / 2 - 1);
        } else {
            median = doubleList.get(doubleList.size() / 2);
        }
        return median;
    }
}
