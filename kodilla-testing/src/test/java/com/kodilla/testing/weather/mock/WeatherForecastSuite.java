package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;


import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void beforeTest() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        // Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        // When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        // Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testsCalculateAverageTemperatureWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateAverageTemperatures();

        //Then
        Assertions.assertEquals(25.56, result);
    }

    @Test
    void testsCalculateMedianOfTemperatures() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateMedianOfTemperatures();

        //Then
        Assertions.assertEquals(25.5, result);
    }
}
