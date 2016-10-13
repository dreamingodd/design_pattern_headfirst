package observer.subject;

import java.util.Observable;
import java.util.Observer;

import observer.entity.InvestmentCommand;
import observer.entity.InvestmentProduct;
import observer.util.LevelUtil;

public class FundManager extends Observable implements Observer {

    private InvestmentCommand command = new InvestmentCommand();

    public FundManager(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        @SuppressWarnings("unused")
        InvestmentProduct product = ((InvestmentDepartment) o).getProduct();
        int level = (Integer) arg;
        LevelUtil.printLevel(level);
        System.out.println(this.getClass().getSimpleName()
                + ": Convert product to investment command.");
        setChanged();
        notifyObservers(level + 1);
    }

    public InvestmentCommand getCommand() {
        return command;
    }
}
