package factory.abstract_factory;

import factory.abstract_factory.product.Coffee;
import factory.abstract_factory.product.Milk;
import factory.abstract_factory.product.SkimMilk;
import factory.abstract_factory.product.Xingbingle;

public class StarBuckFactory implements BeverageFactory {

    @Override
    public Coffee createCoffee() {
        return new Xingbingle();
    }

    @Override
    public Milk createMilk() {
        return new SkimMilk();
    }

}
