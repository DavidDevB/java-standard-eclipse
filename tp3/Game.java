package tp3;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {
		
		// Generates a word to guess.
		String word = getWord();
		
		// Loop which displays the undiscovered word.
		System.out.println("The word to guess: ");
		for (int i = 0; i < word.length() - 1; i++) {
			System.out.print("_ ");
		}
		System.out.println("_ ");
		System.out.println(" ");
		
		
		// Opening scanner.
		Scanner scan = new Scanner(System.in);
		boolean wordIsCompleted = false;
		
		//Creating one list which will contain the found letters and one which will contain the wrong guessed letters.
		List<String> foundLetters = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
		    foundLetters.add("_ ");
		}
		List<String> wrongLetters = new ArrayList<>();
		int counter = 0;
		
		// Loop of the main game.
			while( wordIsCompleted == false) {
				
				
				// Entering a letter and only one letter.
				System.out.println("Enter a letter:");
				String letter = scan.nextLine().toLowerCase();
				if (!letter.matches("^[a-zA-Z]+$")) {
					System.out.println("Enter only letters!");
					continue;
				}
				if (letter.length() > 1 || letter.length() < 1) {
					System.out.println("Enter one letter!");
					continue;
				}
				
				// For loop that checks if the letter is contained in the word to guess.
				for (int i = 0; i < word.length(); i++){
					if (word.charAt(i) == letter.charAt(0)) {
						foundLetters.set(i, letter + " ");
					}
					else if (!word.contains(letter)){
						wrongLetters.add(i, letter);
						counter++;
						break;
					}
				}

				if (counter == 10) {
					System.out.println("You lose!");
					break;
				}
				System.out.println(String.join("", foundLetters));
				System.out.println(" ");
				System.out.println((10 - counter) + "tries left!");
				System.out.println(" ");
				System.out.println("Used letters: " + wrongLetters);
				System.out.println("----------------------");

				// Condition that checks if the guessed right letters are equal to the word to guess.
				if (String.join("", foundLetters).replace(" ", "").equals(word)) {
					System.out.println("Congrats!");
					wordIsCompleted = true;
				}
			}
		scan.close();
	}
	
	public static String getWord() {
		
		// Picks a random word in the array of words.
		String [] words = {"voiture", "maison", "canapé", "chien", "frigo", "ordinateur", "scooter", "pantalon", "assiette", "shampoing" };
		return words[new Random().nextInt(words.length)];
	}
	
	
}
