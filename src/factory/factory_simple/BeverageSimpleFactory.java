package factory.factory_simple;

import factory.product.Beverage;
import factory.product.Coffee;
import factory.product.Milk;
import factory.product.Mocha;


/**
 * �򵥹��������������ȡ����������µĲ�Ʒ���;���Ҫ����������µĴ��룬
 * ���ܿƽ�����spring�����÷������ɲ�Ʒ�����������ƹ��������ֱ�Ӹ��ġ�
 * ��...�����һ���֪����ô˵...
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
