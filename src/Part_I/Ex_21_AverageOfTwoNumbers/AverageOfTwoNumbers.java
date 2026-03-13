package Part_I.Ex_21_AverageOfTwoNumbers;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(sc.nextLine());
        double average =  (double) (first + second) / 2;
        System.out.printf("The average is %.1f", average);
    }
}
