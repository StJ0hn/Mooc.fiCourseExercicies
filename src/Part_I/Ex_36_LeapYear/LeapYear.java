package Part_I.Ex_36_LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the year: ");
        int year = Integer.parseInt(sc.nextLine());
        if (year % 100 == 0 && year % 400 == 0){
            System.out.println("The year is a leap year.");
        } else if (year % 100 == 0){
            System.out.println("The year is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
