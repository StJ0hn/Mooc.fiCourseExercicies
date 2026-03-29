package Part_I.Module_03.Ex_02_SecondPlusThird;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        while (true){
            int number = Integer.parseInt(sc.nextLine());
            if (number == 0){
                break;
            }
            numbers.add(number);
        }
        /*
            if (numbers.size() >= 3) {
                System.out.println(numbers.get(1) + numbers.get(2));
            }
            A version of the code that prevents index access errors that exceed the array size.
        */
        System.out.println(numbers.get(1) + numbers.get(2));
    }
}
