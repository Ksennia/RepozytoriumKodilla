package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheesePizza extends AbstractPizzaOrderDecorator {
    public ExtraCheesePizza(PizzaOrder basicPizza) {
        super(basicPizza);
    }

    @Override
    public BigDecimal theCost() {
        return super.theCost().add(new BigDecimal(3));
    }

    @Override
    public String description() {
        return super.description() + ", extra cheese";
    }
}
