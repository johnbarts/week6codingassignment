package week6codingassignment;

import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> hand = new ArrayList<Card>(26);
	
	int score;
	String name;
	
	
	public Player(int score, String name) {
		this.score = score;
		this.name = name;
	}
	
	
	public void describePlayer() {
		System.out.println("This players name is " + name + ",\n"
				+ name + " has a score of " + score + ".\n");
		
		System.out.println("Cards in " + name + "'s hand: \n");
		
		for (Card card : hand) {
			card.describe();
		}
	}
	
	
	public Card flip(Deck deck, Player player) {
		Card playerCard = player.draw(deck);
		return playerCard;
	}
	
	
	public Card draw(Deck deck) {
		Card drawnCard = deck.drawTopCard();
		hand.add(drawnCard);
		return drawnCard;
	}
		
	
	public int incrementScore() {
		return score += 1;
	}
}
