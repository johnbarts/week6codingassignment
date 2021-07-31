package week6codingassignment;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	static ArrayList<Card> cards = new ArrayList<Card>(52); 
	
	
	static void newCard(Card card) {
		cards.add(card);
	}
	
	
	public void shuffleCards() {
		Collections.shuffle(cards);
	}
	
	
	public Card drawTopCard() {
		return cards.remove(0);
	}
}
