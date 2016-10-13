package decorator.condiment;

import decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String desc() {
		return " macha" + beverage.desc();
	}

	@Override
	public double cost() {
		return beverage.cost() + 1;
	}
	
}
