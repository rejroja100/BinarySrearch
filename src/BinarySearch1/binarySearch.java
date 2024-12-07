package BinarySearch1;

public class binarySearch {

    int Binary_Search(int[] A, int n, int x) {
        int left, right, middle;
        left = 0;
        right = n - 1;

        while (left <= right) {
            middle = left + (right - left) / 2;

            if (A[middle] == x) {
                return middle; // Return the index of the found element
            }

            if (A[middle] < x) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1; // Element not found
    }
}
