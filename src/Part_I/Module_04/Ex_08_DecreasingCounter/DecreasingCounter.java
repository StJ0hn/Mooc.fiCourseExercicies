package Part_I.Module_04.Ex_08_DecreasingCounter;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        this.value = this.value - 1;
        if (this.value < 1){
            this.value = 0;
        }
    }

    public void reset() {
        this.value = 0;
    }
}
