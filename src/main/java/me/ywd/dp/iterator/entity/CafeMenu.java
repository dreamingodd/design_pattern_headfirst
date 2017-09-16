package iterator.entity;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Iterable<MenuItem> {
	Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

	public void addItem(MenuItem item) {
		menuItems.put(item.getName(), item);
	}

	public Hashtable<String, MenuItem> getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator<MenuItem> iterator() {
		return menuItems.values().iterator();
	}

}
