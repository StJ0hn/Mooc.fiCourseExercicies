package Part_I.Module_03.Ex_07_RememberTheseNumbers;


import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
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
        if (!(numbers.size() == 0)){
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            }
        }
        else {
            System.out.println("No numbers added to the list.");
        }
    }
}
