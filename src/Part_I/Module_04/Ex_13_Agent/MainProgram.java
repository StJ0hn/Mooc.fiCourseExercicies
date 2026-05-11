package Part_I.Module_04.Ex_13_Agent;

public class MainProgram {
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }
}
