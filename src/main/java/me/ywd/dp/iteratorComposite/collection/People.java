package iteratorComposite.collection;

import iteratorComposite.entity.PeopleComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People extends PeopleComponent implements Crowd {

    private List<PeopleComponent> people = new ArrayList<PeopleComponent>();
    private Iterator<PeopleComponent> it = null;

    @Override
    public void add(PeopleComponent pc) {
        people.add(pc);
    }

    @Override
    public void remove() {
    }

    @Override
    public boolean hasNext() {
        if (it == null) {
            it = people.iterator();
        }
        return it.hasNext();
    }

    @Override
    public PeopleComponent next() {
        if (it == null) {
            it = people.iterator();
        }
        return it.next();
    }

    @Override
    public void print() {
        for (PeopleComponent pc : people) {
            pc.print();
        }
    }

}
