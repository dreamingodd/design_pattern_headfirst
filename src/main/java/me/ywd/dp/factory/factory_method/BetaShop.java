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
            // �����ܱ��ˣ���һ��ţ��
            coffee = new Milk(coffee);
        }
        return coffee;
    }

}
