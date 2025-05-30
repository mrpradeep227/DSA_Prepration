import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();
        String revStr = new StringBuilder(str).reverse().toString();
        if(str.equals(revStr)){
            System.out.println("String is a palindrome: "+ str);
        }else {
            System.out.println("String is not a palindrome: " + str);
        }
    }
}
