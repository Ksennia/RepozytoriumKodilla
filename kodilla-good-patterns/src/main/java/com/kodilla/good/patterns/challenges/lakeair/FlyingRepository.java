package com.kodilla.good.patterns.challenges.lakeair;

import java.util.HashSet;
import java.util.Set;

public class FlyingRepository {
    private Set<Flying> airports = new HashSet<Flying>();

    public FlyingRepository() {
        putAirports();
    }

    public final void putAirports() {

        airports.add(new Flying("Warsaw" , "Gdansk"));
        airports.add(new Flying("Gdansk", "Moskow"));
        airports.add(new Flying("Berlin", "Tokyo"));
        airports.add(new Flying("London", "Tenerife"));
        airports.add(new Flying("Kyiv", "Dnipro"));
        airports.add(new Flying("Dnipro", "London"));
        airports.add(new Flying("Dnipro", "Warsaw"));
        airports.add(new Flying("London", "Warsaw"));


    }

    public Set<Flying> getAirports() {
        return airports;
    }
}
