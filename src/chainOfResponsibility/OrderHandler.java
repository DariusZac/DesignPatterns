package chainOfResponsibility;

import managment.Management;

public class OrderHandler extends Handler {

    public OrderHandler() {
    }

    public OrderHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println(request.getPlankType() + " out of stock.");
        System.out.println("Creating order for: " + request.getPlankType() + "\n");
        Management management = Management.getInstance();
        management.addToWaitingList(request);
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
