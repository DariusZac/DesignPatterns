package managment;

import chainOfResponsibility.Handler;
import chainOfResponsibility.OrderHandler;
import chainOfResponsibility.Request;
import chainOfResponsibility.ShopHandler;
import chainOfResponsibility.WarehouseHandler;
import decorator.Shape;
import validators.RequestValidator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static managment.PlankType.BLUE_PLANK;
import static managment.PlankType.PLAIN_PLANK;
import static managment.PlankType.YELLOW_PLANK;

//Singleton and Observer
public class Management {

    private static Management object = null;

    private static Map<PlankType, List<Observer>> waitingList;

    private Management() {
    }

    public static Management getInstance() {
        if (object == null) {
            object = new Management();
            instantiateOrders();
        }
        return object;
    }

    public void makeRequest(Customer customer, Shape order) {
        Request request = new Request();
        request.setCustomer(customer);
        //in this case there's only one shape for simplicity.
        if (order.getDescriptionOfShape().contains("rectangle") && order.getDescriptionOfShape().contains("BLUE")) {
            request.setPlankType(BLUE_PLANK);
        } else if (order.getDescriptionOfShape().contains("rectangle") && order.getDescriptionOfShape().contains("YELLOW")) {
            request.setPlankType(YELLOW_PLANK);
        } else {
            request.setPlankType(PLAIN_PLANK);
        }
        Handler requestHandler = new WarehouseHandler(new ShopHandler(new OrderHandler()));
        requestHandler.handleRequest(request);
    }

    public Map<PlankType, List<Observer>> getOrders() {
        return waitingList;
    }

    public void addToWaitingList(Request request) {
        PlankType plankType = request.getPlankType();
        Customer customer = request.getCustomer();
        List<Observer> observers = waitingList.get(plankType);
        observers.add(customer);
        waitingList.put(plankType, observers);
    }

    public void reservePlank(PlankType plankType) {
        System.out.println(plankType + " has been reserved.");
    }

    public void acceptOrder(List<PlankType> planks) {
        RequestValidator requestValidator = new RequestValidator();
        requestValidator.validateGetRequest();
        System.out.println("Updating db... Status: finished");
        updateCustomers(planks);
    }

    private void updateCustomers(List<PlankType> planks) {
        Map<PlankType, List<Observer>> orders = getOrders();
        planks.forEach(plankType -> {
            orders.get(plankType).forEach(Observer::update);
            orders.put(plankType, new ArrayList<>());
        });
    }


    private static void instantiateOrders() {
        waitingList = new HashMap<>();
        waitingList.put(PLAIN_PLANK, new ArrayList<>());
        waitingList.put(BLUE_PLANK, new ArrayList<>());
        waitingList.put(YELLOW_PLANK, new ArrayList<>());
    }
}
