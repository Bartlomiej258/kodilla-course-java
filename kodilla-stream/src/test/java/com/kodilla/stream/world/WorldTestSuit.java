package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuit {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country Poland = new Country(new BigDecimal("38000000"));
        Country Germany = new Country(new BigDecimal("83000000"));
        Country Spain = new Country(new BigDecimal("47000000"));

        Continent europa = new Continent();
        europa.addCountry(Poland);
        europa.addCountry(Germany);
        europa.addCountry(Spain);

        World world = new World();
        world.addContinent(europa);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("168000000");
        Assertions.assertEquals(expected, totalPeople);
    }
}
