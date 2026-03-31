package Part_I.Module_03.Ex_06_FirstAndLast;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
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
            System.out.println(names.getFirst());
            System.out.println(names.getLast());
        }
        else {
            System.out.println("No names added to the list.");
        }
    }
}
