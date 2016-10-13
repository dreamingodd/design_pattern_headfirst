package factory.factory_simple;

import factory.product.Beverage;
import factory.product.Coffee;
import factory.product.Milk;
import factory.product.Mocha;


/**
 * 简单工厂将建造过程提取出来，添加新的产品类型就需要在这里添加新的代码，
 * 而曹科借用了spring的配置反射生成产品，避免了类似工厂代码的直接更改。
 * 但...现在我还不知道怎么说...
 * 
 * @author ywd
 *
 */
public class BeverageSimpleFactory {
	public Beverage create(String type) {
		Beverage coffee = new Coffee();
		if ("cappuccino".equals(type)) {
			coffee = new Milk(coffee);
			coffee = new Milk(coffee);
		} else if ("mocha".equals(type)) {
			coffee = new Mocha(coffee);
		}
		return coffee;
	}
}
