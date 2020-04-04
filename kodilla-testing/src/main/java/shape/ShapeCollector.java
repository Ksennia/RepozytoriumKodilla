package shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    Shape shape;
    List<Shape> shapeList = new ArrayList<>();
    public int addFigure(Shape shape){
        shapeList.add(shape);
        return shapeList.size();
    }

    public boolean removeFigure(Shape shape){
        shapeList.remove(shape);
        return true;
    }
    public Shape getFigure(int n){
        return  shapeList.get(n);
    }
    public void  showFigure(){
        System.out.println(shapeList);
    }

}