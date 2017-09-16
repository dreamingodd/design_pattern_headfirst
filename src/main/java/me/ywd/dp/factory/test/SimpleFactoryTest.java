package factory.test;

import factory.factory_simple.BeverageSimpleFactory;
import factory.product.Beverage;

/**
 * ºÚµ•π§≥ß≤‚ ‘
 * 
 * @author Dreamingodd
 *
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        BeverageSimpleFactory bsf = new BeverageSimpleFactory();
        Beverage cappuccino = bsf.create("cappuccino");
        Beverage mocha = bsf.create("mocha");
        cappuccino.setName("cappuccino");
        cappuccino.make("cappuccino");
        cappuccino.box("cappuccino");
        System.out.println(cappuccino.desc());
        System.out.println(mocha.desc());
    }
}
