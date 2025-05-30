package interview;
//Time Complexity:O(n)
//Auxiliary Space: O(1)
public class DutchFlagProblem {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 4, 5, 7, 0, 0, 1, 2, 1};
        sortSimilar(arr);
        for(int item :arr){
            System.out.println("Element of array:"+item);
        }
    }
    static void sortSimilar(int[] arr) {
        int n = arr.length;
        int c0 = 0, c1 = 0, c2 = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                c0 += 1;
            }
            else if (arr[i] == 1) {
                c1 += 1;
            } else {
                c2 += 1;
            }
        }
        for (int i = 0; i < c0; i++) {
            arr[idx++] = 0;
        }
        for (int i = 0; i < c1; i++) {
            arr[idx++] = 1;
        }
        for (int i = 0; i < c2; i++) {
            arr[idx++] = 2;
        }
    }
}
