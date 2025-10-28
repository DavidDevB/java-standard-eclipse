package exercice4;

public class Notes {
	
	
	
	public static void main(String[] args) {
		
		int[] notes = { 12, 15, 16, 13, 10, 17, 9, 12, 20, 11 };
		
		findMin(notes);
		findMax(notes);
		findAverage(notes);
		
		
	}
	
	public static int findMin(int[] args) {
		int min = args[0];
		for (int i = 0; i < args.length; i++) {
			
			if (args[i] < min) {
				min = args[i];
			}
		}
		return min;
	}
	
	
	public static int findMax(int[] args) {
		int max = args[0];
		for (int i = 0; i < args.length; i++) {
			
			if (args[i] > max) {
				max = args[i];
			}
		}
		return max;
	}
	
	
	public static int findAverage(int[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += args[i];
		}
		return total / args.length; 
	}
}
