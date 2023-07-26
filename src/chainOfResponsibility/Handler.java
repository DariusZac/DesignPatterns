package chainOfResponsibility;

public abstract class Handler {

    protected Handler successor;

    public Handler() {
        this.successor = null;
    }

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
