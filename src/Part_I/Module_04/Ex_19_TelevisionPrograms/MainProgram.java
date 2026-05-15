package Part_I.Module_04.Ex_19_TelevisionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TelevisionProgram> listOfPrograms = new ArrayList<TelevisionProgram>();
        while (true){
            System.out.print("Name: ");
            String name = sc.nextLine();
            if (name.isBlank()){
                System.out.println();
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.parseInt(sc.nextLine());
            TelevisionProgram televisionProgram = new TelevisionProgram(name, duration);
            listOfPrograms.add(televisionProgram);
        }
        System.out.print("Program maximum duration: ");
        int maximumDuration = Integer.parseInt(sc.nextLine());
        for (TelevisionProgram program : listOfPrograms){
            if (program.getDuration() <= maximumDuration){
                System.out.println(program);
            }
        }
    }
}
