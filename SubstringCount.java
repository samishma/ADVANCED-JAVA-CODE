/*Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences() ans from the above code*/

package StringExercise;

public class SubstringCount {

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }
        return (mainString.length() - mainString.replace(subString, "").length()) 
                / subString.length();
    }

    public static void main(String[] args) {
        String main = "hello hello world";
        String sub = "hello";

        int result = countOccurrences(main, sub);

        System.out.println("Main String: " + main);
        System.out.println("Substring: " + sub);
        System.out.println("Occurrences: " + result);
    }
}