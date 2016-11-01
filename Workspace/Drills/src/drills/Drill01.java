package drills;

public class Drill01 {

	// Build a method that takes in two ints and,
	// using a loop of your choice, calculates
	// the value of the first int raised to the
	// power of the second int. The method should
	// return the result (NOT print it to the console, but return it).
	// For example, if the method is called with the values 4 and 3,
	// it will return the product of 4 raised to the 3rd power (which is 64).

	public static int power(int num, int power) {
		int product = 1;
		
		for(int i = 0; i < power; i++){
			product *= num;
		}
		
		return product;
	}

	// Build a method that takes in a string and returns a new version of that
	// string where all vowels have been replaced with underscores.

	public static String underscore(String words) {
		String underscore = words;
		char[] vowels = "aeiouAEIOU".toCharArray();
		
		for(char vowel : vowels){
			underscore = underscore.replace(vowel, '_');
		}
		
		return underscore;

	}

	// Build a method that takes in a string and returns a jumbled version.
	// This means that the string returned is the same length as the original,
	// contains exactly the same letters in the same quantity, but in a
	// completely randomized order.

	public static String randomize(String words) {
		String jumble = words;
		
		
		
		return jumble;

	}

}
