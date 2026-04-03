package Part_I.Module_03.Ex_12_SumOfAList;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

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

        for (int number : numbers) {
            sum += number;
        }

        System.out.print("Sum: " + sum);
    }
}