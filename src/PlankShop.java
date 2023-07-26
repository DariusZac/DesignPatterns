import decorator.Paint;
import decorator.PaintDecorator;
import decorator.Rectangle;
import decorator.Shape;
import managment.Customer;
import managment.Management;
import managment.PlankType;

import java.util.List;

import static managment.PlankType.BLUE_PLANK;

public class PlankShop {

    public static void main(String[] args) {

        Management management = Management.getInstance();
        Customer dave = new Customer("Dave", "dave@mail.com");
        Shape daveOrder = new Rectangle();
        management.makeRequest(dave, daveOrder);

        Shape dave2ndOrder = new PaintDecorator(new Rectangle(), Paint.BLUE);
        management.makeRequest(dave, dave2ndOrder);

        Customer maria = new Customer("Maria", "maria@gmail.com");
        Shape mariaOrder = new PaintDecorator(new Rectangle(), Paint.BLUE);
        management.makeRequest(maria, mariaOrder);

        // for simplicity, we'll say that given list has enough planks of given type for all customer that have ordered them.
        List<PlankType> planksArrived = List.of(BLUE_PLANK);
        management.acceptOrder(planksArrived);
    }
}
