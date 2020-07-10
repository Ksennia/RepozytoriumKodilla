package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder basicPizza;

    protected AbstractPizzaOrderDecorator(PizzaOrder basicPizza) {
        this.basicPizza = basicPizza;
    }

    @Override
    public BigDecimal theCost() {
        return basicPizza.theCost();
    }

    @Override
    public String description() {
        return basicPizza.description();
    }
}
