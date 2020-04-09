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
        Flying flight  = new Flying("Moskow", "Warsaw");
        flight = new Flying("Paris", "Berlin");
        flight = new Flying("Milan", "Malme");
        flight = new Flying("Malme", "Paris");
        flight = new Flying("Berlin", "Moskow");
        flight = new Flying("Milan", "Paris");
        flight = new Flying("Warsaw", "Singapur");
        flight = new Flying("Kiev", "London");
        FlingFounder flingFounder = new FlingFounder();
        flingFounder.findFlinght(flight);

    }

}
