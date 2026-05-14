package Part_I.Module_04.Ex_17_Items;

import java.util.ArrayList;

public class Items {
    private ArrayList<Item> items;

    public Items() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void list(){
        for (int i = 0; i < items.size(); i++)
            System.out.println(items.get(i).toString());
    }
}
