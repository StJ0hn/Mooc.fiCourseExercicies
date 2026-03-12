package Part_I.Ex_15_DifferentTypeOfInput;

import java.util.Locale;
import java.util.Scanner;

public class DifferentTypeOfInput {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a string:");
        String varOne = sc.nextLine();
        System.out.println("Give an integer: ");
        int varTwo = Integer.parseInt(sc.nextLine());
        System.out.println("Give a double: ");
        double varThree = Double.parseDouble(sc.nextLine());
        System.out.println("Give an boolean: ");
        boolean varFour = Boolean.parseBoolean(sc.nextLine());
        System.out.printf("You gave the string %s \nYou gave the integer %d \nYou gave a double %.1f \nYou gave the boolean %b", varOne, varTwo, varThree, varFour);
    }
}
