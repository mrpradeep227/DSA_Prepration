package interview;
//Time Complexity:O(n)
//Auxiliary Space: O(n)
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        HashSet<Integer> unique = new HashSet<>();
        for (int item : arr) {
            unique.add(item);
        }
        System.out.println("Unique elments in the array:"+unique);
        scanner.close();
    }
}
