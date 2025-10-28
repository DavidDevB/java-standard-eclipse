package exercice4;

import java.util.Scanner;

public class Grades {
	
	
	
	public static void main(String[] args) {
		
		int[] grades = { 12, 15, 16, 13, 10, 17, 9, 12, 20, 11 };
		
		System.out.println("La note maximale est " + findMin(grades));
		System.out.println("La note minimale est " + findMax(grades));
		System.out.println("La moyenne est " + findAverage(grades));
			
	}
	
	public static int findMin(int[] grades) {
		int min = grades[0];
		for (int i = 0; i < grades.length; i++) {
			
			if (grades[i] < min) {
				min = grades[i];
			}
		}
		return min;
	}
	
	
	public static int findMax(int[] grades) {
		int max = grades[0];
		for (int i = 0; i < grades.length; i++) {
			
			if (grades[i] > max) {
				max = grades[i];
			}
		}
		return max;
	}
	
	
	public static int findAverage(int[] grades) {
		int total = 0;
		for (int i = 0; i < grades.length; i++) {
			total += grades[i];
		}
		return total / grades.length; 
	}
	
	
	public static String[] getName() {
		Scanner scan = new Scanner(System.in);
		boolean answered = false;
		String lastname = "";
		String firstname = "";
		while (!answered) {
			System.out.println("What is your lastname?");
			lastname = scan.nextLine();
			boolean invalid = false;
			for (char c: lastname.toCharArray()) {
				if (Character.isDigit(c)) {
					System.out.println("Please enter only letters.");
				}
				invalid = true;
			}
			
			if (invalid) continue;
			
			System.out.println("What is your firstname?");
			firstname = scan.nextLine();
			for (char c: firstname.toCharArray()) {
				if (Character.isDigit(c)) {
					System.out.println("Please enter only letters.");
					
				}
			}
			
			if (invalid) continue;
			
			answered = true;
			
			
		}
		scan.close();
		return new String[] { firstname, lastname };
		
	}
}
