package com.kodilla.stream.world;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;
import stream.world.Continent;
import stream.world.Country;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        //List<Country> continents = new ArrayList<>();
        List<BigDecimal> euroazia = new ArrayList<>();
        List<BigDecimal> america = new ArrayList<>();
        List<BigDecimal> africa = new ArrayList<>();

        euroazia.add(new BigDecimal("65000055"));
        euroazia.add(new BigDecimal("45333289"));
        euroazia.add(new BigDecimal("80000333"));
        america.add(new BigDecimal("100395987"));
        america.add(new BigDecimal("102022058"));
        africa.add(new BigDecimal("15545558"));

        Stream<BigDecimal> worldStream = Stream.of(euroazia, america, america)
                .flatMap(Collection :: stream);
        List<BigDecimal> world = worldStream.collect(Collectors.toList());

        //When
        BigDecimal totalQuantityOfPeople = world.stream()
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        System.out.println(totalQuantityOfPeople);

        //Then
        BigDecimal expectedPeople = new BigDecimal("408 297 280");
        Assert.assertEquals(expectedPeople,totalQuantityOfPeople);




    }

}
