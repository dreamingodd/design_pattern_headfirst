package composite.entity;

import java.util.Iterator;

import composite.component.MenuComponent;

public class MenuItem extends MenuComponent {

	String name;
	String desc;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String desc, boolean vegetarian, double price) {
		this.name = name;
		this.desc = desc;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public MenuItem(String name) {
		this.name = name;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", desc=" + desc + ", vegetarian="
		        + vegetarian + ", price=" + price + "]";
	}

}
