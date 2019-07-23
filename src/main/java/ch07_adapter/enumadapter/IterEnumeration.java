package ch07_adapter.enumadapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IterEnumeration implements Enumeration {
    private Iterator iterator;

    public IterEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        IterEnumeration itEn = new IterEnumeration(list.iterator());
        while (itEn.hasMoreElements()) {
            System.out.println(itEn.nextElement());
        }
    }
}
