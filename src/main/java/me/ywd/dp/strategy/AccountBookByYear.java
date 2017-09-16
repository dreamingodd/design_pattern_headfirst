package strategy;

public class AccountBookByYear extends AccountBook implements Comparable<AccountBook> {

    public AccountBookByYear(AccountBook ab) {
        this.priority = ab.priority;
        this.year = ab.year;
    }

    @Override
    public int compareTo(AccountBook ab) {
        return this.year > ab.year ? 1 : -1;
    }

}
