package Part_I.Module_03.Ex_24_IsItTrue;

import java.util.Scanner;

public class IsItTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a string: ");
        String string = sc.nextLine();
        if (string.equals("true")){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
