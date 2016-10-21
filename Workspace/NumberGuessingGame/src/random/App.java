package random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class App {
	private static BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
	private static Random randAlThor;
	public static String prompt() throws IOException{
		System.out.println("Welcome to the Number Guessing Game");
		
		System.out.println("To play on easy, press 1");
		System.out.println("To play on medium, press 2");
		System.out.println("To play on hard, press 3");
			String userInput = readRacer.readLine();
			
		return userInput;
	}
	
	public static void difficulty(String userInput) throws IOException{
		int input = Integer.parseInt(userInput);
		randAlThor = new Random();
		
		switch(input){
		
		case 1:
			int randomNum = randAlThor.nextInt(10)+1;
			int[] array = new int[randomNum];
			System.out.print("Please guess a number between 1 and 10: ");
				userInput = readRacer.readLine();
				input = Integer.parseInt(userInput);
				int[] arrayInput = new int[input];
			if(arrayInput = array)
			
		}
	}
	
}
