package stream.world;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static jdk.nashorn.internal.objects.NativeArray.reduce;

public final class World {
    private final List<Continent> continents = new LinkedList<>();

    public BigDecimal getTotalPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getContinents().stream())
                .map(Country :: getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
