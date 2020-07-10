package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder {
    @Override
    public BigDecimal theCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public String description() {
        return "Pizza with tomato-sos, cheese";
    }
}
