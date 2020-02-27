package stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public final class World {
    private final List<Continent> world;

    public List<BigDecimal> getTotalPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.addCountry().stream())
                .mapToLong(Country :: getPeopleQuantity())
                .collect(Collectors.toSet())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
