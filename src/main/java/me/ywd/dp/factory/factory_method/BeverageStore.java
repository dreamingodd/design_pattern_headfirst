package factory.factory_method;

import factory.product.Beverage;

/**
 * 大概的意思是将创建者也抽象化了，也就是将实现推迟到子类的意思
 * 
 * @author ywd
 *
 */
public abstract class BeverageStore {

    Beverage beverage;

    public Beverage order(String type) {

        beverage = create(type);

        beverage.make(beverage.getName());
        beverage.box(beverage.getName());
        beverage.desc();

        return beverage;
    }

    protected abstract Beverage create(String type);
}
