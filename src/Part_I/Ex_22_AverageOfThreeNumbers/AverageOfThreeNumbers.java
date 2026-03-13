package Part_I.Ex_22_AverageOfThreeNumbers;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int third = Integer.parseInt(sc.nextLine());
        double average =  (double) (first + second + third) / 3;
        System.out.print("The average is " + average);
    }
}
