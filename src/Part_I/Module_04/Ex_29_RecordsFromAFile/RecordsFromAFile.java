package Part_I.Module_04.Ex_29_RecordsFromAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = sc.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get("src/Part_I/Module_04/Ex_29_RecordsFromAFile/" + fileName))){
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if (line.isEmpty()){
                    break;
                }
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (Exception exception) {
            System.out.println("Error: " + exception);
        }
    }
}
