package Part_I.Module_03.Ex_25_Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String userPassword = sc.nextLine();
        if ((userName.equals("alex") && userPassword.equals("sunshine")) || (userName.equals("emma") && userPassword.equals("haskell"))){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
