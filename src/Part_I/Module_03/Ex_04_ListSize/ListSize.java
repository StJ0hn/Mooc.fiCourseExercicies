package Part_I.Module_03.Ex_04_ListSize;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
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
        System.out.println("In total: " + names.size());
    }
}
