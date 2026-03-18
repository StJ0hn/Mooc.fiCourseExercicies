package Part_I.Module_02.Ex_17_SumOfASequence;

import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Last number? ");
        int sum = 0;
        int lastNumber = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lastNumber; i++) {
            sum += i+1;
        }
        System.out.println(sum);
    }
}
