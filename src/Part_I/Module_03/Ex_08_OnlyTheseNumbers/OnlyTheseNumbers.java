package Part_I.Module_03.Ex_08_OnlyTheseNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int number = Integer.parseInt(sc.nextLine());
            if (number == -1){
                break;
            }
            numbers.add(number);
        }
        System.out.print("From where? ");
        int fromWhere = Integer.parseInt(sc.nextLine());
        System.out.print("To where? ");
        int toWhere = Integer.parseInt(sc.nextLine());
        if (!(numbers.size() == 0)){
            for (int i = fromWhere; i <= toWhere; i++){
                System.out.println(numbers.get(i));
            }
        }
        else {
            System.out.println("No numbers added to the list.");
        }
    }
}
