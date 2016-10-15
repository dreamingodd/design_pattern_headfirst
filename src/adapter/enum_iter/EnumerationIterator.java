package adapter.enum_iter;

import java.util.Enumeration;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class EnumerationIterator implements Iterable {

    Enumeration enumA;

    public EnumerationIterator(Enumeration enumB) {
        enumA = enumB;
    }

    public boolean hasNext() {
        return enumA.hasMoreElements();
    }

    public Object next() {
        return enumA.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}
