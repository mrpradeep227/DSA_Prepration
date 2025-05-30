package array;

import static java.lang.Integer.MIN_VALUE;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {21, 23, 1, 3, 5, 7};
        int largest = MIN_VALUE;
        int secondLargest = MIN_VALUE;

        for (int item : arr) {
            if (item > largest) {
                secondLargest = largest;
                largest = item;
            } else if (item > secondLargest && item != largest) {
                secondLargest = item;
            }
        }

    }
}
