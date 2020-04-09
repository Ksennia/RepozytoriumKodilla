package com.kodilla.good.patterns.challenges.foot2door;

public class ProducerRequest {
    public Producer producer;
    public Product product;
    public ProducerRequest(Producer producer, Product product) {
        this.producer = producer;
        this.product = product;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }
}
