package Iterator;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args){
        ArrayList<MenuItem> items = new ArrayList<>();
        MenuItem[] items1 = new MenuItem[6];
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu(items);
        DinerMenu dinerMenu = new DinerMenu(items1);
        pancakeHouseMenu.addItem("Breakfast","toast",true,2.99);
        dinerMenu.addItem("Dinner","toast",true,2.99);
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
