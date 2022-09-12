package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.kodilla.good.patterns.Flights.DataBase.flightSetCopy;

public class FlightService {

    List<Flight> findAllFrom(String from) {
        return flightSetCopy().stream()
                .filter(flight -> flight.getFlightFrom().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flight> findAllTo(String to) {
        return flightSetCopy().stream()
                .filter(flight -> flight.getFlightTo().equals(to))
                .collect(Collectors.toList());
    }

    public List<List<Flight>> via (String from, String to) {
        List<Flight> flightFrom = findAllFrom(from);

        List<Flight> flightsTo = findAllTo(to);

        List<List<Flight>> flights = new ArrayList<>();

        flightFrom.stream()
                .filter(flight -> flightsTo.contains(new Flight(flight.getFlightTo(), to)))
                .forEach(flight -> {
                    List<Flight> connection = new ArrayList<>();
                    connection.add(flight);
                    connection.add(new Flight(flight.getFlightTo(), to));

                    String via = flight.getFlightTo();
                    System.out.println("Fly from: " + from + " To: " + to + " via " + via);
                    flights.add(connection);
                });
        return flights;
    }
}
