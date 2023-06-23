package Decorator;

public class ShapeDecorator implements Shape{

    private Shape shape;
    protected String descriptionOfShape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
        this.descriptionOfShape = shape.getDescription();
    }

    @Override
    public String getDescription() {
        return shape.getDescription();
    }

    @Override
    public void printDescription() {
        System.out.println(shape.getDescription());
    }
}
