package decorator;

public class Rectangle implements Shape {

    private String descriptionOfShape = "The rectangle plank of wood";

    public Rectangle() {

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
