package Part_I.Module_03.Ex_03_IndexOutOfBoundsException;

import java.util.ArrayList;

public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);

        System.out.println(numbers.get(7));
    }
}