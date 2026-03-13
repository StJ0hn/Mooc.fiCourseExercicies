package Part_I.Ex_27_Ancient;

import java.util.Locale;
import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.parseInt(sc.nextLine());
        if (year < 2015){
            System.out.println("Ancient history!");
        }
    }
}
