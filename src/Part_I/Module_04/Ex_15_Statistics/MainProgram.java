package Part_I.Module_04.Ex_15_Statistics;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        while (true){
            int number = Integer.parseInt(sc.nextLine());
            if (number == -1){
                break;
            }
            if (number % 2 == 0){
                statistics1.addNumber(number);
            }
            if (number % 2 != 0){
                statistics2.addNumber(number);
            }
            statistics.addNumber(number);
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics1.sum());
        System.out.println("Sum of odd numbers: " + statistics2.sum());
    }
}
