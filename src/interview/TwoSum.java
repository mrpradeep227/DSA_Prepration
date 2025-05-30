package interview;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, -4, 51, 23, 31};
        int target = -3;
        boolean isVaild = toSumResult(arr, target);
        if (isVaild) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static boolean toSumResult(int[] arr, int target) {
        int n = arr.length;
        int left = 0, right = n - 1;
        Arrays.sort(arr);
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;

    }
}
