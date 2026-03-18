package Part_I.Module_02.Ex_05_CarryOn;

import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while (true){
            System.out.println("Shall we carry on?");
            String option = sc.nextLine();
            if (option.equals("no")){
                break;
            }
        }
    }
}
