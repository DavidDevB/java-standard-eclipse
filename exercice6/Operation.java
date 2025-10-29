package exercice6;

public class Operation {
	
	public static void main(String[] args) {
		
		System.out.println(Add(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		
		System.out.println(Sub(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		
		System.out.println(Mul(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		
		while (true) {
			if (Integer.parseInt(args[1]) == 0) {
				System.out.print("Can't divide by zero.");
				break;
			}
			System.out.println(Div(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
			break;
		}
	
	}
	
	
	public static int Add(int num1, int num2) {
		return num1 + num2;
	}
	
	
	public static int Sub(int num1, int num2) {
		return num1 - num2;
	}
	
	
	public static int Mul(int num1, int num2) {
		return num1 * num2;
	}
	
	
	public static float Div(int num1, int num2) {
		return (float) num1 / num2;
	}
	
}
