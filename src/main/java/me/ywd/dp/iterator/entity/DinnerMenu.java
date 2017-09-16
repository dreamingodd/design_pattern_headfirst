package iterator.entity;

import iterator.it.DinnerIterator;

import java.util.Iterator;

public class DinnerMenu implements Menu {
	static final int MAX_ITEMS = 10;
	public int numberOfItems = 0;
	MenuItem[] menuItems;
	
	int position = 0;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
	}
	
	public void addItem(MenuItem item) {
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Menu is full!");
		} else {
			menuItems[numberOfItems] = item;
			numberOfItems++;
		}
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	@Override
    public Iterator<MenuItem> iterator() {
	    return new DinnerIterator(menuItems);
    }
}
