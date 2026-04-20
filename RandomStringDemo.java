/*Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()*/

package stringexercise;
public class RandomStringDemo {

    // User-defined function to generate random string
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder random = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            random.append(characters.charAt(index));
        }

        return random.toString();
    }

    public static void main(String[] args) {
        int length = 10;

        String result = generateRandomString(length);

        System.out.println("Generated Random String: " + result);
    }
}