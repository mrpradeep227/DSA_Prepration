package misc;
public class GCD_Of_Number {
    public static void main(String[] args) {
        int a = 45;
        int b = 23;
        GCDofTwo(a, b);
    }
    private static void GCDofTwo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
    }
}
