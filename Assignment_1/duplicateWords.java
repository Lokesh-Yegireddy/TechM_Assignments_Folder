// Duplicate word in a sentence
// Duplicate word in a sentence

package Assignment_1;
public class duplicateWords {
	
	    public static void main(String[] args) {
	        String sentence = "This is a test. This test is simple.";
	        sentence = sentence.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
	        String[] words = sentence.split(" ");
	        System.out.println("Duplicate words in the sentence:");
	        for (int i = 0; i < words.length; i++) {
	            if (words[i] == null) continue;
	            boolean isDuplicate = false;
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equals(words[j])) {
	                    isDuplicate = true;
	                    words[j] = null;
	                }
	            }
	            if (isDuplicate) {
	                System.out.println(words[i]);
	            }
	        }
	    }
	}

