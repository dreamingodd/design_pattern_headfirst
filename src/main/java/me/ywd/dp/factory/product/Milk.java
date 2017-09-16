package factory.product;

import factory.product.Beverage;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        // �����໻�ˣ����ּ���
        this.name = beverage.name;
    }

    @Override
    public String desc() {
        return " milk" + beverage.desc();
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.5;
    }
}
