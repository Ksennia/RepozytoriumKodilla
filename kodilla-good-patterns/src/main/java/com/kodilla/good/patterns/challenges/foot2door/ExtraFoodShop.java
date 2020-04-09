package com.kodilla.good.patterns.challenges.foot2door;

public class ExtraFoodShop implements Producer {
    String name ;
    public ExtraFoodShop(String name) {
        this.name = name;
    }

    @Override
    public String getName() {

        return name;
    }
}
