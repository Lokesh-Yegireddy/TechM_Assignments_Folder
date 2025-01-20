package Assignment_1;

public class replaceMethodDemo 
{
	public static void main(String[] args) {
	        // Original String
	        String original = "Hello Loki, Loki is learning Java. Loki loves coding!";

	        // 1. replace(): Replaces all occurrences of a specific character or string
	        String replaceChar = original.replace('L', 'P'); // Replace 'L' with 'P'
	        System.out.println("After replace (char): " + replaceChar);

	        String replaceWord = original.replace("Loki", "Thor"); // Replace "Loki" with "Thor"
	        System.out.println("After replace (String): " + replaceWord);

	        // 2. replaceAll(): Replaces all substrings that match a regex pattern
	        String replaceAllWords = original.replaceAll("Loki", "Thor"); // Same as replace, but supports regex
	        System.out.println("After replaceAll (String with regex): " + replaceAllWords);

	        String replaceWithRegex = original.replaceAll("\\bLoki\\b", "Thor"); // Replace only "Loki" as a whole word
	        System.out.println("After replaceAll (with regex word boundary): " + replaceWithRegex);

	        // 3. Practical example: Replace digits with asterisks
	        String stringWithNumbers = "Loki123 is coding in 2025!";
	        String replaceDigits = stringWithNumbers.replaceAll("\\d", "*"); // Replace all digits with '*'
	        System.out.println("After replaceAll (digits with *): " + replaceDigits);

	        // 4. Remove all non-alphanumeric characters
	        String specialChars = "Hello, Loki! Are you ready for Java?";
	        String removeSpecialChars = specialChars.replaceAll("[^a-zA-Z0-9 ]", ""); // Remove non-alphanumeric characters
	        System.out.println("After replaceAll (remove special characters): " + removeSpecialChars);
	    }
	}


