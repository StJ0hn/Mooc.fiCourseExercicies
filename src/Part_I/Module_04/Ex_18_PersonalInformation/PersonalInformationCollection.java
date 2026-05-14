package Part_I.Module_04.Ex_18_PersonalInformation;

import java.util.ArrayList;

public class PersonalInformationCollection {
    private ArrayList<PersonalInformation> informations;

    public PersonalInformationCollection(){
        informations = new ArrayList<PersonalInformation>();
    }

    public void addInformation(PersonalInformation personalInformation){
        informations.add(personalInformation);
    }

    public void listAll(){
        for (PersonalInformation info : informations){
            System.out.println(info);
        }
    }
}
