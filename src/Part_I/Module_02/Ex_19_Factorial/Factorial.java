package Part_I.Module_02.Ex_19_Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int numberFact = Integer.parseInt(sc.nextLine());
        int fact = 1;
        for (int i = 1; i <= numberFact; i++) {
            fact *= i;
        }
        System.out.print("Factorial: " + fact);
    }
}
