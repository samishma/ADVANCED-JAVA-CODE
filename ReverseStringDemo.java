/*Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().*/

package StringExercise;
public class ReverseStringDemo {

    // User-defined function to reverse a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";

        String result = reverseString(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}