package iterator.test;

import iterator.entity.DinnerMenu;
import iterator.entity.Menu;
import iterator.entity.MenuItem;
import iterator.entity.PancakeMenu;

import java.util.Iterator;

public class MenuTest {
    public static void main(String[] args) {

        Menu dm = new DinnerMenu();
        Menu pm = new PancakeMenu();

        // add items
        dm.addItem(new MenuItem("0"));
        dm.addItem(new MenuItem("1"));
        dm.addItem(new MenuItem("2"));
        dm.addItem(new MenuItem("3"));
        dm.addItem(new MenuItem("4"));
        pm.addItem(new MenuItem("5"));
        pm.addItem(new MenuItem("6"));
        pm.addItem(new MenuItem("7"));
        pm.addItem(new MenuItem("8"));
        pm.addItem(new MenuItem("9"));

        Iterator<MenuItem> it = dm.iterator();

        it = pm.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        it = dm.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
