package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import enums.RPS;
import lib.ConsoleIO;

public class App {
	public static BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
	public static int prompt() {
		boolean isLooping = true;
		do {
			System.out.print("Please enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
			String userInput = "";
			int input = 0;
			boolean isValid = true;
			do {
				try {
					userInput = readRacer.readLine();
					input = Integer.parseInt(userInput);
					isValid = true;
				} catch (Exception e) {
					System.exit(0);
				}
			} while (!isValid);
			
			return input;
			
		} while (isLooping);
	}
	
	public static void playerGuess(int input) {
		switch (input) {
		case 1: System.out.println("Player: " + RPS.ROCK);
				break;
		case 2: System.out.println("Player: " + RPS.PAPER);
				break;
		case 3: System.out.println("Player: " + RPS.SCISSORS);
		}
		
	}

	public static void CPUGuess(int input) {
			if (input == 1 || input == 2 || input == 3) {
				Random rand = new Random();
				int i = rand.nextInt(3);
				RPS guess = RPS.values()[i];
				System.out.println("CPU: " + guess);
			} else {
				System.exit(0);
			}
	}
	
	public static void run() {
		int i = prompt();
		playerGuess(i);
		CPUGuess(i);
	}

}
