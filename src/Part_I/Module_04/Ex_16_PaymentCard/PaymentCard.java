package Part_I.Module_04.Ex_16_PaymentCard;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance){
        balance = openingBalance;
    }

    public void eatAffordably() {
        if (balance != 0){
            balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (balance != 0){
            balance -= 4.60;
        }
    }

    public void addMoney(double amount){
        if (amount < 0){
            return;
        }
        balance += amount;
        if (balance > 150){
            balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
