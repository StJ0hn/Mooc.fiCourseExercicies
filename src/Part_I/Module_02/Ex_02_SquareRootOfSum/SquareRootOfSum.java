package Part_I.Module_02.Ex_02_SquareRootOfSum;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = Integer.parseInt(sc.nextLine());
        int numberTwo = Integer.parseInt(sc.nextLine());
        int sum = numberOne + numberTwo;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
