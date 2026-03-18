package Part_I.Module_02.Ex_12_AverageOfNumbers;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average;
        while (true){
            System.out.println("Give a number:");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 0){
                break;
            }
            count++;
            sum += number;
        }
        average = (double) sum / count;
        System.out.printf("Average of the numbers %.1f", average);
    }
}
