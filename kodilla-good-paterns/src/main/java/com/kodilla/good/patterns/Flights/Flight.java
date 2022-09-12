package com.kodilla.good.patterns.Flights;

public class Flight {

    private String flightFrom;
    private String flightTo;

    public Flight(String flightFrom, String flighTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flighTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightFrom != null ? !flightFrom.equals(flight.flightFrom) : flight.flightFrom != null) return false;
        return flightTo != null ? flightTo.equals(flight.flightTo) : flight.flightTo == null;
    }

    @Override
    public int hashCode() {
        int result = flightFrom != null ? flightFrom.hashCode() : 0;
        result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flighTo='" + flightTo + '\'' +
                '}';
    }
}
