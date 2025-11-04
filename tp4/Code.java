package tp4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Code {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String code = new Random()
	            .ints(0, 10) // Génère un nombre entre 0 et 9.
	            .distinct()  // S'assure que chaque chiffre est unique.
	            .limit(4) //Limite la taille à 4.
	            .mapToObj(String::valueOf) // // Convertit en objet puis en String.
	            .collect(Collectors.joining()); //Concatène en une seul String.
		
		System.out.println(code);
		
		int guess = 0;
		boolean enter2 = false;
		int rightPositionedCounter = 0;
		int wrongPositionedCounter = 0;
		
		
		// Boucle qui gère l'entrée de la réponse de l'utilisateur.
		while (!enter2) {
			System.out.println("Enter a four digits code.");
			guess = scan.nextInt();
			if (String.valueOf(guess).length() != 4) {
				System.out.println("Please enter a four digits code.");
				continue;
			}
			
			// Split en tableau le code à deviner et le code entré. Comme ça ils peuvent être parcourus.
			String[] codeToGuess = String.valueOf(code).split("");
			String[] splittedGuess = String.valueOf(guess).split("");
			
			
			// Parcours le tablaeu codeToGuess et vérifie si les elements a la meme positions sont égaux ou si il contient l'élement en question.
			// Incrémente les counters correspondants.
			for (int i = 0; i < codeToGuess.length; i++) {
				if (splittedGuess[i].equals(codeToGuess[i])) {
					rightPositionedCounter++;
				}
				else if ( Arrays.asList(codeToGuess).contains(splittedGuess[i])) {
					wrongPositionedCounter++;
				}
				
			}
			
			// Condition de victoire si les deux tableaux sont identiques.
			if (Arrays.equals(splittedGuess, codeToGuess)) {
				System.out.println("Bravo!");
				System.out.println("The code was " + code);
				enter2 = true;
			// Condition else qui indique les nombres bien placés et mal placés.
			} else {
				System.out.println("There are " + rightPositionedCounter + " rightly positioned digit(s) and " + wrongPositionedCounter + " wrongly positioned digit(s).");
				rightPositionedCounter = 0;
				wrongPositionedCounter = 0;
			}
			
		}
		
		scan.close();
		
	}
	
	
	
	
}
