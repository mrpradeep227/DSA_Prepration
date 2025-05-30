package interview;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = new int[99];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != 43) {
                arr[index++] = i;
            }
        }
        int missingNumber = findMissingNumber(arr);
        System.out.println(" Missing Number is :" + missingNumber);
    }

    private static int findMissingNumber(int arr[]) {
        int n = 100;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int item : arr) {
            actualSum += item;
        }
        return expectedSum - actualSum;
    }
}
