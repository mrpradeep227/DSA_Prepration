package interview;

//Time Complexity:O(n)
//Auxiliary Space: O(1)

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, 213, 12, 3, 22};
        System.out.println(thirdLargest(arr));
    }
    private static int thirdLargest(int[] arr) {
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        return third;
    }
}
