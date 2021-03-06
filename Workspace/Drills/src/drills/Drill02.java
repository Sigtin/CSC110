package drills;

import java.util.Random;

public class Drill02 {

	/*
	 * Create a method that takes in three ints: min, max, and size. The method
	 * returns an array (with a length equal to size) populated by random ints
	 * between the min and max inclusive.
	 */

	public static int[] numbers(int min, int max, int size) {
		Random rand = new Random();
		int[] numArray = new int[size];

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = rand.nextInt(1 + max - min) + min;
		}
		return numArray;
	}

	/*
	 * Create a method that takes in an array of ints. Using a SINGLE loop, find
	 * the min and max of that array. The method should return an array of two
	 * ints where index 0 is the found min and index 1 is the found max.
	 */

	public static int[] calculate(int[] numArray) {
		int max = numArray[0];
		int min = numArray[0];

		for (int i : numArray) {
			if (i > max) {
				max = i;
			}

			if (i < min) {
				min = i;
			}
		}
		int[] minAndMax = new int[2];
		minAndMax[0] = min;
		minAndMax[1] = max;

		return minAndMax;
	}

	/*
	 * Create a method that takes in an array of ints and, using a for-each loop
	 * (aka "enhanced" for-loop), builds a String of the values found in the
	 * array. Separate the values with a single space character. Once the
	 * for-each loop is done, remove any extraneous space characters at the
	 * beginning and end of the String (PRO TIP: there is a method in Java's
	 * String class that handles this for you). Return the final String (no need
	 * to print anything in this method).
	 */

	public static String stringBuilder(int[] numArray) {
		String numString = "";

		for (int i : numArray) {
			numString += i + " ";
		}
		numString = numString.trim();
		return numString;
	}

	/*
	 * Create a method called "run". In this method do the following: Use the
	 * first method you created to generate an array of 100 ints between 12 and
	 * 53 inclusive. Use the third method to print out this collection. Use the
	 * second method to find the min and max. Use the third method again to
	 * print out the result from the previous step.
	 */

	public static void run() {
		int[] array = numbers(12, 53, 100);
		System.out.println(stringBuilder(array));
		int[] minAndMax = calculate(array);
		System.out.println(stringBuilder(minAndMax));
	}
}
