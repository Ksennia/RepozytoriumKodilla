package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class NoItalianoPizza extends  AbstractPizzaOrderDecorator{
    public NoItalianoPizza(PizzaOrder basicPizza) {
        super(basicPizza);
    }

    @Override
    public BigDecimal theCost() {
        return super.theCost().add(new BigDecimal(2));
    }

    @Override
    public String description() {
        return super.description() + ", pineapple";
    }
}
