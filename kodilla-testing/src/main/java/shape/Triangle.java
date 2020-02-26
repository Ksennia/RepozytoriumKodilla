package shape;

public class Triangle implements Shape {
    int field;

    public String  getShapeName() {
        return "Triangle";
    }
    public int getField() {
        return  30;
    }
    public Triangle( int field) {
        this.field = getField();
    }
}
