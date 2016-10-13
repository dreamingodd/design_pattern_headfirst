package observer.subject;

import java.util.Observable;
import java.util.Observer;

import observer.util.LevelUtil;

public class RiskCommittee implements Observer {

    public RiskCommittee() {
    }

    public RiskCommittee(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof FundManager) {
            LevelUtil.printLevel(arg);
            System.out.println(this.getClass().getSimpleName()
                    + ": Control the risk of FundManager's operations.");
        } else if (o instanceof Accountant) {
            LevelUtil.printLevel(arg);
            System.out.println(this.getClass().getSimpleName()
                    + ": Control the risk of Account's accounting.");
        }
    }

}
