package Decorator;

import static java.text.MessageFormat.format;

public class ColorDecorator extends ShapeDecorator {

    private final String DESCRIPTION = "{0} filled with {1} color";
    private Color color;

    public ColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
        String newDescription = format(DESCRIPTION, getDescriptionOfShape(), this.color);
        setDescriptionOfShape(newDescription);
    }

    public String getDescriptionOfShape() {
        return descriptionOfShape;
    }

    public void setDescriptionOfShape(String descriptionOfShape) {
        this.descriptionOfShape = descriptionOfShape;
    }

    @Override
    public void printDescription() {
        System.out.println(descriptionOfShape);
    }
}
