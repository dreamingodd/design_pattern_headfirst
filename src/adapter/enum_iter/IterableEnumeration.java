package adapter.enum_iter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * ������Ҫ��Iterable , ����Iterator
 * 
 * @author ywd
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
	
	
}
