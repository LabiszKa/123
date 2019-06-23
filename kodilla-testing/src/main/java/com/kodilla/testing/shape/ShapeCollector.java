package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> chooseShape = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        chooseShape.add(shape);
    }

    public void removeFigure(Shape shape) {
        chooseShape.remove(shape);
    }

    public Shape getFigure(int n) {
        if(n < 0 || n > chooseShape.size()) {
            return null;
        }
        return chooseShape.get(n);

    }

    public void showFigures() {

        for(Shape showShapes : chooseShape) {

            System.out.println(showShapes);
        }
    }

    public int shapeSize() {
        return chooseShape.size();
    }
}
