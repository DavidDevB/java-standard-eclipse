package tp4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
			System.out.println("Enter a four digits code:");
			
			
			// Vérifie que l'entrée est bien un entier.
			if (scan.hasNextInt()) {
	            guess = scan.nextInt();
	        } else {
	            System.out.println("It's not an integer !");
	            scan.next();
	        }
			
			// Vérifie que le nombre est bien composé de 4 et 4 chiffres seulement.
			if (String.valueOf(guess).length() != 4) {
				System.out.println("Enter four digits please.");
				continue;
			}
			
			//Vérifie si le guess a que des chiffres différents.
			if (!hasUniqueDigits(guess)) {
				System.out.println("Enter only unique digits.");
				continue;
			}
			
			// Split en tableau le code à deviner et le code entré. Comme ça ils peuvent être parcourus.
			String[] codeToGuess = String.valueOf(code).split("");
			String[] splittedGuess = String.valueOf(guess).split("");
			
			
			// Parcours le tableau codeToGuess et vérifie si les elements a la même positions sont égaux ou si il contient l'élement en question.
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
	
	
	public static boolean hasUniqueDigits(int number) {

        boolean[] digitSeen = new boolean[10];
        while (number > 0) {
            int digit = number % 10; // utilise le dernier digit du nombre.
            if (digitSeen[digit]) {
                return false; // Si c'est déjà true dans le tableau de booléens retourne false.
            }
            digitSeen[digit] = true; // Retourne true si pas d'occurrence déjà trouvée.
            number /= 10; // Supprime le dernier digit et passe au nombre restant.
        }
        return true; 
    }
	
	public static boolean containsNumbersPatternMatcher(String input) {
        /**
         * Checks if an input matches the regex pattern. Returns a boolean.
         */
        Pattern p = Pattern.compile("^-?\\d+$");
        Matcher m = p.matcher(input);
        return m.matches();
    }
    
	
	
	
}
