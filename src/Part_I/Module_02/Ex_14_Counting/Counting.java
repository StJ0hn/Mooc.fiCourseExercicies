package Part_I.Module_02.Ex_14_Counting;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= count; i++) {
            System.out.println(i);
        }
    }
}
