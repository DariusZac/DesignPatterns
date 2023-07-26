package chainOfResponsibility;

import managment.Customer;
import managment.PlankType;

public class Request {

    private Customer customer;
    private PlankType plankType;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public PlankType getPlankType() {
        return plankType;
    }

    public void setPlankType(PlankType plankType) {
        this.plankType = plankType;
    }
}
