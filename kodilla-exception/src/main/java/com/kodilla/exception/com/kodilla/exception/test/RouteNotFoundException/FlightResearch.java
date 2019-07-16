package com.kodilla.exception.com.kodilla.exception.test.RouteNotFoundException;

public class FlightResearch {
    public static void main(String[]args){

        Flight flight1 = new Flight("Mexico", "Wrocłąw");
        Flight flight2 = new Flight("Radom", "Buenos Aires");

        FlightSearch flightFinding = new FlightSearch();
        try {
            flightFinding.findFlight(flight2);
        } catch (RouteNotFoundException e) {

            System.out.println("Please find another destination " +e);
        }
    }
}
