package Part_I.Ex_12_IntegerInput;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int varOne = scanner.nextInt();
        System.out.printf("You gave the number %d", varOne);
    }
}
