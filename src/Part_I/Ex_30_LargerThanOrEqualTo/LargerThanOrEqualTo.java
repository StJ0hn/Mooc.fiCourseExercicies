package Part_I.Ex_30_LargerThanOrEqualTo;

import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int numberOne = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int numberTwo = Integer.parseInt(sc.nextLine());
        if (numberOne > numberTwo){
            System.out.println("Greater number is: " + numberOne);
        }
        else if (numberOne == numberTwo) {
            System.out.println("The numbers are equal!");
        }
        else {
            System.out.println("Greater number: " + numberTwo);
        }
    }
}
