package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("rawtypes")
public class AccountingCenter {
    private List<Comparable> accountBookList;

    public AccountingCenter() {
        accountBookList = new ArrayList<Comparable>();
    }

    @SuppressWarnings("unchecked")
    public void sort() {
        Collections.sort(accountBookList);
    }

    public List<Comparable> getAccountBookList() {
        return accountBookList;
    }

    public void setAccountBookList(List<Comparable> accountBookList) {
        this.accountBookList = accountBookList;
    }

}
