package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given

        Continent europe  = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();

        Country Poland = new Country(new BigDecimal("11111"), "Poland");
        Country Germany = new Country(new BigDecimal("22222"), "Germany");
        Country Slovakia = new Country(new BigDecimal("33333"),"Slovakia");
        Country China = new Country(new BigDecimal("44444"), "China");
        Country Japan = new Country(new BigDecimal("55555"), "Japan");
        Country Pakistan = new Country(new BigDecimal("66666"),"Pakistan");
        Country Uganda = new Country(new BigDecimal("77777"), "Uganda");
        Country Zimbabwe = new Country(new BigDecimal("88888"), "Zimbabwe");


        europe.addCountry(Slovakia);
        europe.addCountry(Poland);
        europe.addCountry(Germany);

        asia.addCountry(China);
        asia.addCountry(Japan);
        asia.addCountry(Pakistan);

        africa.addCountry(Uganda);
        africa.addCountry(Zimbabwe);

        World world = new World();
        world.addContinents(europe);
        world.addContinents(africa);
        world.addContinents(asia);


        //When
        BigDecimal peopleTotal = new BigDecimal("399996");

        //Then

        Assert.assertEquals(peopleTotal, world.getPeopleQuantity());
    }
}