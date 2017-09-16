package observer.subject;

import java.util.Observable;
import java.util.Observer;

import observer.entity.InvestmentStrategy;
import observer.entity.ResearchReport;
import observer.util.LevelUtil;

public class InvestmentCommittee extends Observable implements Observer {

    private InvestmentStrategy strategy = new InvestmentStrategy();

    public InvestmentCommittee(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        @SuppressWarnings("unused")
        ResearchReport report = ((ResearchDepartment) o).getReport();
        int level = (Integer) arg;
        LevelUtil.printLevel(level);
        System.out.println(this.getClass().getSimpleName()
                + ": Convert report to strategy");
        setChanged();
        notifyObservers(level + 1);
    }

    public InvestmentStrategy getStrategy() {
        return strategy;
    }

}
