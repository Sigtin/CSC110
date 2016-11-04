package game;

import lib.ConsoleIO;

public class Player {
	private String playerName;
	public void playerName() {
		playerName = ConsoleIO.promptForInput("Please enter your name: ", false);
	}
	public String getPlayerName() {
		return playerName;
	}

}
