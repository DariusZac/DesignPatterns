package chainOfResponsibility;

import managment.Management;
import managment.PlankType;
import utils.MockDb;

import java.util.List;

public class ShopHandler extends Handler {

    public ShopHandler() {
    }

    public ShopHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        MockDb mockDb = new MockDb();
        List<PlankType> planksInHall = mockDb.getPlankInShopHall();
        if (planksInHall.contains(request.getPlankType())) {
            System.out.println(request.getPlankType() + " is present in shop hall.");
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
