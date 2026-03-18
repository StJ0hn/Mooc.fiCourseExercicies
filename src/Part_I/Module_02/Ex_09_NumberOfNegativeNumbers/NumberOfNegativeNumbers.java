package Part_I.Module_02.Ex_09_NumberOfNegativeNumbers;

import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.println("Give a number:");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 0){
                break;
            } else if (number < 0){
                count++;
            }
        }
        System.out.printf("Number of negative numbers: %d", count);
    }
}
