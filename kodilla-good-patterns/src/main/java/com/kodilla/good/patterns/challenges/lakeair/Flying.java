package com.kodilla.good.patterns.challenges.lakeair;

import java.util.Objects;

public class Flying {
    private final String departureAiport;
    private final String arrivalAirport;

    public Flying(final String departureAiport, final String arrivalAirport) {
        this.departureAiport = departureAiport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAiport() {
        return departureAiport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        Flying flights = (Flying) o;
        return Objects.equals(getDepartureAiport(), flights.getDepartureAiport()) &&
                Objects.equals(getArrivalAirport(), flights.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAiport(), getArrivalAirport());
    }

    @Override
    public String toString() {
        return "Flying{" +
                "departureAiport='" + departureAiport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }
}
