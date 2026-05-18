package Part_I.Module_04.Ex_28_NumbersFromAFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("File? ");
        String file = sc.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(sc.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(sc.nextLine());
        try (Scanner fileScanner = new Scanner(Paths.get("src/Part_I/Module_04/Ex_28_NumbersFromAFile/" + file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                if (!row.isEmpty()){
                    int number = Integer.parseInt(row);
                    numbers.add(number);
                }
            }
        }
        catch (Exception exception){
            System.out.println("Reading the file " + file + " failed.");
        }
        int count = 0;
        for (Integer n : numbers){
            if (n >= lowerBound && n <= upperBound){
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }
}
