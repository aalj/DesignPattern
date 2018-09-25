package net.lll0.bridge;

public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
