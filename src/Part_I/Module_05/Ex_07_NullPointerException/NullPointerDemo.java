package Part_I.Module_05.Ex_07_NullPointerException;

public class NullPointerException {
    public static void main(String[] args) {
        Person joan = new Person("Joan Ball");
        System.out.println(joan);

        joan = null;
        joan.growOlder();
    }
}
