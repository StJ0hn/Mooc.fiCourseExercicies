package Part_I.Module_02.Ex_06_AreWeThereYet;

import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while (true){
            System.out.println("Give a number:");
            int option = Integer.parseInt(sc.nextLine());
            if (option == 4){
                break;
            }
        }
    }
}
