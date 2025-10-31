package exercice5;


import java.util.Scanner;

public class Strings {
	
	
	public static void main(String[] args) {
		
		/**
		 * Main function which makes the program run.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word or a phrase:");
		String word3 = scan.nextLine();
		
		System.out.println("Enter a word:");
		String word1 = scan.nextLine();
		
		System.out.println("ENter another word:");
		String word2 = scan.nextLine();
		
		
		
		
		
		checkWordAndIfPalindrome(word3, word1, word2);
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
			System.out.println("The word is a palindrome!");
			System.out.println(phrase);
		} else {
			System.out.println("It's not a palindrome!");
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
 