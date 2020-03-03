package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    SecondChallenge secondChallenge = new SecondChallenge();

    public void showMustGoOn () {
        try {
            String res = secondChallenge.probablyIWillException(2.5, 1.5);
        } catch (Exception e) {
            System.out.println("We have a problem " + e);
        }
    }

}
