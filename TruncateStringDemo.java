/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()*/

package stringexercise;
public class TruncateStringDemo {

    // User-defined function to truncate string and add ellipsis
    public static String truncate(String str, int maxLength) {
        if (str == null) {
            return null;
        }

        return str.length() > maxLength ? str.substring(0, maxLength) + "..." : str;
    }

    public static void main(String[] args) {
        String input = "Hello World";

        String result = truncate(input, 5);

        System.out.println("Original String: " + input);
        System.out.println("Truncated String: " + result);
    }
}