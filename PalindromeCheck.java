/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome()*/

package StringExercise;
public class PalindromeCheck {

    // User-defined function to check palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Remove punctuation and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check reverse
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(input);

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome: " + result);
    }
}