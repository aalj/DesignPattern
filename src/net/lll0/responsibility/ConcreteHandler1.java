package net.lll0.responsibility;


public class ConcreteHandler1 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandler1的请求  " + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
