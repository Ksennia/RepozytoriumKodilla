package com.kodilla.good.patterns.challenges.lakeair;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlyingRepository {
    private Map<String, String> airports;
    public final Map<String, String> flyingList(final Flying flying) {
        Map<String, String> airports = new HashMap<>();
        airports.put("Warsaw" , "Gdansk");
        airports.put("Gdansk", "Moskow");
        airports.put("Berlin", "Tokyo");
        airports.put("London", "Tenerife");
        airports.put("Kyiv", "Dnipro");
        airports.put("Dnipro", "London");
        airports.put("Dnipro", "Warsaw");
        airports.put("London", "Warsaw");

        return airports;
    }

    public Map<String, String> getAirports() {
        return airports;
    }
}
