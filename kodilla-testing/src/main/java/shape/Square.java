package shape;

public class Square  implements Shape {
    int field;
    @Override
    public String getShapeName() {
        return "Square";
    }
    @Override
    public int getField() {
        return  40;
    }
    public Square( int field) {
        this.field = getField();
    }
}
