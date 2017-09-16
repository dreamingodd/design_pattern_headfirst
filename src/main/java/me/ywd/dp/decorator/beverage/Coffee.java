package decorator.beverage;

public class Coffee implements Beverage {

	@Override
	public String desc() {
		return " coffee";
	}

	@Override
	public double cost() {
		return 10;
	}

}
