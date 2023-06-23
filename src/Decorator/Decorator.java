package Decorator;

import java.util.Random;

public class Decorator {
    public static void main(String[] args) {
        Shape square = new Square();
        square.printDescription();

        int randomColor = new Random().nextInt(Color.values().length);
        Shape redCircle = new ColorDecorator(new Circle(), Color.values()[randomColor]);
        redCircle.printDescription();

    }
}
