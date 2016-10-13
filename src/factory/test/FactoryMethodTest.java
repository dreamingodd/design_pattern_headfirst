package factory.test;

import factory.factory_method.BetaShop;
import factory.factory_method.BeverageStore;
import factory.factory_method.StarBuckShop;
import factory.product.Beverage;

/**
 * ������������
 * 
 * @author ywd
 * 
 */
public class FactoryMethodTest {
	public static void main(String[] args) {
		BeverageStore beta = new BetaShop();
		BeverageStore starbuck = new StarBuckShop();

		// ���õģ�nameһֱnull���������������ô�̳а�, SB��
		Beverage coffee1 = beta.order("cappuccino");
		Beverage coffee2 = starbuck.order("cappuccino");
		System.out.println(coffee1.desc());
		System.out.println(coffee2.desc());
	}
}
