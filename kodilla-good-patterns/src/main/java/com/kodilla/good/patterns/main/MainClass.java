package com.kodilla.good.patterns.main;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.Arrays;


public class MainClass {
    public static void main ( String[] args) {
        MovieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(entry -> entry + "!")
                .forEach(System.out :: print);
    }
}
