package Part_I.Module_02.Ex_30_Smallest;

public class Smallest {
    public static void main(String[] args) {
        int answer = smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }

    public static int smallest(int number1, int number2) {
        if (number2 < number1){
            return number2;
        }
        return number1;
    }
}
