package Part_I.Module_03.Ex_30_AgeOfTheOldest;

import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameOfGreatest = "";
        int greatest = 0;
        while (true) {
            String text = sc.nextLine();
            if (text.isBlank()) {
                break;
            }

            String[] pieces = text.split(",");
            int parsedAge = Integer.parseInt(pieces[1]);
            if (parsedAge > greatest){
                greatest = parsedAge;
                nameOfGreatest = pieces[0];
            }
        }
        System.out.print("Name of the oldest: " + nameOfGreatest);
    }
}
