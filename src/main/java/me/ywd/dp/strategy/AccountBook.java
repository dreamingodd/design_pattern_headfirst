package strategy;

public class AccountBook {
    protected int year;
    protected int priority;
    public AccountBook() { }
    public AccountBook(int year, int priority) {
        this.year = year;
        this.priority = priority;
    }
    @Override
    public String toString() {
        return "AccountBook [year=" + year + ", priority=" + priority + "]";
    }

}
