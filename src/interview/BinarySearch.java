package interview;

//Time Complexity: O(log N)
//Auxiliary Space: O(1)

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 5, 10};
        int target = 10;
        int isFound = search(arr, target);
        if (isFound == -1) {
            System.out.println("Element is not present in array ");
        } else {
            System.out.println("Element is present in array at index: " + isFound);
        }

    }

    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

