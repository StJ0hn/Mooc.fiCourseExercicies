package Part_I.Module_02.Ex_04_ComparingNumbers;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        if (firstNumber > secondNumber){
            System.out.printf("%d is greater than %d", firstNumber, secondNumber);
        } else if (secondNumber > firstNumber) {
            System.out.printf("%d is greater than %d", secondNumber, firstNumber);
        } else {
            System.out.printf("%d is equal to %d", firstNumber, secondNumber);
        }
    }
}
