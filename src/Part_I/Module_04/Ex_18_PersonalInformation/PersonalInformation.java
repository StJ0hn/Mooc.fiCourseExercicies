package Part_I.Module_04.Ex_18_PersonalInformation;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private String identificationNumber;

    public PersonalInformation(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
