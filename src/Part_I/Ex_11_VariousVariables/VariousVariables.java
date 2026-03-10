package Part_I.Ex_11_VariousVariables;

import java.util.Locale;
import java.util.Scanner;

public class VariousVariables {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chicken:");
        int varOne = scanner.nextInt();
        System.out.println("Bacon(Kg):");
        double varTwo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Tractor: ");
        String varThree = scanner.nextLine();
        System.out.printf("And finally, a summary: \n" +
                "%d\n" +
                "%.1f\n" +
                "%s", varOne, varTwo, varThree);
    }
}
