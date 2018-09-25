package net.lll0.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
    private List<Object> items  = new ArrayList<>();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    public int count(){
       return items.size();
    }

}
