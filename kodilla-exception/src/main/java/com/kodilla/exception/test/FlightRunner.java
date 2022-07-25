package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightRunner {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Paris");
        Flight flight2 = new Flight("Berlin", "Moscow");
        FlightCheckingFlights flightCheckingFlights = new FlightCheckingFlights();

        try {
            flightCheckingFlights.findFlightAirport(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("we can not find this direction" + e);
        } finally {
            System.out.println("have a nice day!");
        }

        try {
            flightCheckingFlights.findFlightAirport(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("we can not find this direction" + e);
        } finally {
            System.out.println("have a nice day!");
        }

    }
}
