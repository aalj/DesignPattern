package net.lll0.responsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandler2的请求   " + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
