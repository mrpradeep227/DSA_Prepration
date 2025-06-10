package misc;
public class LargestArrayNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 10};
        int maxNum = 0;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println("Largest number in the array is :" + maxNum);
    }
}
