package decorator.test;

import decorator.beverage.Beverage;
import decorator.beverage.Coffee;
import decorator.condiment.Milk;
import decorator.condiment.Mocha;

/**
 * 我写Beverage用的是接口，而不是抽象类
 * 
 * 
 * @author ywd
 *
 */
public class CoffeeTest {
	public static void main(String[] args) {
		Beverage coffee = new Coffee();
		
		coffee = new Milk(coffee);
		coffee = new Milk(coffee);
		coffee = new Mocha(coffee);
		
		System.out.println(coffee.desc() + ": " + coffee.cost());
	}
}
