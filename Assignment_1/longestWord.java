// Longest string in a sentence

package Assignment_1;

public class longestWord {

	    public static void main(String[] args) {
	        String sentence = "This is a simple sentence with some reallylongword in it";

	        String[] words = sentence.split(" ");
	        String longestWord = "";

	        for (String word : words) {
	            if (word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }

	       
	        System.out.println("Longest word: " + longestWord);
	    }
	}


