package Part_I.Module_03.Ex_31_PersonalDetails;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greatestName = "";
        int counter = 0;
        double sum = 0;
        while (true) {
            String text = sc.nextLine();
            if (text.isBlank()) {
                break;
            }

            String[] pieces = text.split(",");
            int birthday = Integer.parseInt(pieces[1]);
            if (pieces[0].length() > greatestName.length()){
                greatestName = pieces[0];
            }
            sum += birthday;
            counter++;
        }
        double average = sum/counter;
        System.out.println("Longest name: " + greatestName);
        System.out.println("Average of birth years: " + average);
    }
}
