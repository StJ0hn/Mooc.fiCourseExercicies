package Part_I.Module_03.Ex_11_IndexOf;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int number = Integer.parseInt(sc.nextLine());
            if (number == -1){
                break;
            }
            numbers.add(number);
        }
        if (!(numbers.size() == 0)){
            System.out.print("Search for: ");
            int search = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < numbers.size(); i++) {
                if (search == numbers.get(i)){
                    System.out.println(search + " is at " + i + " index");
                }
            }
        }
        else {
            System.out.println("No numbers added to the list.");
        }
    }
}
