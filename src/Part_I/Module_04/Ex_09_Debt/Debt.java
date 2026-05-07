package Part_I.Module_04.Ex_09_Debt;

public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double intialBalance, double interestRate) {
        this.balance = intialBalance;
        this.interestRate = interestRate;
    }

    public void printBalance(){
        System.out.println(balance);
    }

    public void waitOneYear(){
        balance = balance * interestRate;
    }
}
