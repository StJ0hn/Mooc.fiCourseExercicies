package Part_I.Module_02.Ex_03_AbsoluteValue;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int absoluteNumber = Integer.parseInt(sc.nextLine());
        if (absoluteNumber < 0){
            System.out.println(absoluteNumber * (-1));
        }
        else {
            System.out.println(absoluteNumber);
        }
    }
}
