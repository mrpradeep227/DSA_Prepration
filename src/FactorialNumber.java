import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial*=i;
        }
        System.out.println("Factorial of number is :"+ factorial);
    }
}
