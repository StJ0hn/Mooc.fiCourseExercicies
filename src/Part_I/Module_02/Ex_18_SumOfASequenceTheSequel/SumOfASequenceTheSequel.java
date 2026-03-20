package Part_I.Module_02.Ex_18_SumOfASequenceTheSequel;

import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number? ");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Last number? ");
        int sum = 0;
        int lastNumber = Integer.parseInt(sc.nextLine());
        for (int i = firstNumber; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
