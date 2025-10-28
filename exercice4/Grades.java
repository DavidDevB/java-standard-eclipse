package exercice4;

import java.util.Scanner;

public class Grades {
	
	
	public static void main(String[] args) {
		
		/*int[] grades = { 12, 15, 16, 13, 10, 17, 9, 12, 20, 11 };
		System.out.println("Minimal grade is " + findMin(grades));
		System.out.println("Maximal grade is " + findMax(grades));
		*/
		
		boolean students = true;
		Scanner scan = new Scanner(System.in);
		
		while (students) {
			String[] names = getNames();
			
			System.out.println("What are your grades?");
			String grades = scan.nextLine();
			String[] gradesArray = grades.split(" ");
			
			System.out.println(names[0] + " " + names[1] + ", your average is " + findAverageFromStudent(gradesArray));
			
			while (true) {
				System.out.println("Add a student?: Y/n");
				String doYouContinue = scan.nextLine();
				
				if (doYouContinue.equalsIgnoreCase("y")) {
					break;
				} else if (doYouContinue.equalsIgnoreCase("n")){
					students = false;
					break;
					
				} else {
					System.out.println("Enter 'Y' or 'n'");
				}
			}
		}
		scan.close();
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
	
	
	public static float findAverage(int[] grades) {
		int total = 0;
		for (int i = 0; i < grades.length; i++) {
			total += grades[i];
		}
		return (float) total / grades.length; 
	}
	
	
	public static String[] getNames() {
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
					invalid = true;
					break;
				}
			}
			
			if (invalid) continue;
			
			System.out.println("What is your firstname?");
			firstname = scan.nextLine();
			for (char c: firstname.toCharArray()) {
				if (Character.isDigit(c)) {
					System.out.println("Please enter only letters.");
					invalid = true;
					break;
				}
			}
			
			if (invalid) continue;
			
			answered = true;
			
		}
		return new String[] { firstname, lastname };
	}

	
	public static float findAverageFromStudent(String[] grades) {
		int[] intGrades = new int[grades.length];
		
		for (int i = 0; i < grades.length; i++) {
			intGrades[i] = Integer.parseInt(grades[i]);
		}
		return findAverage(intGrades);
	}
}
