package interview;

//Time Complexity:O(n)
//Auxiliary Space: O(1)

public class MaximunElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 34, 45, 2};
        int maxElement = largestNumber(arr);
        System.out.println("The largest number is : " + maxElement);
    }

    private static int largestNumber(int[] arr) {
        int length = arr.length;
        int max = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
