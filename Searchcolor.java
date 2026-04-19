/* 1.Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not 
( Hint : Use ArrayListObj.contains() ) 
*/
package arrayList;
import java.util.*;

public class Searchcolor {

	    public static void main(String[] args) {

	        // Creating ArrayList
	        List<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Orange");
	        colors.add("Green");
	        colors.add("Pink");
	        colors.add("Red");

	        // Displaying list
	        System.out.println("Colors: " + colors);

	        // Searching for "Red"
	        if(colors.contains("Red")) {
	            System.out.println("Red is available");
	        } else {
	            System.out.println("Red is not available");
	        }
	    }
	}