package Part_I.Module_05.Ex_10_BiggestPetShop;

public class Person {
    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person(String name) {
        this.name = name;
        this.pet = null;
    }

    public String toString() {
        return name + " has a friend called " + pet.getName() + " (" + pet.getBreed() + ")";
    }
}
