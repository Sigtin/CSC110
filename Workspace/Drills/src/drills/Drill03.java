package drills;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Drill03 {

	/*
	 * Create a method that prompts the user for a number. This will be the
	 * number of phrases that the user will be asked to enter. Initialize a
	 * class-level array of Strings to that size.
	 */
	public static String[] numOfPhrases;

	public static void prompt() {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int size = 0;
		System.out.print("Please enter a positive whole number: ");

		boolean isValid = true;
		do {
			try {
				input = readRacer.readLine();
				size = Integer.parseInt(input);
				isValid = true;
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print("Please enter a positive whole number: ");
			}
			if (size < 1) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print("Please enter a positive whole number: ");
			} else {
				isValid = true;
			}

		} while (!isValid);
		numOfPhrases = new String[size];
	}

	/*
	 * Create a method that uses a loop to prompt the user for the phrases to be
	 * stored. This method will store each phrase in its own index in the
	 * class-level array. Do not allow the empty string or null as valid input.
	 */

	public static void phrases() {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int i;
		for (i = 0; i < numOfPhrases.length; i++) {
			System.out.print("Please enter the phrases you want to be stored: ");

			boolean isValid = true;
			do {
				try {
					input = readRacer.readLine();
					isValid = true;
				} catch (Exception e) {
					isValid = false;
					System.out.println("Your input was invalid");
					System.out.print("Please enter the phrases you want to be stored: ");
				}

				if (input == null || input.isEmpty()) {
					isValid = false;
					System.out.println("Your input was invalid");
					System.out.print("Please enter the phrases you want to be stored: ");
				} else {
					isValid = true;
				}

			} while (!isValid);

			numOfPhrases[i] = input;

		}		
	}

	/*
	 * Create a method that takes in a String and returns that same String, but
	 * with casing reversed.
	 */

	public static String reverseCasing(String userInput) {
		String input = "";
		char[] chars = userInput.toCharArray();
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] >= 65 && chars[i] <= 90) {
				chars[i] += 32;
			} else if (chars[i] >= 97 && chars[i] <= 122) {
				chars[i] -= 32;
			}
		}
		
		input = String.valueOf(chars);
		return input;
	}

	/*
	 * Create a method that takes in an array of Strings and prints each String
	 * on its own line
	 */
	
	public static void print(String[] userInput) {
		String phrase = "";
		for(int i = 0; i < userInput.length; i++) {
			phrase = userInput[i];
			System.out.println(phrase);
		}
	}

	/*
	 * Create a method that runs the app as follows: Call the first method that
	 * gets the size of the array Call the second method that populates the
	 * array Create a local array of Strings and populate it using the reverse
	 * casing method Print out the original array (using the array printing
	 * method) Print out the reverse-casing array (using the array printing
	 * method)
	 */
	
	public static void run() {
		prompt();
		phrases();
		String[] strings = new String[numOfPhrases.length];
		
		for(int i = 0; i < strings.length; i++) {
			strings[i] = reverseCasing(numOfPhrases[i]);
		}
		
		print(numOfPhrases);
		print(strings);
		
	}
}











