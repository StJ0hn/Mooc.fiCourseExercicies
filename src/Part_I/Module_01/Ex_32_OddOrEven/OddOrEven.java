package Part_I.Module_01.Ex_32_OddOrEven;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(sc.nextLine());
        if (number % 2 == 0){
            System.out.printf("Number %d is even.", number);
        }
        else {
            System.out.printf("Number %d is odd.", number);
        }
    }
}
