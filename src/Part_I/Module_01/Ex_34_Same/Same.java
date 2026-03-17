package Part_I.Module_01.Ex_34_Same;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = sc.nextLine();
        System.out.println("Enter the second string:");
        String secondString = sc.nextLine();
        if (firstString.equals(secondString)){
            System.out.println("Same");
        }
        else {
            System.out.println("Different");
        }
    }
}
