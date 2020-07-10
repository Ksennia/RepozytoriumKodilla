package com.kodilla.kodillapatterns2.taxiportal.pizza;

import com.kodilla.kodillapatterns2.decorator.pizza.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    PizzaOrder thePizza = new BasicPizza();
    @Test
    public void testPizzaWithMushroomsCost(){
        //Given
        thePizza = new MushroomsPizza(thePizza);
        //When
        BigDecimal theCost = thePizza.theCost();
        //Then
        assertEquals(new BigDecimal(17),theCost);
    }
    @Test
    public void testPizzaWithMushroomsDescription(){
        //Given
        thePizza = new MushroomsPizza(thePizza);
        //When
        String description = thePizza.description();
        //Then
        assertEquals("Pizza with tomato-sos, cheese, mushrooms",description);
    }
    @Test
    public void testPizzaWithnoItalianoCost(){
        //Given
        thePizza = new ChickenSuwitePizza( new NoItalianoPizza(thePizza));
        //When
        BigDecimal theCost = thePizza.theCost();
        //Then
        assertEquals(new BigDecimal(22),theCost);
    }
    @Test
    public void testPizzaWithnoItalianoDescription(){
        //Given
        thePizza = new ChickenSuwitePizza( new NoItalianoPizza(thePizza));
        //When
        String description = thePizza.description();
        //Then
        assertEquals("Pizza with tomato-sos, cheese, pineapple, chicken", description);
    }
    @Test
    public void testPizzaWithnoMegaCost(){
        //Given
        thePizza = new ChickenSuwitePizza(new ExtraCheesePizza(new MushroomsPizza(thePizza)));
        //When
        BigDecimal theCost = thePizza.theCost();
        //Then
        assertEquals(new BigDecimal(25),theCost);
    }
    @Test
    public void testPizzaWithnoMegaDescription(){
        //Given
        thePizza = new ChickenSuwitePizza(new ExtraCheesePizza(new MushroomsPizza(thePizza)));
        //When
        String description = thePizza.description();
        //Then
        assertEquals("Pizza with tomato-sos, cheese, mushrooms, extra cheese, chicken", description);}
}
