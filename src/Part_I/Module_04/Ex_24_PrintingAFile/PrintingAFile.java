package Part_I.Module_04.Ex_24_PrintingAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(Paths.get("src/Part_I/Module_04/Ex_24_PrintingAFile/data.txt"))){
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                System.out.println(row);
            }
        }
        catch (Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
