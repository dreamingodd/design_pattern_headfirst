package adapter.enum_iter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * ��ArrayList֧��ö�ٵķ�����ʵ�ֵ���Iterator������
 *
 * @author Dreamingodd
 *
 */
public class ArrayListTest {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Enumeration ie = new IterableEnumeration(list);

        while (ie.hasMoreElements()) {
            System.out.println(ie.nextElement());
        }
    }
}
