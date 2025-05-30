package array;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "shiva";
        String str2 = "avihs";
        if (isAnagrams(str1, str2)) {
            System.out.println("String is anagrams");
        } else {
            System.out.println("String is not anagrams");
        }
    }
    private static boolean isAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);
            if (Arrays.equals(charArr1, charArr2)) {
                return true;
            } else {
                return false;
            }
        }
    }

}
