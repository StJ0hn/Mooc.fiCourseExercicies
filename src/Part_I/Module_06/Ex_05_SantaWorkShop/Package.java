package Part_I.Module_06.Ex_05_SantaWorkShop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift){
        gifts.add(gift);
    }

    public int totalWeight(){
        int counter = 0;
        for (Gift gift : gifts){
            counter += gift.getWeight();
        }
        return counter;
    }

}
