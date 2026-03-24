package Part_I.Module_02.Ex_20_RepeatingBreakingAndRemembering;

import java.util.Locale;
import java.util.Scanner;

public class RepeatingBreakAndRemembering {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        System.out.println("Give numbers:");
        while (true){
            int number = Integer.parseInt(sc.nextLine());
            if (number < 0){
                System.out.println("Thx! Bye!");
                break;
            }
            if (number % 2 == 0){
                evenCounter ++;
            }
            else {
                oddCounter++;
            }
            sum += number;
            counter ++;
        }
        double average = 0;
        if (counter > 0){
            average = (double) sum / counter;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.printf("Average: %.12f\n", average);
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);
    }
}
