package Part_I.Ex_14_BooleanInput;

import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something: ");
        boolean valueOne = Boolean.valueOf(sc.nextLine());
        System.out.print("True or false? ");
        System.out.println(valueOne);
    }
}
