package Part_I.Module_04.Ex_25_PrintingASpecificFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecificFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which file should have it contents printed? ");
        String file = sc.nextLine();
        try (Scanner scanner = new Scanner(Paths.get("src/Part_I/Module_04/Ex_25_PrintingASpecificFile/" + file))){
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }
}
