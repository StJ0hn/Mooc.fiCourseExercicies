package Part_I.Module_03.Ex_23_PrintThrice;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a word: ");
        String word = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print(word);
        }
    }
}
