package Scratch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import models.Student;

public class ScratchClass {

	private static BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));

	public static String run(String message, char hiddenChar) {
		String encryptedString = null;
		char[] messageChars = message.toCharArray();

		// For every characer in the string
		for (int i = 0; i < messageChars.length; i++) {
			// If the current character equals hiddenChar
			if (messageChars[i] == hiddenChar) {
				// Replace the character at the current index in messageChars
				// with '*'

				messageChars[i] = '*';
			}
		}
		// Set encryptedString to messagChars (converted to a string)
		encryptedString = new String(messageChars);
		return encryptedString;
	}

	public static void main(String[] args) {
//		String modifiedMessage = run("Hello", 'l');
//		System.out.println(modifiedMessage);
		

		/*
		 * Data types
		 * 
		 * The 8 Primitives Numeric Primitives Integral Primitives byte - 8 bits
		 * - range: -128 to 127 (256 distinct values) short - 16 bits - range:
		 * -32,768 to 32,767 int - 32 bits - range: -2,147,483,648 to
		 * 2,147,483,647 long - 64 bits - range: -9,223,372,036,854,775,808 to
		 * 9,223,372,036,854,775,807
		 *
		 * Floating Point Primitives float - 32 bits (up to 7 significant
		 * decimal places) double - 64 bits (up to 15 significant decimal
		 * places)
		 * 
		 * Non-Numeric Primitives boolean - true/false char - single character
		 * (ASCII or Unicode)
		 * 
		 */

		// if
		// if-if
		// if-else
		// if-else if
		// if-else if-else

		// Declaring a local variable
		// Data type
		// Alias (aka name)
		// Initialize (optionally on a separate line)

		// Three major forms of errors in programming
		// 1. Compiler errors
		// 2. Runtime errors
		// 3. Logical errors

	}
}
