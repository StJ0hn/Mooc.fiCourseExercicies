package Part_I.Module_02.Ex_31_Greatest;

public class Greatest {
    public static void main(String[] args) {
        int answer =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
    public static int greatest(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3){
            return number1;
        }
        else if (number2 > number1 && number2 > number3) {
            return number2;
        }
        else if (number1 == number2 ) {
            return number1;
        }
        else if (number2 == number3) {
            return number3;
        }
        else if (number1 == number3) {
            return number3;
        } else {
            return number3;
        }
    }
}
