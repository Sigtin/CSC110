package Scratch;

public class PracticeProblems {

	// Create a method that takes in an int, a min, and a max
	// and returns whether the original int is within the inclusive
	// range

	public static String practiceProblemOne(int i, int min, int max) {
		// If max is less than min, swap their values
		String range = "";
		if (max < min) {
			int temp = min;
			min = max;
			max = temp;
		}
		
		if (i >= min && i <= max) {
			range = "The original int is within the inclusive range";
		} else {
			range = "The original int is not within the inclusive range";
		}
		return range;
	}
	
	
	
	

}
