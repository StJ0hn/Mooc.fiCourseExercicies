package Part_I.Module_02.Ex_33_StarSign;

public class StarSign {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public static void printSquare(){
        for (int i = 0; i < 4; i++) {
            printStars(4);
        }
    }

    public static void printRectangle(int length, int height) {
        for (int i = 0; i < height; i++) {
            printStars(length);
        }
    }

    public static void printTriangle(int size){
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}
