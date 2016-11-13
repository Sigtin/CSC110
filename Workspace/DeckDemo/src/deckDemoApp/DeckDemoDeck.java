package deckDemoApp;

import java.util.Random;

import deckDemoEnums.DeckDemoCardSuits;
import deckDemoEnums.DeckDemoCardValues;
import lib.ConsoleIO;

public class DeckDemoDeck {

	private DeckDemoCard[] cards = new DeckDemoCard[52];

	public DeckDemoDeck() {
		int counter = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				DeckDemoCard card = new DeckDemoCard(DeckDemoCardSuits.values()[i], DeckDemoCardValues.values()[j]);
				cards[counter] = card;
				counter++;
			}
		}
	}

	@Override
	public String toString() {
		// Return a String in the format: Suit " of " Value
		String retVal = "";
		for (DeckDemoCard i : cards) {
			retVal += i + "\n";
		}

		return retVal;
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			Random rand = new Random();
			int randNum = rand.nextInt(52);
			DeckDemoCard temp = cards[randNum];
			cards[randNum] = cards[i];
			cards[i] = temp;
		}
	}
	
	public int topOfDeck = 0;

	public void dealCards(int cardsDealt) {
		for (int i = 0; i < cardsDealt; i++) {
			System.out.println(cards[i]);
			topOfDeck++;
		}
		boolean isLooping = true;
		do {
			String[] options = new String[] { "Deal next " + cardsDealt + " cards", "Reshuffle" };

			int input = ConsoleIO.promptForMenuSelection(options, true);

			if (input == 1) {
				if(topOfDeck == 50) {
					for (int i = 0; i < 2; i++) {
						System.out.println(cards[topOfDeck]);
						topOfDeck++;
					}
					isLooping = true;
				} else if (topOfDeck == 52) {
					System.out.println("The entire deck has already been dealt. Please re-shuffle or close the application");
				} else {
					for (int i = 0; i < cardsDealt; i++) {
					System.out.println(cards[topOfDeck]);
					topOfDeck++;
					}
				}
				isLooping = true;
			} else if (input == 2) {
				shuffle();
				topOfDeck = 0;
				for (int i = 0; i < cardsDealt; i++) {
					System.out.println(cards[i]);
					topOfDeck++;
				}
				isLooping = true;
			} else {
				isLooping = false;
				System.exit(0);
			}

		} while (isLooping);
	}

}
