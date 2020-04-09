package com.kodilla.good.patterns.challenges.foot2door;

public class ProducerRequestRetrieve {
    public ProducerRequest retrieveNewOrder() {
        Producer producer = new ExtraFoodShop("extraFoodShop");
        Product product = new Product("Tomato 2kg", 1000);

        return new ProducerRequest(producer, product);
    }
}
