package rollingDice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Application {

	private static BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
	private static int input;
	private static Random rand;
	public static String prompt() {
		String userInput = "";
		// Prompt the user for the number of dice to roll
		System.out.print("Please enter the number of dice you wish to roll: ");
		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				input = Integer.parseInt(userInput);
				isValid = true;
			} catch (Exception e) {
				System.out.println("Your entry was invalid");
				isValid = false;
				System.out.print("Please enter the number of dice you wish to roll: ");
			}
		} while (!isValid);
		return userInput;
	}

	public static int[] generator(String userInput) {
		// Generate random numbers between 1 and 6 inclusive
		rand = new Random();
		int[] randomNums = new int[input];
		int sum = 0;
		for (int i = 0; i < randomNums.length; i++) {
			randomNums[i] = rand.nextInt(6) + 1;
			System.out.println(randomNums[i]);
			sum += randomNums[i];

		}
		System.out.println("The sum of the numbers rolled is " + sum);
		return randomNums;

	}

	public static void max(int[] randomNums) {
		Arrays.sort(randomNums);

		int maxNum = randomNums[input - 1];
		System.out.println("The maximum value rolled is " + maxNum);

	}

	public static void min(int[] randomNums) {
		Arrays.sort(randomNums);

		int minNum = randomNums[0];
		System.out.println("The mininmum value rolled is " + minNum);

	}

	public static void mode(int[] randomNums) {
		int mode = 0;
		int total = 1;
		
		for(int i = 0; i < randomNums.length; i++){
			int num = randomNums[i];
			int count = 1;
			for(int j = 0; j < randomNums.length; j++){
				if(randomNums[i] == randomNums[j]){
					count++;
					if(count > total){
						total = count;
						mode = num;
					}
				}
			}
		}
		System.out.println("The mode of the values rolled is " + mode);
		

	}

	public static void mean(int[] randomNums) {
		int sum = 0;
		for (int i = 0; i < randomNums.length; i++) {
			sum += randomNums[i];
		}
		double mean = (double)sum / input;
		
		System.out.println("The mean of the values rolled is " + String.format("%.2f",mean));
	}

	public static void run() {
		String prompt = prompt();
		int[] rando = generator(prompt);
		max(rando);
		min(rando);
		mode(rando);
		mean(rando);
	}

}
