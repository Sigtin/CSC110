package rollingDice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	
	private static BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
	
	public static String run() { try{
		//Prompt the user for the number of dice to roll
		System.out.print("Please enter the number of dice you wish to roll: ");
		
			String userInput = readRacer.readLine();
			
				userInput = readRacer.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return userInput;
	
	}
	
	
}
