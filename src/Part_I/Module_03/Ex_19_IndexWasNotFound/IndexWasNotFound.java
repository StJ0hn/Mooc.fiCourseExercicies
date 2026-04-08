package Part_I.Module_03.Ex_19_IndexWasNotFound;

import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 4;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 2;
        array[6] = 5;
        array[7] = 7;
        array[8] = 9;
        array[9] = 0;
        System.out.println("Search for? ");
        int searchFor = Integer.parseInt(sc.nextLine());
        boolean isFound = false;
        int indexFound = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchFor){
                isFound = true;
                indexFound = i;
            }
        }
        if (isFound){
            System.out.println(searchFor + " is at index " + indexFound + ".");
        }
        else {
            System.out.println(searchFor + " was not found.");
        }
    }
}
