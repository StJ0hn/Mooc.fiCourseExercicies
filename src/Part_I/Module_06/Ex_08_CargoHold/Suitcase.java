package Part_I.Module_06.Ex_08_CargoHold;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    private int totalWeight;

    public Suitcase(int maximumWeight) {
        items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
        totalWeight = 0;
    }

    public void addItem(Item item){
        if (this.totalWeight + item.getWeight() <= this.maximumWeight){
            items.add(item);
            this.totalWeight += item.getWeight();
        }
    }

    public void printItems(){
        for (Item item : items){
            System.out.println(item);
        }
    }

    public int totalWeight(){
        return totalWeight;
    }

    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);
        for (Item item : items){
            if (item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if (items.size() == 1){
            return  "1 item (" + totalWeight + " kg)";
        }
        return items.size() + " items (" + totalWeight + " kg)";
    }
}
