package shape;

import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;
    private int n;


    public  ShapeCollector() {
        this.shape = shape;
    }

    public int addFigure(Shape shape) {
        Shape theCirkle = new Cirkle(20);
        ArrayList<Shape> figure = new ArrayList<Shape>();
        figure.add((Shape) theCirkle);
        return figure.size();

    }

    public int removeFigure(Shape shape) {
        Shape theSquare = new Square(40);
        ArrayList<Shape> figure = new ArrayList<Shape>();
              return figure.size();
    }

    public int getFigure() {
        return shape.getField();
    }

    public String showFigure() {
        return shape.getShapeName();

    }


}