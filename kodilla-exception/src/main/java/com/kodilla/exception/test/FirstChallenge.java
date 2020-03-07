package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        try {

            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e ) {
            System.out.println("Something went wrong " + e);
        } finally {
            System.out.println("Try again:)");
        }
        //8.3
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.showMustGoOn();

        //8.4
        Flight flight  = new Flight("Moskow", "Warsaw");
        flight = new Flight("Paris", "Berlin");
        flight = new Flight("Milan", "Malme");
        flight = new Flight("Malme", "Paris");
        flight = new Flight("Berlin", "Moskow");
        flight = new Flight("Milan", "Paris");
        flight = new Flight("Warsaw", "Singapur");
        flight = new Flight("Kiev", "London");
        FlingFounder flingFounder = new FlingFounder();
        flingFounder.findFlinght(flight);

    }

}
