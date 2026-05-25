package Part_I.Module_05.Ex_09_CardPayments;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        if (increase > 0){
            this.balance = this.balance + increase;
        }
    }

    public boolean takeMoney(double amount) {
        if (amount > 0 && amount > balance()){
            return false;
        }
        this.balance -= amount;
        return true;
    }
}
