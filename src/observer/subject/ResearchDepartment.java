package observer.subject;

import java.util.Observable;

import observer.entity.ResearchReport;

public class ResearchDepartment extends Observable {

    private ResearchReport report;

    public ResearchDepartment() {
        report = new ResearchReport();
    }

    public void update() {
        System.out.println(this.getClass().getSimpleName()
                + ": Create a research report.");
        setChanged();
        notifyObservers(1);
    }

    public ResearchReport getReport() {
        return report;
    }
}
