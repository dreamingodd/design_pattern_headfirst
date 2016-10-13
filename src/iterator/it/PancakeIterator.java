package iterator.it;

import iterator.entity.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class has been retired 'cause ArrayList has implemented its own Iterator
 * 
 * @author ywd
 *
 */
public class PancakeIterator implements Iterator<MenuItem> {

	int position = 0;
	private ArrayList<MenuItem> menuItems;

	public PancakeIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
    public boolean hasNext() {
		if (position < menuItems.size()) {
			return true;
		}
	    return false;
    }

	@Override
    public MenuItem next() {
		if (hasNext()) {
			return menuItems.get(position++);
		} else {
			return null;
		}
    }

	@Override
    public void remove() {
	    menuItems.remove(menuItems.size() - 1);
    }

}
