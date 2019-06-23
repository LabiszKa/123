package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    int radius;
    double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
        }


    public int getRadius() {
        return radius;
    }



    @Override
    public String getShapeName() {

        return "Circle" ;

    }

    @Override
    public double getField() {

        return pi * getRadius();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return getRadius() == circle.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}