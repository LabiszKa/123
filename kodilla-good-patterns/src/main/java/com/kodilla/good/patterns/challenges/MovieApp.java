package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieApp {
    public static void main(String[]args){

        MovieStore movieStore = new MovieStore();
        String movie = movieStore.getMovies().values()
                .stream()
                .flatMap(m->m.stream())
                .collect(Collectors.joining("!"));

        System.out.println(movie);
    }
}