package Part_I.Module_02.Ex_26_DivisibleByThree;

public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int first, int second){
        for (int i = first; i <= second; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
