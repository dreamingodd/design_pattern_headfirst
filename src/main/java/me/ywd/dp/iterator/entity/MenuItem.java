package iterator.entity;

public class MenuItem {
	String name;
	String desc;
	boolean vegetarian;
	double price;
	
	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", desc=" + desc + ", vegetarian="
				+ vegetarian + ", price=" + price + "]";
	}
	

	public MenuItem(String name, String desc, boolean vegetarian, double price) {
		this.name = name;
		this.desc = desc;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public MenuItem (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
