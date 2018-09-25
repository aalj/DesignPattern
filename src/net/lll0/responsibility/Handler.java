package net.lll0.responsibility;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    public abstract void handlerRequest(int request);
}
