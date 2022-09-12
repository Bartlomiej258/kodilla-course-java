package com.kodilla.good.patterns.Flights;

import java.util.HashSet;
import java.util.Set;

public class DataBase {

    private final static Set<Flight> flightSet = new HashSet<>();

    static {
        flightSet.add(new Flight("WRO", "RZE"));
        flightSet.add(new Flight("GDA", "WAW"));
        flightSet.add(new Flight("WRO", "KRA"));
        flightSet.add(new Flight("KAT", "POZ"));
        flightSet.add(new Flight("WRO", "KRA"));
        flightSet.add(new Flight("WAW", "KAT"));
        flightSet.add(new Flight("WRO", "GDA"));
    }

    public static Set<Flight> flightSetCopy() {
        return new HashSet<>(flightSet);
    }
}
