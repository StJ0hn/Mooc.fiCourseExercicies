package Part_I.Ex_17_SumOfTwoNumbers;

import java.util.Locale;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(sc.nextLine());
        int sum = first + second;
        System.out.printf("The sum of two numbers is %d", sum);
    }
}
