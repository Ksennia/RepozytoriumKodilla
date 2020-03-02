package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import stream.array.ArrayOperations;

import static stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverafe() {
        //Given
        int[] numbers = new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        // When
        OptionalDouble result = IntStream.range(0, numbers.length).average();

        //Then
        double expectedAverage = 10.0;
        Assert.assertEquals(expectedAverage, result);
    }
}
