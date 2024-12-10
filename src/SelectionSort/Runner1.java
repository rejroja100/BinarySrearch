package SelectionSort;

import java.util.Arrays;

public class Runner1 {

    public static void main(String[] args) {
        SelectionSort Se = new SelectionSort();

        int[] numbers = {1, 3, 9, 4, 8, 5, 66, 56, 98, 34, 12, 87, 150, 34, 98, 56, 100};
        int count = numbers.length;

       int[] p = Se.selection(numbers, count);
        System.out.println(Arrays.toString(p));
    }
}
