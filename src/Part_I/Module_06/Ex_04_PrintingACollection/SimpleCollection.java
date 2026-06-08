package Part_I.Module_06.Ex_04_PrintingACollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name){
        this.name = name;
        elements = new ArrayList<>();
    }

    public void add(String element){
        elements.add(element);
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }

        String output = "The collection " + this.name + " has " + this.elements.size();

        if (this.elements.size() == 1) {
            output = output + " element:\n";
        } else {
            output = output + " elements:\n";
        }

        for (String element : this.elements) {
            output = output + element + "\n";
        }

        return output;
    }
}
