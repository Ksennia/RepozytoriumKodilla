package com.kodilla.exception.test;

import java.util.Objects;

public class Flying {
    private String departureAirport;
    private String arrivalAirport;

    public Flying(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        Flying flight = (Flying) o;
        return Objects.equals(getArrivalAirport(), flight.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArrivalAirport());
    }
}
