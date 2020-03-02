package stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> countries = new ArrayList<>();

    public void addCountry(final Country country) {
        countries.add(country);
    }
    public List<Country> getContinents() {
        return new ArrayList<>(countries);
    }
}


