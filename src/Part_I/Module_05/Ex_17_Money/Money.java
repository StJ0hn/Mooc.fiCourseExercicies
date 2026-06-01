package Part_I.Module_05.Ex_17_Money;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition){
        Money newMoney = new Money(euros + addition.euros, cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared){
        Money newMoney = new Money(euros, cents);
        if (newMoney.euros < compared.euros){
            return true;
        }
        if (newMoney.euros == compared.euros && newMoney.cents < compared.cents){
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser){
        Money newMoney = new Money(euros - decreaser.euros, cents - decreaser.cents);
        if (newMoney.euros < 0)
            newMoney = new Money(0,0);
        return newMoney;
    }
}
