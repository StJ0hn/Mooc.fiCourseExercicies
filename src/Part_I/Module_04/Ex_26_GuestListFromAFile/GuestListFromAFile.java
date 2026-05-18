package Part_I.Module_04.Ex_26_GuestListFromAFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = sc.nextLine();
        try (Scanner scanner = new Scanner(Paths.get("src/Part_I/Module_04/Ex_26_GuestListFromAFile/" + file))){
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                lines.add(row);
            }
            System.out.println();
            System.out.println("Enter names, an empty lines quits.");
            while (true){
                String name = sc.nextLine();
                if (name.isBlank()){
                    break;
                }
                if (!lines.contains(name)){
                    System.out.println("The name is not on the list.");
                } else {
                    System.out.println("The name is on the list.");
                }
            }
            System.out.println("Thank you!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }
}
