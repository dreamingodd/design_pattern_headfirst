package observer.subject;

import java.util.Observable;
import java.util.Observer;

import observer.entity.InvestmentProduct;
import observer.entity.InvestmentStrategy;
import observer.util.LevelUtil;

public class InvestmentDepartment extends Observable implements Observer {

    private InvestmentProduct product = new InvestmentProduct();

    public InvestmentDepartment(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        @SuppressWarnings("unused")
        InvestmentStrategy strategy = ((InvestmentCommittee) o).getStrategy();
        int level = (Integer) arg;
        LevelUtil.printLevel(level);
        System.out.println(this.getClass().getSimpleName()
                + ": Convert strategy to product.");
        setChanged();
        notifyObservers(level + 1);
    }

    public InvestmentProduct getProduct() {
        return product;
    }

}
