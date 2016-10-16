package factory.abstract_factory;

import factory.abstract_factory.product.BlackCoffee;
import factory.abstract_factory.product.Coffee;
import factory.abstract_factory.product.Milk;
import factory.abstract_factory.product.PureMilk;

public class HeilongtangFactory implements BeverageFactory {

    @Override
    public Coffee createCoffee() {
        return new BlackCoffee();
    }

    @Override
    public Milk createMilk() {
        return new PureMilk();
    }

}
