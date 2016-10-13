package iteratorComposite.entity;

public abstract class PeopleComponent {
    public void add(PeopleComponent pc) {
        throw new UnsupportedOperationException();
    }

    public void remove(PeopleComponent pc) {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        throw new UnsupportedOperationException();
    }

    public PeopleComponent next() {
        throw new UnsupportedOperationException();
    }

    public abstract void print();

}
