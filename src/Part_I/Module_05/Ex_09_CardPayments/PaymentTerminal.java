package Part_I.Module_05.Ex_09_CardPayments;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50){
            double change = payment - 2.50;
            money += 2.50;
            affordableMeals++;
            return change;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card){
        if (card.balance() >= 2.50){
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30){
            double change = payment - 4.30;
            money += 4.30;
            heartyMeals++;
            return change;
        }
        return payment;
    }

    public boolean eatHeartily(PaymentCard card){
        if (card.balance() >= 4.30){
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        money += sum;
        card.addMoney(sum);
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
