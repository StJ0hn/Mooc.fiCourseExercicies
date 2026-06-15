package Part_I.Module_06.Ex_08_CargoHold;

import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int currentWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            currentWeight += suitcase.totalWeight();
        }
        return currentWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() + totalWeight() <= maximumWeight){
            suitcases.add(suitcase);
        }
    }

    public void printItems(){
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases " + "(" + totalWeight() + " kg)";
    }
}
