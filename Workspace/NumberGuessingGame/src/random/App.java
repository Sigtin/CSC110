package random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class App {
	private static BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
	private static Random randAlThor;

	public static int prompt() {
		System.out.println("Welcome to the Number Guessing Game");

		System.out.println("To play on easy, press 1");
		System.out.println("To play on medium, press 2");
		System.out.println("To play on hard, press 3");
		String userInput = "";
		int input = 0;
		boolean isValid = true;
		do {
			try {
				userInput = readRacer.readLine();
				input = Integer.parseInt(userInput);
				isValid = true;
			} catch (Exception e) {
				System.out.println("Your entry was invalid");
				isValid = false;
				System.out.println("To play on easy, press 1");
				System.out.println("To play on medium, press 2");
				System.out.println("To play on hard, press 3");
			}
		} while (!isValid);
		return input;
	}

	public static void difficulty(int input) {
		randAlThor = new Random();
		int x = 0;
		switch (input) {

		case 1:
			x = 10;
			break;
		case 2:
			x = 50;
			break;
		case 3:
			x = 100;
			break;
		}

		int randomNum = randAlThor.nextInt(x) + 1;
		int guessesLeft = 5;
		int guessesMade = 0;
		int[] numsGuessed = new int[guessesLeft];
		boolean isLooping = true;
		do {
			boolean isGuessing = true;

			do {

				boolean isValid = true;
				do {
					System.out.print("Please guess a number between 1 and " + x + ": ");
					try {
						String userInput = readRacer.readLine();
						input = Integer.parseInt(userInput);
						isValid = true;
						if (input > x || input < 1) {
							System.out.println("Your input was invalid");
							isValid = false;
						}else{
						for (int i = 0; i < numsGuessed.length; i++) {
							if (numsGuessed[i] == input) {
								System.out.println("You already guessed that number");
								System.out.print("Please enter a different number between 1 and " + x + ": ");
								isValid = false;
							} 
						}
						}
						
					} catch (Exception e) {
						System.out.println("Your entry was invalid");
						isValid = false;
						System.out.print("Please guess a number between 1 and " + x + ": ");
					}
				} while (!isValid);

				if (input == randomNum) {
					System.out.println("That is the correct number. You win!");
					guessesLeft = guessesLeft - 1;
					guessesMade = guessesMade + 1;
					System.out.println("You made " + guessesMade + " guesses");
					System.out.println("You had " + guessesLeft + " guesses left");
					isGuessing = false;
				} else if (input < randomNum) {
					System.out.println("Your guess was too low");
					guessesLeft = guessesLeft - 1;
					numsGuessed[guessesMade] = input;
					guessesMade = guessesMade + 1;
					System.out.println("You've made " + guessesMade + " guesses so far");
					System.out.println("You have " + guessesLeft + " guesses left");
				} else {
					System.out.println("Your guess was too high");
					guessesLeft = guessesLeft - 1;
					numsGuessed[guessesMade] = input;
					guessesMade = guessesMade + 1;
					System.out.println("You've made " + guessesMade + " guesses so far");
					System.out.println("You have " + guessesLeft + " guesses left");
				}

				if (guessesLeft == 0) {
					System.out.println("You lose");
					System.out.println("You made " + guessesMade + " guesses");
					System.out.println("You have " + guessesLeft + " guesses left");
					isGuessing = false;
				}
			} while (isGuessing);
			reset();

		} while (isLooping);
	}

	public static void reset() {
		System.out.println("To play again, press 1");
		System.out.println("To exit the program, press 2");
		String userInput = "";
		int input = 0;
		boolean isValid = true;

		do {
			try {
				userInput = readRacer.readLine();
				input = Integer.parseInt(userInput);
				isValid = true;
			} catch (IOException e) {
				System.out.println("Your entry was invalid");
				isValid = false;
				System.out.println("To play again, press 1");
				System.out.println("To exit the program, press 2");
			}
		} while (!isValid);
		switch (input) {

		case 1:
			run();
			break;
		case 2:
			System.exit(0);
		}

	}

	public static void run() {
		boolean isValid = true;
		do {
		int input = prompt();

			if (input > 3 || input < 1) {
				System.out.println("Your input was invalid");
				isValid = false;
			} else {
				difficulty(input);
				isValid = true;
			}
		} while (!isValid);
	}

}
