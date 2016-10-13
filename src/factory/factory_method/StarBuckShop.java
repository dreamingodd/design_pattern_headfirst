package factory.factory_method;

import factory.product.Beverage;
import factory.product.Coffee;
import factory.product.Milk;

public class StarBuckShop extends BeverageStore {

	@Override
	protected Beverage create(String type) {
		Beverage coffee = new Coffee();
		coffee.setName("StarBuckCoffee");
		if ("cappuccino".equals(type)) {
			// 星巴克比较厚道，加很多牛奶
			coffee = new Milk(coffee);
			coffee = new Milk(coffee);
			coffee = new Milk(coffee);
		}
		return coffee;
	}

}
