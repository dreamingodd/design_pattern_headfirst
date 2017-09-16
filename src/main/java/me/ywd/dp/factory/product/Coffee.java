package factory.product;

public class Coffee extends Beverage {
    String name;

    @Override
    public String desc() {
        return " coffee";
    }

    @Override
    public double cost() {
        return 10;
    }

}
