//  Program on substring, split, charAt, toString

package Assignment_1;
public class stringMethods {
    public static void main(String[] args) {
        // Original String
        String original = "Hello, Loki! Welcome to the world of programming.";

        // 1. substring(): Extract part of the string
        String greeting = original.substring(0, 12); // Extract "Hello, Loki!"
        System.out.println("Substring: " + greeting);

        // 2. split(): Split the string into parts based on a delimiter
        String[] words = original.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }

        // 3. charAt(): Access a specific character by its index
        char firstChar = original.charAt(0); // First character
        System.out.println("Character at index 0: " + firstChar);

        // 4. toString(): Convert a primitive or object to a String
        int number = 2025;
        String numberAsString = Integer.toString(number); // Convert integer to string
        System.out.println("Number as String: " + numberAsString);

        // 5. valueOf(): Convert primitive or object to a string
        double pi = 3.14159;
        String piAsString = String.valueOf(pi); // Convert double to string using valueOf()
        System.out.println("Pi as String (valueOf): " + piAsString);

        // Combine these methods
        String message = "Hey Loki! The year is " + String.valueOf(number).charAt(2) + " and Pi starts with " + piAsString.substring(0, 4);
        System.out.println(message);
    }
}
