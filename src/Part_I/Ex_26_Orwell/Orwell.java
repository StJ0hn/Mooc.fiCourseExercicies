package Part_I.Ex_26_Orwell;

import java.util.Locale;
import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(sc.nextLine());
        if (number == 1984){
            System.out.println("Orwell");
        }
    }
}
