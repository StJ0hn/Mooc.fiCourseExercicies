package Part_I.Module_02.Ex_13_AverageOfPositiveNumbers;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;
        while (true){
            int number = Integer.parseInt(sc.nextLine());
            if (number > 0){
                count++;
                sum += number;
                average = (double) sum/count;
            }
            if (number == 0 && sum == 0){
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                System.out.printf("%.1f", average);
                break;
            }
        }
    }
}
