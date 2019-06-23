package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    int heigth;
    int side;

    public Triangle(int heigth, int side) {
        this.heigth = heigth;
        this.side = side;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getSide() {
        return side;
    }


    @Override
    public String getShapeName() {

        return "triangle";


    }

    @Override
    public double getField() {

        return 0.5 * side * heigth;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getHeigth() == triangle.getHeigth() &&
                getSide() == triangle.getSide();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeigth(), getSide());
    }
}

