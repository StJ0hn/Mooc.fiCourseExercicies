package Part_I.Module_03.Ex_18_Swap;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 3, 5, 7, 9};

        System.out.println("Give two indices to swap:");
        int index1 = Integer.parseInt(scanner.nextLine());
        int index2 = Integer.parseInt(scanner.nextLine());

        int aux = numbers[index1];
        numbers[index2] = aux;
        numbers[index1] = numbers[index2];

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}