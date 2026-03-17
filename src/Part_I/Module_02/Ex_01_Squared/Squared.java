package Part_I.Module_02.Ex_01_Squared;

import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int square = number * number;
        System.out.println(square);
    }
}
