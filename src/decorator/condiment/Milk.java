package decorator.condiment;

import decorator.beverage.Beverage;

public class Milk extends CondimentDecorator {

	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String desc() {
		return " milk" + beverage.desc();
	}

	@Override
	public double cost() {
		return beverage.cost() + 2.5;
	}

}
