package Part_I.Module_03.Ex_11_IndexOfSmallest;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int number = Integer.parseInt(sc.nextLine());
            if (number == 9999){
                break;
            }
            numbers.add(number);
        }
        if (!(numbers.size() == 0)){
            System.out.print("Smallest number: ");
            int smallest = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < numbers.size(); i++) {
                if (smallest == numbers.get(i)){
                    System.out.println("Found at the index: " + i);
                }
            }
        }
        else {
            System.out.println("No numbers added to the list.");
        }
    }
}
