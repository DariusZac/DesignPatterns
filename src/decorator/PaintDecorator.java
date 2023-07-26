package decorator;

import static java.text.MessageFormat.format;

public class PaintDecorator extends ShapeDecorator {

    private final String DESCRIPTION = "{0} painted with {1} color.";
    private Paint paint;

    public PaintDecorator(Shape shape, Paint paint) {
        super(shape);
        this.paint = paint;
        String newDescription = format(DESCRIPTION, getDescriptionOfShape(), this.paint);
        setDescriptionOfShape(newDescription);
    }

    private void setDescriptionOfShape(String newDescription) {
        descriptionOfShape = newDescription;
    }
}
