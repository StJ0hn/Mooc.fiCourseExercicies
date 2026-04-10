package Part_I.Module_03.Ex_27_AvClub;

import java.util.Scanner;

public class AvClub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String text = sc.nextLine();
            if (text.isEmpty()){
                break;
            }
            String[] pieces = text.split(" ");
            for (String piece : pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }
        }
    }
}
