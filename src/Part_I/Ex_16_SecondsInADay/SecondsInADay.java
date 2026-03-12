package Part_I.Ex_16_SecondsInADay;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(sc.nextLine());
        int secondsInADay = 86400;
        System.out.print(days * secondsInADay);
    }
}
