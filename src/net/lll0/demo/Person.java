package net.lll0.demo;

public class Person {

    {
        System.out.println("我是代码块");
    }

    static {
        System.out.println("我是静态代码块");
    }

    public Person() {
        System.out.println("我是构造方法");
    }
}
