package Part_I.Module_01.Ex_35_CheckingTheAge;

import java.util.Scanner;

public class CheckingTheAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = Integer.parseInt(sc.nextLine());
        if (age > 0 && age <= 120){
            System.out.println("OK");
        }
        else {
            System.out.println("Impossible!");
        }
    }
}
