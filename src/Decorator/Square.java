package Decorator;

public class Square implements Shape {

    private String descriptionOfShape;

    public Square() {
        descriptionOfShape = "The square";
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
