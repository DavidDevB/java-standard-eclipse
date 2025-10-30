package exercice7;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		//Open a scanner.
		Scanner scan = new Scanner(System.in);
		
		// Ask for a number.
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		
		// Print the result of factorial of the number entered previously.
		System.out.println((factorial(number)));

		// Close the scanner.
		scan.close();
	}
	
	public static int factorial(int n) {
		/**
		 * Recursive function factorial.
		 */
		if (n < 2) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
