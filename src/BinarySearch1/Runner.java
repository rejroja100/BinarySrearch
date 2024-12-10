package BinarySearch1;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 9, 4, 8, 5, 66, 56, 98, 34, 12, 87, 150, 34, 98, 56, 100};
        int n = numbers.length;
        Arrays.sort(numbers);

        binarySearch B1 = new binarySearch();

        int result = B1.Binary_Search(numbers, n, 100);

        if (result != -1) {
            System.out.println("The input is present at index " + result + ".");
        } else {
            System.out.println("The input is not present.");
        }
    }
}
