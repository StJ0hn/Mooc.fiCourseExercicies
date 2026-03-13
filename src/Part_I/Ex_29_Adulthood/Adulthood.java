package Part_I.Ex_29_Adulthood;

import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.parseInt(sc.nextLine());
        if (age < 18){
            System.out.println("You are not an adult");
        }
        else {
            System.out.println("You are an adult");
        }
    }
}
