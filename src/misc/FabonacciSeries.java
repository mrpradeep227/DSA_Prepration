package misc;

import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int a = 0, b = 1;
        System.out.println("Fabonacci series for the number :" + a + " " + b);
        for (int i = 2; i < num; i++) {
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }

    }
}
