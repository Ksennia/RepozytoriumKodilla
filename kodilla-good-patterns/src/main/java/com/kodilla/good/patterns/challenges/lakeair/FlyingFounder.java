package com.kodilla.good.patterns.challenges.lakeair;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class FlyingFounder {
    public void findFly() {
        FlyingRepository flyingRepository = new FlyingRepository();
        HashMap<String, String> founder = (HashMap<String, String>) flyingRepository.getAirports();

        String poitDeparture = "London";
        String pointArrival = "Warsaw";
        String transfer;

        founder.entrySet().stream()
                .filter(e -> e.getKey().equals(pointArrival))
                .forEach(System.out ::println);

        founder.entrySet().stream()
                .filter(e -> e.getValue().equals(poitDeparture))
                .forEach(System.out :: println);


         }
}
