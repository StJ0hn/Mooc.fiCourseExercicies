package Part_I.Module_04.Ex_27_IsItInTheFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        System.out.println("Name of the file: ");
        String file = sc.nextLine();
        try (Scanner scanner = new Scanner(Paths.get("src/Part_I/Module_04/Ex_27_IsItInTheFile/" + file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                lines.add(row);
            }
            System.out.println("Search for: ");
            String word = sc.nextLine();
            if (!lines.contains(word)){
                System.out.println("Not found.");
            } else {
                System.out.println("Found!");
            }

        }
        catch (Exception exception){
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
