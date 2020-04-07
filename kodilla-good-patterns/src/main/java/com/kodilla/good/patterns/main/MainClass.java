package com.kodilla.good.patterns.main;

import com.kodilla.good.patterns.challenges.*;




public class MainClass {
    public static void main ( String[] args) {
        MovieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(entry -> entry + "!")
                .forEach(System.out :: print);

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);

    }
}
