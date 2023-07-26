package chainOfResponsibility;

import managment.Management;
import managment.PlankType;
import utils.MockDb;

import java.util.List;

public class WarehouseHandler extends Handler {

    public WarehouseHandler() {
    }

    public WarehouseHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        MockDb mockDb = new MockDb();
        List<PlankType> planksInWarehouse = mockDb.getPlanksInWarehouse();
        if (planksInWarehouse.contains(request.getPlankType())) {
            System.out.println(request.getPlankType() + " is present in warehouse.");
            Management management = Management.getInstance();
            management.reservePlank(request.getPlankType());
            request.getCustomer().update();
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
