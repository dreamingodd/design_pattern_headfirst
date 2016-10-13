package iteratorComposite.collection;

import iteratorComposite.entity.PeopleComponent;

public class Programmers extends PeopleComponent implements Crowd {
    private PeopleComponent[] programmers = new PeopleComponent[100];

    private int position = 0;
    private int size = 0;

    @Override
    public void add(PeopleComponent pc) {
        if (size >= 100) {
            System.out.println("Array is full!");
        }
        programmers[size++] = pc;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return !(programmers[position] == null);
    }

    @Override
    public PeopleComponent next() {
        PeopleComponent programmer = null;
        if (hasNext()) {
            programmer = programmers[position];
            position++;
        }
        return programmer;
    }

    @Override
    public void print() {
        for (PeopleComponent pc : programmers) {
            if (pc != null)
                pc.print();
        }
    }
}
