package iteratorComposite.collection;

import iteratorComposite.entity.Doctor;
import iteratorComposite.entity.PeopleComponent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Doctors extends PeopleComponent implements Crowd {

    private Map<String, PeopleComponent> doctors = new HashMap<String, PeopleComponent>();
    private Iterator<PeopleComponent> it = null;

    @Override
    public void add(PeopleComponent pc) {
        Doctor doctor = (Doctor) pc;
        doctors.put(doctor.getCode(), doctor);
    }

    public void remove() {
    }

    @Override
    public boolean hasNext() {
        if (it == null) {
            it = doctors.values().iterator();
        }
        return it.hasNext();
    }

    @Override
    public PeopleComponent next() {
        if (it == null) {
            it = doctors.values().iterator();
        }
        return it.next();
    }

    @Override
    public void print() {
        for (PeopleComponent doctor : doctors.values()) {
            doctor.print();
        }
    }

}
