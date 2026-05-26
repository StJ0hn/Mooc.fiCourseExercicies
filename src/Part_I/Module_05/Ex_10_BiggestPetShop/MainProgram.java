package Part_I.Module_05.Ex_10_BiggestPetShop;

public class MainProgram {
    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
    }
}
