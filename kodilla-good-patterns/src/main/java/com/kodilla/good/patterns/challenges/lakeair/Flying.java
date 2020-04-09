package com.kodilla.good.patterns.challenges.lakeair;

import java.util.Objects;

public class Flying {
    private String departureAiport;
    private String arrivalAirport;

    public Flying(String departureAiport, String arrivalAirport) {
        this.departureAiport = departureAiport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAiport() {
        return departureAiport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setDepartureAiport(String departureAiport) {
        this.departureAiport = departureAiport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
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
}
