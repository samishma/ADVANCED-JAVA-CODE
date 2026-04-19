/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()*/

package StringExercise;

public class RemoveWhitespaceDemo {

	    // User-defined function to remove all whitespace
	    public static String removeWhitespace(String str) {
	        return str == null ? null : str.replaceAll("\\s", "");
	    }

	    public static void main(String[] args) {
	        String input = "Hello World Java Program";

	        String result = removeWhitespace(input);

	        System.out.println("Original String: " + input);
	        System.out.println("After Removing Whitespace: " + result);
	    }
	}