package observer.subject;

import java.util.Observable;
import java.util.Observer;

import observer.entity.InvestmentOrder;
import observer.util.LevelUtil;

public class StockExchange implements Observer {

    public StockExchange(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        @SuppressWarnings("unused")
        InvestmentOrder order = ((TradeDepartment) o).getOrder();
        LevelUtil.printLevel(arg);
        System.out.println(this.getClass().getSimpleName()
                + ": Receive and execute the order.");
    }

}
