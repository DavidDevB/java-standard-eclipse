package exercice6;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers do you want?:");
		String answer = scan.nextLine();
		
		Integer[] numbers = generateNumbers(Integer.parseInt(answer));
		
		// Créé une ArrayList à partir du tableau d'Integers.
		List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
		System.out.println(list);
		
		System.out.println("The removed number is: " + findMax(list));
		int firstNumber = findMax(list);
		removeMaxNumber(list);
		System.out.println("The removed number is: " +findMax(list));
		int secondNumber = findMax(list);
		int result = firstNumber + secondNumber;
		System.out.println("Total is: " + result);
		
		scan.close();
		
	}
	
	
	public static Integer[] removeMaxNumber(List<Integer> nums) {


		// Retire la nombre maximum de la liste.
		nums.remove(Integer.valueOf(findMax(nums)));
		
		//Recréé un tableau d'Integers à partir de la liste.
		Integer[] array = nums.toArray(new Integer[nums.size()]);
		
		return array;
		
	}
	
	
	public static Integer findMax(List<Integer> nums) {
		
		/**
		 * Retourne le nombre maximum à partir d'un tableau d'Integers.
		 */
		
		int max = nums.get(0);
		
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > max) {
				max = nums.get(i);
			}
		}
		return max;
	}
	
	
	public static Integer[] generateNumbers(int x) {
		/**
		 * Generates an array of Integers from an input which is the number of numbers in the array.
		 */
		Integer[] array = new Integer[x];
		Random random = new Random();
		
		for (int i = 0; i < x; i++) {
			array[i] = random.nextInt(100);
		}
		return array;
	}
}

	
