package iterator.entity;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Pancake House's breakfast menu
 * 
 * @author ywd
 * 
 */
public class PancakeMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public PancakeMenu() {
		menuItems = new ArrayList<MenuItem>();
	}

	public void addItem(MenuItem item) {
		menuItems.add(item);
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator<MenuItem> iterator() {
		// retired: 'cause ArrayList has implemented its own iterator
		// return new PancakeIterator(menuItems);
		return menuItems.iterator();
	}
}
