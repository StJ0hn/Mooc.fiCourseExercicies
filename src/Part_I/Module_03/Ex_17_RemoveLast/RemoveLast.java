package Part_I.Module_03.Ex_17_RemoveLast;

import java.util.ArrayList;

public class RemoveLast {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings){
        for (int string = 0; string < strings.size(); string++) {
            if (strings.get(string).equals( strings.get(strings.size()-1))){
                strings.remove(string);
            }
        }
    }
}
