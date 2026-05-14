package Part_I.Module_04.Ex_17_Items;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Items items = new Items();
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            Item item = new Item(name);
            if (name.isBlank()){
                break;
            }
            items.addItem(item);
        }
        items.list();
    }
}
