package interview;

//Time Complexity:O(n)
//Auxiliary Space: O(1)

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {2, 37, 34, 54, 3, 4, 5, 2};
        System.out.println(peakElement(arr));
    }

    static int peakElement(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return 0;
        }
        if (arr[0] > arr[1]) {
            return 0;
        }

        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        int low = 1, high = n - 2;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid] + 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return 0;
    }
}
