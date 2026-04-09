package Part_I.Module_03.Ex_22_PrintInStars;

public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array){
        for (int i = 0; i < array.length; i++) {
            int quantity = array[i];
            for (int j = 0; j < quantity; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
