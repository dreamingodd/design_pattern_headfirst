package factory.test;

import factory.abstract_factory.BeverageFactory;
import factory.abstract_factory.HeilongtangFactory;
import factory.abstract_factory.StarBuckFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        BeverageFactory sbf = new StarBuckFactory();
        BeverageFactory hbf = new HeilongtangFactory();
        sbf.createCoffee();
        hbf.createCoffee();
        sbf.createMilk();
        hbf.createMilk();
    }
}
