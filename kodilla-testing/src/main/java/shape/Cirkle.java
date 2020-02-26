package shape;

public class Cirkle implements Shape {
    //String name;
    int field;
    @Override
    public String getShapeName() {
        return "Cirkle";
    }
    @Override
    public int getField() {
        return 20;
    }
    public Cirkle( int getField) {
        this.field = getField();
    }
}
