package com.kodilla.good.patterns.challenges.lakeair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FlyingFounder {
    private FlyingRepository flyingRepository = new FlyingRepository();

    public List<Flying> findFlyingFrom (String departure) {

        return flyingRepository.getAirports().stream()
                .filter(e -> e.getDepartureAiport().equals(departure))
                .collect(Collectors.toList());
    }

    public List<Flying> findFlyingTo ( String arrival) {
        return flyingRepository.getAirports().stream()
                .filter(e -> e.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
    }
    public List<Flying> findFlyingFromTo( String departure, String arrival) {

        List<Flying> listDeparture =  findFlyingFrom(departure);

        List<Flying> listTo = listDeparture.stream().flatMap(transfer ->  findFlyingFrom(transfer.getArrivalAirport()).stream()).filter(transfer -> transfer.getArrivalAirport().equals(arrival))
                .collect(Collectors.toSet()).stream().collect(Collectors.toList());
        List<Flying> listDepartureTo = Stream.concat(listDeparture.stream(), listTo.stream())
                .collect(Collectors.toList());
        return listDepartureTo;
         }

}
