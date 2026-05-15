package Part_I.Module_04.Ex_20_Books;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        while (true){
            System.out.print("Title: ");
            String title = sc.nextLine();
            if (title.isBlank()){
                System.out.println();
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(sc.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(sc.nextLine());
            Book book = new Book(title, pages, publicationYear);
            books.add(book);
        }
        System.out.print("What information will be printed? ");
        String filterCondition = sc.nextLine();
        for (Book book : books){
            if (filterCondition.equals("everything")){
                System.out.println(book);
            } else if (filterCondition.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
