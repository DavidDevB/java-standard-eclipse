package exercice5;

public class Strings {
	
	
	public static void main(String[] args) {
		
		/**
		 * Main function which makes the program run.
		 */
		
		checkWordAndIfPalindrome("Elu par cette crapule", "chien", "chat");
	}
	
	
	public static void checkWordAndIfPalindrome(String phrase, String word1, String word2) {
		
		/**
		 * Function that checks if the phrase contains the word in input and if the phrase is a palindrome.
		 */
		
		if (phrase.contains(word1)) {
			System.out.println("Trouvé!");
			String replacedString = phrase.replace(word1, word2);
			System.out.println(replacedString);
		}
		if (isPalindrome(phrase)) {
			System.out.println("The word is a palyndrom!");
			System.out.println(phrase);
		}
	}
	
	
	public static boolean isPalindrome(String phrase) {
		
		/**
		 * Returns a boolean if the phrase is or not a palindrome.
		 */
		
		String cleaned = phrase.toLowerCase().replace(" ", "");

	    String reversed = reverse(cleaned);

	    return cleaned.equals(reversed);
	}
	
	
	public static String reverse(String str) {
		
		/**
		 *	Recursive function that returns the palindrome of the string. 
		 */
		
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
 