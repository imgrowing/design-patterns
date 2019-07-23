package ch07_adapter.enumadapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIterator implements Iterator {

    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(3);
        vector.add(5);
        EnumerationIterator it = new EnumerationIterator(vector.elements());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
