package strategy;

import java.util.List;
import java.util.ArrayList;

public class Test {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        AccountingCenter center = new AccountingCenter();
        AccountBook ab1 = new AccountBook(2011, 9);
        AccountBook ab2 = new AccountBook(1999, 99);
        AccountBook ab3 = new AccountBook(2013, 999);
        AccountBookByPriority abp1 = new AccountBookByPriority(ab1);
        AccountBookByPriority abp2 = new AccountBookByPriority(ab2);
        AccountBookByPriority abp3 = new AccountBookByPriority(ab3);
        AccountBookByYear aby1 = new AccountBookByYear(ab1);
        AccountBookByYear aby2 = new AccountBookByYear(ab2);
        AccountBookByYear aby3 = new AccountBookByYear(ab3);
        List<Comparable> abps = new ArrayList<Comparable>();
        abps.add(abp1);
        abps.add(abp2);
        abps.add(abp3);
        List<Comparable> abys = new ArrayList<Comparable>();
        abys.add(aby1);
        abys.add(aby2);
        abys.add(aby3);

        center.setAccountBookList(abps);
        center.sort();
        for (Object c : center.getAccountBookList()) {
            c = (AccountBook) c;
            System.out.println(c);
        }
        center.setAccountBookList(abys);
        center.sort();
        for (Object c : center.getAccountBookList()) {
            c = (AccountBook) c;
            System.out.println(c);
        }
    }
}
