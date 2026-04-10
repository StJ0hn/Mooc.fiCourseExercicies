package Part_I.Module_03.Ex_28_FirstWords;

import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String text = sc.nextLine();
            if (text.isBlank()){
                break;
            }
            String[] pieces = text.split(" ");
            System.out.println(pieces[0]);
        }
    }
}
