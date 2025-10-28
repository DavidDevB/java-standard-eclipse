package exercice3;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class Loop {
	public static boolean containsNumbersPatternMatcher(String input) {
        /**
         * Checks if an input matches the regex pattern. Returns a boolean.
         */
        Pattern p = Pattern.compile("^-?\\d+$");
        Matcher m = p.matcher(input);
        return m.matches();
    }
    
    public static void main(String [] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            /**
             * First, allow the user to enter an integer as an argument when executing the program.
             */
            if (args.length == 1) {
                if (containsNumbersPatternMatcher(args[0])) {
                    numbers.add(Integer.parseInt(args[0]));
                    break;
                }
                else {
                    throw new IllegalArgumentException("Enter an integer");
                }
            }
            else if (args.length > 1) {
            	/**
            	 * Loop through the different arguments and add them to the ArrayList if they are integers
            	 */
            	for (int i = 0; i < args.length; i++) {
            		if (containsNumbersPatternMatcher(args[i])) {
                        numbers.add(Integer.parseInt(args[i]));
                        break;
                    }
            	}
            }
            else {
                /**
                 * If there is no argument, asks the user to enter a number.
                 */
                Scanner scan = new Scanner(System.in);
                while (true) {
                System.out.println("Enter an integer: ");
                    if (scan.hasNextInt()) {
                       numbers.add(scan.nextInt());
                        break;
                    } else {
                        System.out.println("Please enter an integer.");
                        scan.next();
                    }
                }
                scan.close();
                break;
            }
        }
        
        /**
         * Conditions that checks if the number is positive, negative, equal to zero and odd or even.
         * Prints the results.
         */
        for (int i = 0; i < numbers.size(); i++) {
        	String is_pos_or_neg;
            if (numbers.get(i) < 0) {
                is_pos_or_neg = "negative";
            }
            else if (numbers.get(i) == 0) {
                is_pos_or_neg = "zero";
            }
            else {
               is_pos_or_neg = "positive";
            }
            String is_even_or_odd;
            if (numbers.get(i) % 2 == 0) {
                is_even_or_odd = "even";
            }
            else {
                is_even_or_odd = "odd";
            }
            if (is_pos_or_neg == "zero") {
                System.out.println(numbers.get(i) + " is " + is_pos_or_neg);
            }
            else {
                System.out.println(numbers.get(i) + " is " + is_pos_or_neg + " and " + is_even_or_odd);
            }
        }
    }
        
}
