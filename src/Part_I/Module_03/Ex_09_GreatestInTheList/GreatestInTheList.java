package Part_I.Module_03.Ex_09_GreatestInTheList;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInTheList {
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
            int biggest = numbers.get(0);

            for(int i = 0; i < numbers.size(); i++) {
                int number = numbers.get(i);
                if (biggest < number) {
                    biggest = number;
                }
            }
            System.out.println("The greatest number: " +  biggest);
        }
        else {
            System.out.println("No numbers added to the list.");
        }
    }
}
