package net.lll0.iterator;

public class ConcreteIterator extends Iterator {
    private ConcreteAggregate concreteAggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
