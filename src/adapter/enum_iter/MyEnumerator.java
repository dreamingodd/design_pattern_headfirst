package adapter.enum_iter;

import java.util.Enumeration;

/**
 * This is my Enumeration Implementation
 * 
 * @author ywd
 *
 */
@SuppressWarnings("rawtypes")
public class MyEnumerator implements Enumeration {

    int count;
    int length;
    Object[] objArray;

    public MyEnumerator(int count, int length, Object[] objArray) {
        super();
        this.count = count;
        this.length = length;
        this.objArray = objArray;
    }

    @Override
    public boolean hasMoreElements() {
        return count < length;
    }

    @Override
    public Object nextElement() {
        return objArray[count++];
    }

}
