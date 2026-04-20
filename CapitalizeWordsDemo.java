/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()*/

package stringexercise;
public class CapitalizeWordsDemo {

    // User-defined function to capitalize first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world java program";

        String result = capitalizeWords(input);

        System.out.println("Original String: " + input);
        System.out.println("Capitalized String: " + result);
    }
}