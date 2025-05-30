package interview;
//Time Complexity:O(n)
//Auxiliary Space: O(1)
public class MovesZeros {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 20, 23, 3, 0, 2, 0};
        moveToZeroToEnd(arr);
        for (int item : arr) {
            System.out.println(item);
        }
    }

    private static void moveToZeroToEnd(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
    }

//    public void moveZerosToStart(int[] arr) {
//        int insertPos = arr.length - 1;
//
//        // Fill from the end with non-zero elements
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] != 0) {
//                arr[insertPos--] = arr[i];
//            }
//        }
//
//        // Fill the beginning with zeros
//        while (insertPos >= 0) {
//            arr[insertPos--] = 0;
//        }
//    }
}
