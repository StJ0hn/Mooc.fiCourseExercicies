package Part_I.Module_04.Ex_08_DecreasingCounter;

public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
