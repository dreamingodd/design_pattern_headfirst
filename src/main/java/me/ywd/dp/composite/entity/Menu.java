package composite.entity;

import java.util.ArrayList;
import java.util.Iterator;

import composite.component.MenuComponent;

public class Menu extends MenuComponent {

	// pay attention: <MC>
	ArrayList<MenuComponent> menuItems = new ArrayList<MenuComponent>();
	String name;
	
	public Menu() {}

	public Menu(String name) {
		this.name = name;
	}

	/*************************************/
	public void add(MenuComponent mc) {
		menuItems.add(mc);
	}
	/*************************************/
	
	@Override
    public Iterator<MenuComponent> iterator() {
	    return menuItems.iterator();
    }

	@Override
    public String toString() {
		String itemStr = "";
		Iterator<MenuComponent> it = iterator();
		
		while (it.hasNext()) {
			itemStr += it.next().toString() + "\n";
		}
	    return "---------------------\n"
			+ name + "\n" + itemStr;
    }

}
