package Part_I.Ex_24_SpeedingTicket;

import java.util.Locale;
import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give speed:");
        int speed = Integer.parseInt(sc.nextLine());
        if (speed > 120){
            System.out.println("Speeding ticket!");
        }
    }
}
