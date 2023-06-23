package Decorator;

public class Circle implements Shape {

    private String descriptionOfShape;

    public Circle() {
        descriptionOfShape = "The circle";
    }

    @Override
    public String getDescription() {
        return descriptionOfShape;
    }

    @Override
    public void printDescription() {
        System.out.println(descriptionOfShape);
    }

    public String getDescriptionOfShape() {
        return descriptionOfShape;
    }

    public void setDescriptionOfShape(String descriptionOfShape) {
        this.descriptionOfShape = descriptionOfShape;
    }
}
