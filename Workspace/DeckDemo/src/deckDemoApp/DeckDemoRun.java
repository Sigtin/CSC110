package deckDemoApp;

public class DeckDemoRun {

	public static void run() {
		DeckDemoDeck deck = new DeckDemoDeck();
		deck.shuffle();
		System.out.println(deck);
		System.out.println("");
		deck.dealCards(5);
		
	}
	
}
