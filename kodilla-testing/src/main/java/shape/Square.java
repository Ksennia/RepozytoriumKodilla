package shape;

public class Square  implements Shape {
    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public int getField() {
        return 40;
    }
}
