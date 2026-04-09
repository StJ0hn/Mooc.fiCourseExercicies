package Part_I.Module_03.Ex_21_PrintNeatly;

public class PrintNeatly {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
    public static void printNeatly(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (array[i] != array[array.length - 1]){
                System.out.print(", ");
            }
        }
    }
}