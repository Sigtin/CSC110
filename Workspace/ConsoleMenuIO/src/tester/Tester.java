package tester;

import lib.ConsoleIO;

public class Tester {

	public static void main(String[] args) {
		String[] opts = new String[]{
			"Hello",
			"Hi",
			"Yo"
		};
		ConsoleIO.promptForMenuSelection(opts, false);

	}

}