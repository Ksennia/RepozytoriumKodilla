package com.kodilla.good.patterns.main;

import com.kodilla.good.patterns.challenges.*;
import com.kodilla.good.patterns.challenges.foot2door.*;
import com.kodilla.good.patterns.challenges.lakeair.*;

import java.util.ArrayList;
import java.util.List;


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

        ProducerRequestRetrieve producerRequestRetrieve = new ProducerRequestRetrieve();
        ProducerRequest producerRequest = producerRequestRetrieve.retrieveNewOrder();
        Processor processor = new Processor( new SendigFacture(), new ProductPurchaseService());
        processor.process(producerRequest);

       FlyingFounder flyingFounder = new FlyingFounder();
        List<Flying> listFrom =   flyingFounder.findFlyingFrom("London");
        List<Flying> listTo = flyingFounder.findFlyingTo("Warsaw");
        List<Flying> listFromTo = flyingFounder.findFlyingFromTo("Kyiv", "Warsaw");

        System.out.println(listFrom);
        System.out.println(listTo);
        System.out.println(listFromTo);
    }
}
