/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
*/

package StringExercise;
public class NullOrEmptyCheck {

    // User-defined function
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {

        String str1 = "";
        String str2 = "   ";
        String str3 = null;
        String str4 = "Hello";

        System.out.println("String 1 is null or empty: " + isNullOrEmpty(str1)); // true
        System.out.println("String 2 is null or empty: " + isNullOrEmpty(str2)); // true
        System.out.println("String 3 is null or empty: " + isNullOrEmpty(str3)); // true
        System.out.println("String 4 is null or empty: " + isNullOrEmpty(str4)); // false
    }
}