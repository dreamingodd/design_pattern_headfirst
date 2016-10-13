package factory.product;

public class Coffee extends Beverage {
	String name;
	
	@Override
	public String desc() {
		return " coffee";
	}

	@Override
	public double cost() {
		return 10;
	}

	@Override
	public String getName() {
		return name == null ? super.getName() : name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		super.name = name;
	}

}
