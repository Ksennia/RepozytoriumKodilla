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
        Assert.assertEquals(new ArrayList<Integer>(), res);
    }
    @Test
    public void testOddNumberExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(6);
        newList.add(5);
        newList.add(7);
        newList.add(8);
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(6);
        expectedResult.add(8);
        //when
        ArrayList<Integer> res = oddNumbersExterminator.exterminate(newList);

        //then
        Assert.assertEquals(expectedResult,res);

    }

}
