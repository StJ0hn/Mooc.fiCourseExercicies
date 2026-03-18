package Part_I.Module_02.Ex_11_NumberAndSumOfNumbers;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true){
            System.out.println("Give a number:");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 0){
                break;
            }
            count++;
            sum += number;
        }
        System.out.printf("Number of numbers: %d\nSum of numbers: %d", count, sum);
    }
}