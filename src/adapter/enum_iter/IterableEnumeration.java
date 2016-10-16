package adapter.enum_iter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * ������Ҫ��Iterable , ����Iterator
 * 
 * @author Dreamingodd
 *
 */
@SuppressWarnings("rawtypes")
public class IterableEnumeration implements Enumeration {

    private Iterator it;

    public IterableEnumeration(Iterable it) {
        this.it = it.iterator();
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public Object nextElement() {
        return it.next();
    }

    public void remove() {
        it.remove();
    }

}
