package Iterator;
import java.util.Iterator;

public class DinerMenu implements Menu{
    private static int MAX_ITEMS = 6;
    private int numberOFItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if (numberOFItems>=MAX_ITEMS) System.err.println("满了");
        else {
            menuItems[numberOFItems] = menuItem;
            numberOFItems++;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }


}
