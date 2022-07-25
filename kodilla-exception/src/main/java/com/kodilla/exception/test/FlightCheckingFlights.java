package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightCheckingFlights {

    public Map<String, Boolean> airportName() {
        HashMap<String, Boolean> flightchecker = new HashMap<>();
        flightchecker.put("Warsaw", true);
        flightchecker.put("Paris", true);
        flightchecker.put("Moscow", false);
        flightchecker.put("Washington", true);

        return flightchecker;
    }

    public void findFlightAirport(Flight flight) throws RouteNotFoundException {
        if (flight.getArrivalAirport().equals(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }

        if (airportName().containsKey(flight.getArrivalAirport()) && airportName().containsKey(flight.getDepartureAirport())
                && airportName().containsValue(true) && airportName().containsValue(true)) {
            System.out.println("You can fly to: " + flight.getArrivalAirport() + " from: " + flight.getDepartureAirport());
        } else
            System.out.println("Sorry you can not fly from: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport() +
                    "  " + RouteNotFoundException.class);
    }
}
