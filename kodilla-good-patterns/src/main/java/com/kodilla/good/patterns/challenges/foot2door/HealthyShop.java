package com.kodilla.good.patterns.challenges.foot2door;

public class HealthyShop implements Producer{
    String name ;
    public HealthyShop(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
