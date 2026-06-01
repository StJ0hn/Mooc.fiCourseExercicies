package Part_I.Module_06.Ex_02_Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private ArrayList<String> listOfStrings;

    public Stack(){
        listOfStrings = new ArrayList<>();
    }

    public boolean isEmpty(){
        if (listOfStrings.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value){
        listOfStrings.add(value);
    }

    public ArrayList<String> values(){
        return listOfStrings;
    }

    public String take(){
        String lastElement = listOfStrings.getLast();
        listOfStrings.remove(lastElement);
        return lastElement;
    }
}
