/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome()*/

package StringExercise;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Madam";

        System.out.println("String = " + str);
        System.out.println("Result = " + isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();
        return clean.equals(rev);
    }
}