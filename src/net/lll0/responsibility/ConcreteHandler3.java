package net.lll0.responsibility;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("ConcreteHandler3 的请求   " + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
