package com.kodilla.testing.shape;

import java.util.Objects;

public class Square  implements Shape{

    int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getShapeName() {

        return "square";

    }

    @Override
    public double getField() {

        return side * side;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return getSide() == square.getSide();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide());
    }
}

