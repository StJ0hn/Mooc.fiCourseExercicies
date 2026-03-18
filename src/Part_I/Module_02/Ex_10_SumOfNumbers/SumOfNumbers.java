package Part_I.Module_02.Ex_10_SumOfNumbers;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Give a number:");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 0){
                break;
            }
            sum += number;
        }
        System.out.printf("Sum of numbers: %d", sum);
    }
}
