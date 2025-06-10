package misc;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number= scanner.nextLine();
        int num=Integer.parseInt(number);
        if(num%2==0){
            System.out.println("Number is not prime:" + num);
        }else{
            System.out.println("Number is prime:" + num);
        }
    }
}
