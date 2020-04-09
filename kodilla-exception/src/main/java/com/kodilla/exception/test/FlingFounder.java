package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlingFounder {

        public boolean findFlinght(Flying flight) {
             Map<String, Boolean> airports  = new HashMap<String, Boolean>();
            airports.put("Moskow", true);
            airports.put("Berlin", true);
            airports.put("Warsaw", true);
            airports.put("Gdansk", false);

            if (airports.get(flight.getArrivalAirport()) == null ) {
                throw new RouteNotFoundException();
            }
            if (airports.get(flight.getDepartureAirport()) == null) {
                throw new RouteNotFoundException();
            }

            return airports.get(flight.getArrivalAirport());

    }
}
