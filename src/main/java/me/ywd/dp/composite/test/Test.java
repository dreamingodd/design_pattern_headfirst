package composite.test;

import composite.component.MenuComponent;
import composite.entity.Menu;
import composite.entity.MenuItem;

public class Test {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("Pancake Menu");
        MenuComponent cafeMenu = new Menu("Cafe Menu");
        MenuComponent dessertMenu = new Menu("Desset Menu");

        pancakeMenu.add(new MenuItem("pancake1"));
        cafeMenu.add(new MenuItem("cafe1"));
        dessertMenu.add(new MenuItem("dessert1"));

        /*************************************/
        MenuComponent allMenu = new Menu("All");
        /*************************************/

        allMenu.add(pancakeMenu);
        allMenu.add(cafeMenu);
        allMenu.add(dessertMenu);

        System.out.println(allMenu);
    }
}
