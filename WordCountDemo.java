/*Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()*/

package stringexercise;
public class WordCountDemo {

    // User-defined function to count words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String input = "Hello world java program";

        int result = countWords(input);

        System.out.println("Input String: " + input);
        System.out.println("Word Count: " + result);
    }
}