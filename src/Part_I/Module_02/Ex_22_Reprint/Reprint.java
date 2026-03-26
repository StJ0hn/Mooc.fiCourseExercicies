package Part_I.Module_02.Ex_22_Reprint;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times?");
        int times = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < times; i++) {
            printText();
        }
    }
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }
}
