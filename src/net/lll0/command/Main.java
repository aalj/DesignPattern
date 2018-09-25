package net.lll0.command;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command= new ConcreteCommand(receiver);
        Invoker i = new Invoker();
        i.setCommand(command);
        i.executeCommand();
    }
}
