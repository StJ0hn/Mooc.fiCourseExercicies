package Part_I.Module_03.Ex_26_LineByLine;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] pieces = text.split(" ");
        for (String piece : pieces) {
            System.out.println(piece);
        }
    }
}
