package exercice4;

public class Notes {
	
	
	
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
}
