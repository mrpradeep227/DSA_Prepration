package array;

public class CountWords {

    public static void main(String[] args) {
        String str = "This is a Java interview question";
        String[] words = str.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }

}
