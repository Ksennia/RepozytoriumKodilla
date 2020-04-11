package com.kodilla.good.patterns.challenges.foot2door;

public class GlutenFreeShop implements Producer {
    String name;

    public GlutenFreeShop(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
