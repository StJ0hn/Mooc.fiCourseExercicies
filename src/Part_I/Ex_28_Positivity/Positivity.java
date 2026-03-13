package Part_I.Ex_28_Positivity;

import java.util.Locale;
import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(sc.nextLine());
        if (number > 0){
            System.out.println("The number is positive.");
        }
        else {
            System.out.println("The number is not positive.");
        }
    }
}
