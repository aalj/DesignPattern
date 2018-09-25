package net.lll0.responsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        int[] request = {2, 4, 6, 24, 3, 10, 13, 25};
        for (int i : request) {
            handler1.handlerRequest(i);
        }
    }
}
