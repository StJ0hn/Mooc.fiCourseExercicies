package Part_I.Ex_37_GiftTax;

import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.parseInt(sc.nextLine());
        if (value < 5000){
            System.out.println("No tax!");
        } else if (value < 25000) { //case one 
            double tax = 100  + ((value - 5000) * 0.08);
            System.out.printf("%.1f", tax);
        } else if (value < 55000) { // case two
            double tax = 1700  + ((value - 25000) * 0.1);
            System.out.printf("%.1f", tax);
        } else if (value < 200000) { // case three
            double tax = 4700  + ((value - 55000) * 0.12);
            System.out.printf("%.1f", tax);
        } else if (value < 1000000) { //case five
            double tax = 22100  + ((value - 200000) * 0.15);
            System.out.printf("%.1f", tax);
        } else {
            double tax = 142100 + ((value - 1000000) * 0.17);
            System.out.printf("%.1f", tax);
        }
    }
}
