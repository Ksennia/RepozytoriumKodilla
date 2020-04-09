package com.kodilla.good.patterns.challenges.foot2door;

public class DTO {
    public Producer producer;
    public int quantuty;

    public DTO(Producer producer, int amount) {
        this.producer = producer;
        this.quantuty = amount;
    }

    public Producer getProducer() {
        return producer;
    }

    public int getAmount(Product product) {
        quantuty = product.getQuantityOfProduct();
        return quantuty;
    }
}
