package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent) {
        continents.add(continent);
    }
    public List<Continent> getContinentList() {
        return continents;
    }


    public final BigDecimal getPeopleQuantity() {

        BigDecimal peopleOfTheWorld = continents.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));
        return peopleOfTheWorld;
    }
}