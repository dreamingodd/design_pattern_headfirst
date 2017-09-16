package observer.subject;

import java.util.Observable;
import java.util.Observer;

import observer.entity.InvestmentOrder;
import observer.util.LevelUtil;

public class Accountant extends Observable implements Observer {

    public Accountant(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        @SuppressWarnings("unused")
        InvestmentOrder order = ((TradeDepartment) o).getOrder();
        LevelUtil.printLevel(arg);
        System.out.println(this.getClass().getSimpleName() + ": Accounting.");
        setChanged();
        notifyObservers((Integer) arg + 1);
    }

}
