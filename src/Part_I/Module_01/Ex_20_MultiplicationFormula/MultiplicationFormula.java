package Part_I.Module_01.Ex_20_MultiplicationFormula;

import java.util.Locale;
import java.util.Scanner;

public class MultiplicationFormula {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.parseInt(sc.nextLine());
        int product = first * second;
        System.out.println(first + " * " + second + " = " + product);
    }
}
