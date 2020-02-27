package stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> continents = new ArrayList<>();

    public void addCountry(Country country) {
        continents.add(country);
    }
}


