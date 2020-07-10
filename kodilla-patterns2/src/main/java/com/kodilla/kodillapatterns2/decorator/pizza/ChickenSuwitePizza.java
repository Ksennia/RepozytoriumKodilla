package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenSuwitePizza extends  AbstractPizzaOrderDecorator {
    public ChickenSuwitePizza(PizzaOrder basicPizza) {
        super(basicPizza);
    }

    @Override
    public BigDecimal theCost() {
        return super.theCost().add(new BigDecimal(5));
    }

    @Override
    public String description() {
        return super.description() + ", chicken";
    }
}
