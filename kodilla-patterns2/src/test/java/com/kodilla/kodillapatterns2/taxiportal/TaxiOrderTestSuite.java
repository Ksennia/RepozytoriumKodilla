package com.kodilla.kodillapatterns2.taxiportal;

import com.kodilla.kodillapatterns2.decorator.taxiportal.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiOrderTestSuite {
    TaxiOrder theOrder = new BasicTaxiOrder();
    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given

        //Wen
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5.00), calculatedCost);

    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given

        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Drive a course", description);
    }
    @Test
    public void testTaxiNetworkGetCost() {
        //Given

        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        String decription = theOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network",decription);

    }
    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(37), theCost);

    }
    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat", description);

    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(52), theCost);

    }
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }
}
