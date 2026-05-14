package Part_I.Module_04.Ex_18_PersonalInformation;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        PersonalInformationCollection personalInformationCollection = new PersonalInformationCollection();
        while (true){
            System.out.print("First name: ");
            String firstName = sc.nextLine();
            if (firstName.isBlank()){
                System.out.println();
                break;
            }
            System.out.print("Last name: ");
            String lastName = sc.nextLine();
            System.out.print("Identification number: ");
            String identificationNumber = sc.nextLine();
            PersonalInformation personalInformation = new PersonalInformation(firstName, lastName, identificationNumber);
            personalInformationCollection.addInformation(personalInformation);
        }
        personalInformationCollection.listAll();
    }
}
