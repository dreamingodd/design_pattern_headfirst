package iterator.it;

import iterator.entity.MenuItem;

import java.util.Iterator;

public class DinnerIterator implements Iterator<MenuItem> {

    int position = 0;
    MenuItem[] menuItems;

    public DinnerIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        // How foolish am I ?!!!!!!!
        if (position < menuItems.length && menuItems[position] != null) {
            return true;
        }
        return false;
    }

    @Override
    public MenuItem next() {
        if (hasNext()) {
            return menuItems[position++];
        } else {
            return null;
        }

    }

    @Override
    public void remove() {
        menuItems[menuItems.length - 1] = null;
    }

}
