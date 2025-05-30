package array;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 14, 5, 6, 7, 12};
        boolean isSorted=isSortd(arr);
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isSortd(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
