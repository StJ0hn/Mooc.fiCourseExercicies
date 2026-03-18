package Part_I.Module_02.Ex_16_ForWhereToWhere;

import java.util.Scanner;

public class ForWhereToWhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where to? ");
        int whereTo = Integer.parseInt(sc.nextLine());
        System.out.print("Where from? ");
        int whereFrom = Integer.parseInt(sc.nextLine());
        for (int i = whereFrom; i <= whereTo; i++) {
            System.out.println(i);
        }
    }
}
