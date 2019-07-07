package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(BigDecimal peopleQuantity, String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "peopleQuantity=" + peopleQuantity +
                ", countryName='" + countryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(getPeopleQuantity(), country.getPeopleQuantity()) &&
                Objects.equals(getCountryName(), country.getCountryName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPeopleQuantity(), getCountryName());
    }
}