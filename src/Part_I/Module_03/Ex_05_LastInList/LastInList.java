package Part_I.Module_03.Ex_05_LastInList;

import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true){
            String name = sc.nextLine();
            if (name.isEmpty()){
                break;
            }
            names.add(name);
        }
        if (!(names.size() == 0)){
            System.out.println(names.get(names.size() - 1));
        }
        else {
            System.out.println("No names added to the list.");
        }
    }
}