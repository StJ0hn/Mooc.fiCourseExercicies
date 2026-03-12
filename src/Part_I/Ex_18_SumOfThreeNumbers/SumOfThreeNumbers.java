package Part_I.Ex_18_SumOfThreeNumbers;

import java.util.Locale;
import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(sc.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.parseInt(sc.nextLine());
        int sum = first + second + third;
        System.out.printf("The sum of numbers is %d", sum);
    }
}
