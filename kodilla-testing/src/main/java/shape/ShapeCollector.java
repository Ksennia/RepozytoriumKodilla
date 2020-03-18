package shape;

import java.util.List;

public class ShapeCollector {
    Shape shape;
    List<Shape> shapeList;
    public int addFigure(Shape shape){
        shapeList.add(new Cirkle());
        return shapeList.size();
    }

    public boolean removeFigure(Shape shape){
        shapeList.remove(new Square());
        return true;
    }
    public int getFigure(int n){
        shape = new Cirkle();
        return shape.getField();
    }
    public String  showFigure(String shapeName){
        shape = new Triangle();
        return shape.getShapeName();
    }

}