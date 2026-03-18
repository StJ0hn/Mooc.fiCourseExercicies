package Part_I.Module_02.Ex_07_OnlyPositives;

import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Give a number:");
            int number = Integer.parseInt(sc.nextLine());
            if (number == 0){
                break;
            } else if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            System.out.println(number * number);
        }
    }
}
