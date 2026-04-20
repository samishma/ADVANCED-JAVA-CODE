/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()*/

package stringexercise;
public class NumericCheckDemo {

    // User-defined function to check if string contains only digits
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "12345";

        boolean result = isNumeric(input);

        System.out.println("Input String: " + input);
        System.out.println("Is Numeric: " + result);
    }
}