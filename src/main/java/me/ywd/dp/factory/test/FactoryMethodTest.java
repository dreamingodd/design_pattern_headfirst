package factory.test;

import factory.factory_method.BetaShop;
import factory.factory_method.BeverageStore;
import factory.factory_method.StarBuckShop;
import factory.product.Beverage;

/**
 * 工厂方法测试
 * 
 * @author Dreamingodd
 * 
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        BeverageStore beta = new BetaShop();
        BeverageStore starbuck = new StarBuckShop();

        // 子类父类的属性一样
        Beverage coffee1 = beta.order("cappuccino");
        Beverage coffee2 = starbuck.order("cappuccino");
        System.out.println(coffee1.desc());
        System.out.println(coffee2.desc());
    }
}
