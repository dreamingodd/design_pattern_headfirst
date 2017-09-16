package strategy;

public class AccountBookByPriority extends AccountBook implements Comparable<AccountBook> {

    public AccountBookByPriority(AccountBook ab) {
        this.priority = ab.priority;
        this.year = ab.year;
    }

    @Override
    public int compareTo(AccountBook ab) {
        return this.priority < ab.priority ? 1 : -1;
    }

}
