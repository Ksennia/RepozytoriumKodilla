package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> res = oddNumbersExterminator.exterminate(new ArrayList<Integer>());
        System.out.println("Test Empty list ");
        //then
        Assert.assertEquals(null, res);
    }
    @Test
    public void testOddNumberExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> res = oddNumbersExterminator.exterminate(new ArrayList<Integer>());
        //then
        Assert.assertEquals(new int[1]{2},res);

    }

}
