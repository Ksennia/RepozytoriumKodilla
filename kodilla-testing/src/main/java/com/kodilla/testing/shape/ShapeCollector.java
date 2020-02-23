package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;
       private int n;


    public  ShapeCollector() {
        this.shape = shape;
    }

    public int addFigure(Shape shape) {
        ShapeCollector theCirkle = new ShapeCollector();
        ArrayList<Shape> figure = new ArrayList<Shape>();
        figure.add((Shape) theCirkle);
        return figure.size();

    }

    public boolean removeFigure(Shape shape) {
        ShapeCollector theCirkle = new ShapeCollector();
        ArrayList<Shape> figure = new ArrayList<Shape>();
        figure.remove(theCirkle);
        return figure.size();
    }

    public int getFigure() {
        return shape.getField();
    }

    public String showFigure() {
        return shape.getShapeName();

    }


}
