package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlingFounder {
    Flight flight;
    private  Map<String, Boolean> flightFounder;

    public HashMap<String, Boolean> findFlinght(Flight flight) throws Exception {
        flightFounder = new HashMap<String, Boolean>();


        flight = new Flight("Moskow", "Warsaw");
        flight = new Flight("Paris", "Berlin");
        flight = new Flight("Milan", "Malme");
        flight = new Flight("Malme", "Paris");
        flight = new Flight("Berlin", "Moskow");
        flight = new Flight("Milan", "Paris");
        flight = new Flight("Warsaw", "Singapur");
        flight = new Flight("Kiev", "London");



        for(String flights: flight) {
            flights = flight.getArrivalAirport();
            flightFounder.put(flights, true);
        }

        if (flightFounder.containsValue(false)) {
            throw new Exception();
        }

        return flightFounder(getKey(), getValue());
    }
}
