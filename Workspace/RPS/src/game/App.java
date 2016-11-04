package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import enums.RPS;
import lib.ConsoleIO;

public class App {
	public static BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));

	public static Player welcome() {
		Player p1 = new Player();
		p1.playerName();
		System.out.println("Welcome, " + p1.getPlayerName() + ", to Rock, Paper, Scissors, Lizard, Spock");
		return p1;
	}

	public static int prompt() {
		String[] rps = new String[5];
		rps[0] = RPS.ROCK.toString();
		rps[1] = RPS.PAPER.toString();
		rps[2] = RPS.SCISSORS.toString();
		rps[3] = RPS.LIZARD.toString();
		rps[4] = RPS.SPOCK.toString();

		int input = ConsoleIO.promptForMenuSelection(rps, true);
		return input;
	}

	public static RPS CPUGuess() {
		Random rand = new Random();
		int i = rand.nextInt(5);
		RPS guess = RPS.values()[i];
		return guess;
	}

	public static boolean isLooping = true;
	public static int playerWins = 0;
	public static int CPUWins = 0;

	public static void playerGuess(int input, RPS guess, Player p1) {
		
		switch (input) {

		case 1:
			System.out.println("Player: " + RPS.ROCK);
			System.out.println("CPU: " + guess);
			if (guess == RPS.PAPER || guess == RPS.SPOCK) {
				System.out.println(p1.getPlayerName() + " loses!");
				System.out.println("CPU wins!");
				CPUWins++;
			} else if (guess == RPS.SCISSORS || guess == RPS.LIZARD) {
				System.out.println(p1.getPlayerName() + " wins!");
				System.out.println("CPU loses!");
				playerWins++;
			} else {
				System.out.println(p1.getPlayerName() + " ties with CPU!");
			}
			break;

		case 2:
			System.out.println("Player: " + RPS.PAPER);
			System.out.println("CPU: " + guess);
			if (guess == RPS.SCISSORS || guess == RPS.LIZARD) {
				System.out.println(p1.getPlayerName() + " loses!");
				System.out.println("CPU wins!");
				CPUWins++;
			} else if (guess == RPS.ROCK || guess == RPS.SPOCK) {
				System.out.println(p1.getPlayerName() + " wins!");
				System.out.println("CPU loses!");
				playerWins++;
			} else {
				System.out.println(p1.getPlayerName() + " ties with CPU!");
			}
			break;

		case 3:
			System.out.println("Player: " + RPS.SCISSORS);
			System.out.println("CPU: " + guess);
			if (guess == RPS.ROCK || guess == RPS.SPOCK) {
				System.out.println(p1.getPlayerName() + " loses!");
				System.out.println("CPU wins!");
				CPUWins++;
			} else if (guess == RPS.PAPER || guess == RPS.LIZARD) {
				System.out.println(p1.getPlayerName() + " wins!");
				System.out.println("CPU loses!");
				playerWins++;
			} else {
				System.out.println(p1.getPlayerName() + " ties with CPU!");
			}
			break;
			
		case 4:
			System.out.println("Player: " + RPS.LIZARD);
			System.out.println("CPU: " + guess);
			if (guess == RPS.ROCK || guess == RPS.SCISSORS) {
				System.out.println(p1.getPlayerName() + " loses!");
				System.out.println("CPU wins!");
				CPUWins++;
			} else if (guess == RPS.PAPER || guess == RPS.SPOCK) {
				System.out.println(p1.getPlayerName() + " wins!");
				System.out.println("CPU loses!");
				playerWins++;
			} else {
				System.out.println(p1.getPlayerName() + " ties with CPU!");
			}
			break;
			
		case 5:
			System.out.println("Player: " + RPS.SPOCK);
			System.out.println("CPU: " + guess);
			if (guess == RPS.PAPER || guess == RPS.LIZARD) {
				System.out.println(p1.getPlayerName() + " loses!");
				System.out.println("CPU wins!");
				CPUWins++;
			} else if (guess == RPS.ROCK || guess == RPS.SCISSORS) {
				System.out.println(p1.getPlayerName() + " wins!");
				System.out.println("CPU loses!");
				playerWins++;
			} else {
				System.out.println(p1.getPlayerName() + " ties with CPU!");
			}
			break;

		default:
			System.out.println("Thank you, " + p1.getPlayerName() + 
					", for playing Rock, Paper, Scissors, Lizard, Spock");
			System.out.println(p1.getPlayerName() + " won " + playerWins + " times");
			System.out.println("CPU won " + CPUWins + " times");
			
			if (playerWins > CPUWins) {
				System.out.println(p1.getPlayerName() + " wins the whole game!");
			} else if (CPUWins > playerWins) {
				System.out.println("CPU wins the whole game!");
			} else {
				System.out.println(p1.getPlayerName() + " ties with the CPU!");
			}
			
			isLooping = false;
			break;

		}

	}

	public static void run() {
		Player p = welcome();
		do {
			int i = prompt();
			RPS g = CPUGuess();
			playerGuess(i, g, p);
		} while (isLooping);
	}

}
