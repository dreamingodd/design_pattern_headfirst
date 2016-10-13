package adapter.enum_iter;

import java.util.ArrayList;
import java.util.List;



public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);
		
		IterableEnumeration ie = new IterableEnumeration(list);
		
		while (ie.hasMoreElements()) {
			System.out.println(ie.nextElement());
		}
	}
}
