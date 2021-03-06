package deckDemoApp;

import deckDemoEnums.DeckDemoCardSuits;
import deckDemoEnums.DeckDemoCardValues;

public class DeckDemoCard {

	private DeckDemoCardSuits cardSuit;
	private DeckDemoCardValues cardValue;

	public DeckDemoCard(DeckDemoCardSuits cardSuit, DeckDemoCardValues cardValue) {
		this.cardSuit = cardSuit;
		this.cardValue = cardValue;
	}
	
	public DeckDemoCardSuits getCardSuit() {
		return cardSuit;
	}

	public DeckDemoCardValues getCardValue() {
		return cardValue;
	}
	
	@Override
	public String toString() {
		// Return a String in the format: Suit " of " Value
		String retVal = getCardValue() + " of " + getCardSuit();

		return retVal;
	}
}
