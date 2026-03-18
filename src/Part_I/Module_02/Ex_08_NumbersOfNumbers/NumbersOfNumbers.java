package Part_I.Module_02.Ex_08_NumbersOfNumbers;

import java.util.Scanner;

public class NumbersOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.println("Give a number:");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 0){
                break;
            }
            count ++;
        }
        System.out.printf("Number of numbers: %d", count);
    }
}
