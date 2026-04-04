package Part_I.Module_03.Ex_13_AverageOfAList;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == -1) {
                break;
            }
            numbers.add(n);
        }

        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            sum += number;
            count++;
        }
        double average = (double) sum / count;
        System.out.print("Sum: " + average);
    }
}
