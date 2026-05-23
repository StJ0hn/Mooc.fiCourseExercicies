package Part_I.Module_05.Ex_06_OverloadedCounter;

public class MainProgram {
    public static void main(String[] args) {
        Counter counter = new Counter(8);
        counter.increase();
        counter.increase();
        counter.decrease();
        counter.increase(9);
        counter.decrease(9);
        System.out.println(counter.value());
    }
}
