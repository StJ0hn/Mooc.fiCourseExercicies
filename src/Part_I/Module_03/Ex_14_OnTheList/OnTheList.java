package Part_I.Module_03.Ex_14_OnTheList;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true){
            String name = sc.nextLine();
            if (name.equals("")){
                break;
            }
            names.add(name);
        }
        System.out.print("Search for? ");
        String search = sc.nextLine();
        boolean searchFound = names.contains(search);
        if (searchFound){
            System.out.println(search + " was found!");
        }
        else {
            System.out.println(search + " was not found!");
        }
    }
}
