package Part_I.Module_02.Ex_23_FromOneToParameter;

public class FromOneToParameter {
    public static void main(String[] args){
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number){
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
