package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

  /*  public Iterator createIterator(){
        return new PancakeIterator(menuItems);
    }*/
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
