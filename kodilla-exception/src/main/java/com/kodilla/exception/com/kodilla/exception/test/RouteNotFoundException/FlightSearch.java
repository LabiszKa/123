package com.kodilla.exception.com.kodilla.exception.test.RouteNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    Flight flight;

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightSearch = new HashMap<String, Boolean>();

        flightSearch.put("Wrocław", true);
        flightSearch.put("Warszawa", true);
        flightSearch.put("Kopenhaga", false);

        Boolean possibleFlight = flightSearch.containsKey(flight.getArrivalAirport());

        if(!possibleFlight) {
            throw new RouteNotFoundException ("please change your destination");
        } else {
            System.out.println("Seat back, relax and enjoy your flight to " + flight.arrivalAirport);
        }
    }
}
