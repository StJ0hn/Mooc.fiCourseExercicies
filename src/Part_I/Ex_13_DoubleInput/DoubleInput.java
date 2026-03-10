package Part_I.Ex_13_DoubleInput;

import java.util.Locale;
import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        double varOne = Double.valueOf(scanner.nextDouble());
        System.out.println("You gave a number " + varOne);
    }
}
