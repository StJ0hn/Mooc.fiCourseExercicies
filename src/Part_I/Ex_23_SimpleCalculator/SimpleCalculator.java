package Part_I.Ex_23_SimpleCalculator;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(sc.nextLine());
        int sum = first + second;
        int subtraction = first - second;
        int product = first * second;
        double division = (double) first/second;
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + subtraction);
        System.out.println(first + " * " + second + " = " + product);
        System.out.println(first + " / " + second + " = " + division);
    }
}
