package factory.abstract_factory;

import factory.abstract_factory.product.Coffee;
import factory.abstract_factory.product.Milk;

public interface BeverageFactory {
    Coffee createCoffee();
    Milk createMilk();
}
