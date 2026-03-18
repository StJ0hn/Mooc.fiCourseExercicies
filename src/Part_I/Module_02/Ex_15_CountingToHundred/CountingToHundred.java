package Part_I.Module_02.Ex_15_CountingToHundred;

import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
