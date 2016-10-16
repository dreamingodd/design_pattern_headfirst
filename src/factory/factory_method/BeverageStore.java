package factory.factory_method;

import factory.product.Beverage;

/**
 * ��ŵ���˼�ǽ�������Ҳ�����ˣ�Ҳ���ǽ�ʵ���Ƴٵ��������˼
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
