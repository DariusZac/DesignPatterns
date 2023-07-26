package decorator;

public class ShapeDecorator implements Shape {

    private Shape shape;
    protected String descriptionOfShape = "The rectangle plank of wood";

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String getDescriptionOfShape() {
        return descriptionOfShape;
    }

    @Override
    public void printDescriptionOfShape() {
        System.out.println(descriptionOfShape);
    }
}
