package com.kodilla.exception.test;



public class RouteNotFoundException extends Exception {
    FlingFounder tryFlightFinder = new FlingFounder();

    public void getFlightFounder() {
        try {
            tryFlightFinder.flightFounder.get("Berlin");
        } catch (Exception e) {
            System.out.println("oops... " + e);

        } finally {
            System.out.println("Try anouther airport");
        }
    }
}

