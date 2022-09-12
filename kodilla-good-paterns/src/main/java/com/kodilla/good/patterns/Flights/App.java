package com.kodilla.good.patterns.Flights;

import java.util.List;

public class App {

    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        List<Flight> flight1 = flightService.findAllFrom("WRO");
        List<Flight> flight2 = flightService.findAllFrom("WAW");
        List<Flight> flight3 = flightService.findAllTo("WRO");
        List<List<Flight>> flight4 = flightService.via("GDA", "RZE");

        System.out.println(flight1);
        System.out.println(flight4);
    }
}
