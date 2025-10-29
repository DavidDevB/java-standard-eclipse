package exercice6;

public class Triangle {
	
	public static void main (String[] args) {
		
		/*
		 * First method to draw a triangle in the console.
		 */
		
		System.out.println("      *      ");
		System.out.println("     ***     ");
		System.out.println("    *****    ");
		System.out.println("   *******   ");
		System.out.println("  *********  ");
		System.out.println(" *********** ");
		System.out.println("*************");
		
			
		/*
		 * Second method to draw a triangle in the console.
		 */
			
		StringBuilder result = new StringBuilder();
		String str = "*";
		result.append(str);
		System.out.println("      " + result + "      ");
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 3; j++) {
				result.append(str);
			}
			String spaces = new String(new char[6 - i]).replace("\0", " ");
			System.out.println(spaces + result + spaces);
		}
		return;
	}
}
