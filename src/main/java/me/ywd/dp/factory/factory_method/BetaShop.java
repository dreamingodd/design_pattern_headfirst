package factory.factory_method;

import factory.product.Beverage;
import factory.product.Coffee;
import factory.product.Milk;

public class BetaShop extends BeverageStore {

    @Override
    protected Beverage create(String type) {
        Beverage coffee = new Coffee();
        coffee.setName("BetaCoffee");
        if ("cappuccino".equals(type)) {
            // 贝塔很便宜，加一份牛奶
            coffee = new Milk(coffee);
        }
        return coffee;
    }

}
