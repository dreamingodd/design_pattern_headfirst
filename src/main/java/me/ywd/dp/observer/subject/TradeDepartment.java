package observer.subject;

import java.util.Observable;
import java.util.Observer;

import observer.entity.InvestmentCommand;
import observer.entity.InvestmentOrder;
import observer.util.LevelUtil;

public class TradeDepartment extends Observable implements Observer {

    private InvestmentOrder order = new InvestmentOrder();

    public TradeDepartment(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        @SuppressWarnings("unused")
        InvestmentCommand command = ((FundManager) o).getCommand();
        int level = (Integer) arg;
        LevelUtil.printLevel(level);
        System.out.println(this.getClass().getSimpleName()
                + ": Convert command to investment order.");
        setChanged();
        notifyObservers(level + 1);
    }

    public InvestmentOrder getOrder() {
        return order;
    }
}
