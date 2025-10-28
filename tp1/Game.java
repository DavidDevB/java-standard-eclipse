package tp1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Boolean answer = wantToPlay();
		if (!answer) {
			return;
		} else {
			int numberToGet = makeANumber();
			int counter = 0;
			while (true) {
				int numberChosen = chooseANumber();
				if (numberChosen < numberToGet) {
					System.out.println("It's more!");
					counter++;
				}
				else if (numberChosen > numberToGet) {
					System.out.println("It's less!");
					counter++;
				} else {
					System.out.println("Bravo! You guessed right! The number was " + numberToGet + "!");
					System.out.println("Vous avez trouvé en " + counter + " coups!");
					scan.close();
					return;
				}
			}
		}
	}
		
	
	public static boolean wantToPlay() {
		while (true) {
			System.out.println("Do you want to play a game? Y/n");
			String answer = scan.nextLine();
			if (answer.toLowerCase().equals("y")) {
				return true;
			}
			else if (answer.toLowerCase().equals("n")) {
				return false;
			}
			else {
				System.out.println("Please enter a correct answer.");
			}
		}
		
	}
	
	
	public static int makeANumber() {
		return ThreadLocalRandom.current().nextInt(1, 101);
	}
	
	
	public static int chooseANumber() {
		while (true) {
			System.out.println("Choose a number between 1 and 100: ");
			String answer = scan.nextLine();
			 try {
		            int number = Integer.parseInt(answer);

		            if (number < 1) {
		                System.out.println("Number is too low!");
		            } else if (number > 100) {
		                System.out.println("Number is too high!");
		            } else {
		                return number;
		            }

		        } catch (NumberFormatException e) {
		            System.out.println("Must be an integer!");
		        }
			
		}
	}
	
	
}

	
		