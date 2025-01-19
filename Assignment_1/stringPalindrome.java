// Strings palindrome

package Assignment_1;
public class stringPalindrome 
{
 public static void main(String[] args)
 {
	        String originalStr = "amma";
	        String reversedStr = "";

	        // Reverse the string
	        for (int i = originalStr.length() - 1; i >= 0; i--) {
	            reversedStr += originalStr.charAt(i);
	        }

	        System.out.println("Original String: " + originalStr);
	        System.out.println("Reversed String: " + reversedStr);

	        // Check if the strings are palindromes
	        if (originalStr.equals(reversedStr)) {
	            System.out.println(originalStr + " is a palindrome.");
	        } else {
	            System.out.println(originalStr + " is not a palindrome.");
	        }

}
}
