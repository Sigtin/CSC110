package lib;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleIO {

	// PRO TIP: Make sure to create a new BufferedReader in each method
	// where a BufferedReader is required. Do NOT close the reader as that will
	// cause
	// other issues. Also, catch ALL IOExceptions and NumberFormatExceptions.
	// Do not simply mark the method with a "throws" statement

	/**
	 * Generates a console-based menu using the Strings in options as the menu
	 * items. Reserves the number 0 for the "quit" option when withQuit is true.
	 * 
	 * @param options
	 *            - Strings representing the menu options
	 * @param withQuit
	 *            - adds option 0 for "quit" when true
	 * @return the int of the selection made by the user
	 */
	public static int promptForMenuSelection(String[] options, boolean withQuit) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		int max = options.length;
		int input = 0;
		boolean isValid = true;
		do {
			int min;
			for (int i = 0; i < options.length; i++) {
				System.out.println((i + 1) + ". " + options[i]);
			}
			if (withQuit) {
				System.out.println(0 + ". " + "Exit");
				min = 0;
			} else {
				min = 1;
			}
			try {
				System.out.print("Please enter your selection: ");
				userInput = readRacer.readLine();
				input = Integer.parseInt(userInput);
				isValid = true;
				if (input < min || input > max) {
					isValid = false;
					System.out.println("Your input was invalid");
				}
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
			}
			
				
		} while (!isValid);
		return input;
	}

	/**
	 * Generates a prompt that expects the user to enter one of two responses
	 * that will equate to a boolean value. The trueString represents the case
	 * insensitive response that will equate to true. The falseString acts
	 * similarly, but for a false boolean value. Example: Assume this method is
	 * called with a trueString argument of "yes" and a falseString argument of
	 * "no". If the enters "YES", the method returns true. If the user enters
	 * "no", the method returns false. All other inputs are considered invalid,
	 * the user will be informed, and the prompt will repeat.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param trueString
	 *            - the case insensitive value that will evaluate to true
	 * @param falseString
	 *            - the case insensitive value that will evaluate to false
	 * @return the boolean value
	 */
	public static boolean promptForBool(String prompt, String trueString, String falseString) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput = "";
		System.out.print(prompt);
		boolean isTrue = true;

		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				isValid = true;
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
			if (userInput.equalsIgnoreCase(trueString)) {
				isTrue = true;
				isValid = true;
			} else if (userInput.equalsIgnoreCase(falseString)) {
				isTrue = false;
				isValid = true;
			} else {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}

		} while (!isValid);
		return isTrue;

	}

	/**
	 * Generates a prompt that expects a numeric input representing a byte
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the byte value
	 */
	public static byte promptForByte(String prompt, byte min, byte max) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		byte input = 0;
		System.out.print(prompt);

		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				input = Byte.parseByte(userInput);
				isValid = true;
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
			if (input < min || input > max) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
		} while (!isValid);
		return input;

	}

	/**
	 * Generates a prompt that expects a numeric input representing a short
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the short value
	 */
	public static short promptForShort(String prompt, short min, short max) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		short input = 0;
		System.out.print(prompt);

		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				input = Short.parseShort(userInput);
				isValid = true;
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
			if (input < min || input > max) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
		} while (!isValid);
		return input;
	}

	/**
	 * Generates a prompt that expects a numeric input representing an int
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the int value
	 */
	public static int promptForInt(String prompt, int min, int max) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		int input = 0;
		System.out.print(prompt);

		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				input = Integer.parseInt(userInput);
				isValid = true;
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
			if (input < min || input > max) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
		} while (!isValid);
		return input;

	}

	/**
	 * Generates a prompt that expects a numeric input representing a long
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the long value
	 */
	public static long promptForLong(String prompt, long min, long max) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		long input = 0;
		System.out.print(prompt);

		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				input = Long.parseLong(userInput);
				isValid = true;
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
			if (input < min || input > max) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
		} while (!isValid);
		return input;
	}

	/**
	 * Generates a prompt that expects a numeric input representing a float
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the float value
	 */
	public static float promptForFloat(String prompt, float min, float max) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		float input = 0;
		System.out.print(prompt);

		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				input = Float.parseFloat(userInput);
				isValid = true;
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
			if (input < min || input > max) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
		} while (!isValid);
		return input;
	}

	/**
	 * Generates a prompt that expects a numeric input representing a double
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the double value
	 */
	public static double promptForDouble(String prompt, double min, double max) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		double input = 0;
		System.out.print(prompt);

		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				input = Double.parseDouble(userInput);
				isValid = true;
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
			if (input < min || input > max) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
		} while (!isValid);
		return input;
	}

	/**
	 * Generates a prompt that allows the user to enter any response and returns
	 * the String. When allowEmpty is true, empty responses are valid. When
	 * false, responses must contain at least one character (including
	 * whitespace).
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user.
	 * @param allowEmpty
	 *            - when true, makes empty responses valid
	 * @return the input from the user as a String
	 */
	public static String promptForInput(String prompt, boolean allowEmpty) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput = "";
		System.out.print(prompt);

		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				isValid = true;
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
			if (!allowEmpty && userInput.isEmpty()) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			} else {
				isValid = true;
			}
		} while (!isValid);
		return userInput;
	}

	/**
	 * Generates a prompt that expects a single character input representing a
	 * char value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the char value
	 */
	public static char promptForChar(String prompt, char min, char max) {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		char input = 'a';
		System.out.print(prompt);

		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				if (userInput.length() != 1) {
					isValid = false;
					System.out.println("Your input was invalid");
					System.out.print(prompt);
				} else {
					input = userInput.charAt(0);
					isValid = true;
				}
			} catch (Exception e) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
			if (input < min || input > max) {
				isValid = false;
				System.out.println("Your input was invalid");
				System.out.print(prompt);
			}
		} while (!isValid);
		return input;
	}

}
