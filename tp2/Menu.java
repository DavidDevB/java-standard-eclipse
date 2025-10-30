package tp2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello, how many menus do you want?");
		int nbOfMenus = scan.nextInt();
		
		String[] entries = {"SALAD", "SOUP", "QUICHE", "NONE"};
		String[] dishes = {"CHICKEN", "BEEF", "FISH", "VEGETARIAN", "VEGAN", "NONE"};
		String[] trimmings = {"RICE", "NOODLES", "FRIES", "VEGETABLES", "NONE"};
		String[] drinks = {"TAP WATER", "SPARKLING WATER", "SODA", "WINE", "NONE"};
		String[] desserts = {"HOMEMADE TART", "CHOCOLATE MOUSSE", "TIRAMISU", "NONE"};
		
		// Create a new empty list of list of strings.
		List<List<String>> finalMenus = new ArrayList<>();
	
		// Loop in number of menus.
		for (int i = 0; i < nbOfMenus; i++) {
			
			// Add a new empty list in the list.
			finalMenus.add(new ArrayList<>());
			
			System.out.println("Order " + (i + 1));
			
			// Ask what entry you want by looping in the array of entries.
			System.out.println("Entries choices:");
			for (int j = 0; j < entries.length; j++) {
				System.out.print("[" + (j + 1)  + " - " + entries[j] + "]");
			}
			System.out.println("Which entry do you want?");
			int whichEntry = scan.nextInt();
			finalMenus.get(i).add(entries[whichEntry - 1].toLowerCase());
			
			// Ask what entry you want by looping in the array of dishes.
			System.out.println("Dishes choices:");
			for (int j = 0; j < dishes.length; j++) {
				System.out.print("[" + (j + 1) + " - " + dishes[j] + "]");
			}
			System.out.println("Which dish do you want?");
			int whichDish = scan.nextInt();
			finalMenus.get(i).add(dishes[whichDish - 1].toLowerCase());
			
			// Ask what entry you want by looping in the array of trimmings.
			System.out.println("Trimmings choices:");
			for (int j = 0; j < trimmings.length; j++) {
				System.out.print("[" + (j + 1) + " - " + trimmings[j] + "]");
			}
			System.out.println("Which dish do you want?");
			int whichTrimming = scan.nextInt();
			finalMenus.get(i).add(trimmings[whichTrimming - 1].toLowerCase());
			
			// Ask what entry you want by looping in the array of drinks.
			System.out.println("Drinks choices:");
			for (int j = 0; j < drinks.length; j++) {
				System.out.print("[" + (j + 1) + " - " + drinks[j] + "]");
			}
			System.out.println("What do you want to drink?");
			int whichDrink = scan.nextInt();
			finalMenus.get(i).add(drinks[whichDrink - 1].toLowerCase());
			
			// Ask what entry you want by looping in the array of desserts.
			System.out.println("Desserts choices:");
			for (int j = 0; j < desserts.length; j++) {
				System.out.print("[" + (j + 1) + " - " + desserts[j] + "]");
			}
			System.out.println("What do you want for dessert?");
			int whichDessert = scan.nextInt();
			finalMenus.get(i).add(desserts[whichDessert - 1].toLowerCase());
			
			System.out.println("Command " + (i + 1) + " summary:");
			System.out.println(finalMenus.get(i));
		}
		scan.close();
	}
	
	
}
