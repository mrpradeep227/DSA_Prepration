package array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int n = arr.length + 1;
        int actualSum = 0;
        int expectedSum = n * (n + 1) / 2;
        for (int item : arr) {
            actualSum += item;
        }
        System.out.println(expectedSum - actualSum);
    }
}
