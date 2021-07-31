package week6codingassignment;


public class App {

	
	public static void main(String[] args) {
		
		Card heartAce = new Card(14, "Ace of Hearts");
		Card heartKing = new Card(13, "King of Hearts");
		Card heartQueen = new Card(12, "Queen of Hearts");
		Card heartJack = new Card(11, "Jack of Hearts");
		Card heart10 = new Card(10, "Ten of Hearts");
		Card heart9 = new Card(9, "Nine of Hearts");
		Card heart8 = new Card(8, "Eight of Hearts");
		Card heart7 = new Card(7, "Seven of Hearts");
		Card heart6 = new Card(6, "Six of Hearts");
		Card heart5 = new Card(5, "Five of Hearts");
		Card heart4 = new Card(4, "Four of Hearts");
		Card heart3 = new Card(3, "Three of Hearts");
		Card heart2 = new Card(2, "Two of Hearts");
		
		Card spadeAce = new Card(14, "Ace of Spades");
		Card spadeKing = new Card(13, "King of Spades");
		Card spadeQueen = new Card(12, "Queen of Spades");
		Card spadeJack = new Card(11, "Jack of Spades");
		Card spade10 = new Card(10, "Ten of Spades");
		Card spade9 = new Card(9, "Nine of Spades");
		Card spade8 = new Card(8, "Eight of Spades");
		Card spade7 = new Card(7, "Seven of Spades");
		Card spade6 = new Card(6, "Six of Spades");
		Card spade5 = new Card(5, "Five of Spades");
		Card spade4 = new Card(4, "Four of Spades");
		Card spade3 = new Card(3, "Three of Spades");
		Card spade2 = new Card(2, "Two of Spades");
		
		Card diamondAce = new Card(14, "Ace of Diamonds");
		Card diamondKing = new Card(13, "King of Diamonds");
		Card diamondQueen = new Card(12, "Queen of Diamonds");
		Card diamondJack = new Card(11, "Jack of Diamonds");
		Card diamond10 = new Card(10, "Ten of Diamonds");
		Card diamond9 = new Card(9, "Nine of Diamonds");
		Card diamond8 = new Card(8, "Eight of Diamonds");
		Card diamond7 = new Card(7, "Seven of Diamonds");
		Card diamond6 = new Card(6, "Six of Diamonds");
		Card diamond5 = new Card(5, "Five of Diamonds");
		Card diamond4 = new Card(4, "Four of Diamonds");
		Card diamond3 = new Card(3, "Three of Diamonds");
		Card diamond2 = new Card(2, "Two of Diamonds");
		
		Card clubAce = new Card(14, "Ace of Clubs");
		Card clubKing = new Card(13, "King of Clubs");
		Card clubQueen = new Card(12, "Queen of Clubs");
		Card clubJack = new Card(11, "Jack of Clubs");
		Card club10 = new Card(10, "Ten of Clubs");
		Card club9 = new Card(9, "Nine of Clubs");
		Card club8 = new Card(8, "Eight of Clubs");
		Card club7 = new Card(7, "Seven of Clubs");
		Card club6 = new Card(6, "Six of Clubs");
		Card club5 = new Card(5, "Five of Clubs");
		Card club4 = new Card(4, "Four of Clubs");
		Card club3 = new Card(3, "Three of Clubs");
		Card club2 = new Card(2, "Two of Clubs");
		
		Deck.newCard(heartAce);
		Deck.newCard(heartKing);
		Deck.newCard(heartQueen);
		Deck.newCard(heartJack);
		Deck.newCard(heart10);
		Deck.newCard(heart9);
		Deck.newCard(heart8);
		Deck.newCard(heart7);
		Deck.newCard(heart6);
		Deck.newCard(heart5);
		Deck.newCard(heart4);
		Deck.newCard(heart3);
		Deck.newCard(heart2);
		
		Deck.newCard(spadeAce);
		Deck.newCard(spadeKing);
		Deck.newCard(spadeQueen);
		Deck.newCard(spadeJack);
		Deck.newCard(spade10);
		Deck.newCard(spade9);
		Deck.newCard(spade8);
		Deck.newCard(spade7);
		Deck.newCard(spade6);
		Deck.newCard(spade5);
		Deck.newCard(spade4);
		Deck.newCard(spade3);
		Deck.newCard(spade2);
		
		Deck.newCard(diamondAce);
		Deck.newCard(diamondKing);
		Deck.newCard(diamondQueen);
		Deck.newCard(diamondJack);
		Deck.newCard(diamond10);
		Deck.newCard(diamond9);
		Deck.newCard(diamond8);
		Deck.newCard(diamond7);
		Deck.newCard(diamond6);
		Deck.newCard(diamond5);
		Deck.newCard(diamond4);
		Deck.newCard(diamond3);
		Deck.newCard(diamond2);
		
		Deck.newCard(clubAce);
		Deck.newCard(clubKing);
		Deck.newCard(clubQueen);
		Deck.newCard(clubJack);
		Deck.newCard(club10);
		Deck.newCard(club9);
		Deck.newCard(club8);
		Deck.newCard(club7);
		Deck.newCard(club6);
		Deck.newCard(club5);
		Deck.newCard(club4);
		Deck.newCard(club3);
		Deck.newCard(club2);
		
		
		Deck deck = new Deck();
		
		
		Player playerOne = new Player(0, "John");
		Player playerTwo = new Player(0, "Stephanie");
				
// Shuffling Cards.
		
		deck.shuffleCards();
		
// Dealing Cards.
		
		for (int i = 0; i < 52; i++) {
			
			if (i % 2 != 0) {
				Card playerTwoCard = playerTwo.draw(deck);
				Deck.newCard(playerTwoCard);
			} else {
				Card playerOneCard = playerOne.draw(deck);
				Deck.newCard(playerOneCard);
			}
		}
		
// Made sure describePlayer() method works including info on hand dealt.	
		
		playerOne.describePlayer();
		System.out.println(" ");
		playerTwo.describePlayer();
		
// Players battle it out! 
		
		System.out.println("\n=*==*==*==*==*==*==*==*==*=");
		System.out.println("WELCOME TO THE GAME OF WAR!");
		System.out.println("=*==*==*==*==*==*==*==*==*=\n");
		
		for (int i = 0; i < 26; i++) {
			
			Card playerOneCard = playerOne.flip(deck, playerOne);
			Card playerTwoCard = playerTwo.flip(deck, playerTwo);
			
			if (playerOneCard.value > playerTwoCard.value) {
				playerOne.incrementScore();
				System.out.println("-----------------------------------");
				System.out.println(playerOne.name + " has drawn...");
				playerOneCard.describe();
				System.out.println("\n" + playerTwo.name + " has drawn...");
				playerTwoCard.describe();
				System.out.println("-----------------------------------");
				System.out.println("\n* " + playerOne.name + " has scored a point! *\n");
			
			} else if (playerOneCard.value < playerTwoCard.value) {
				playerTwo.incrementScore();
				System.out.println("-----------------------------------");
				System.out.println(playerOne.name + " has drawn...");
				playerOneCard.describe();
				System.out.println("\n" + playerTwo.name + " has drawn...");
				playerTwoCard.describe();
				System.out.println("-----------------------------------");
				System.out.println("\n* " + playerTwo.name + " has scored a point! *\n");
			
			} else {
				System.out.println("-----------------------------------");
				System.out.println(playerOne.name + " has drawn...");
				playerOneCard.describe();
				System.out.println("\n" + playerTwo.name + " has drawn...");
				playerTwoCard.describe();
				System.out.println("-----------------------------------\n");
				System.out.println("* Equal values, no points awarded! *\n");
			}
		}
		
		
		if (playerOne.score > playerTwo.score) {
			System.out.println("=======================================");
			System.out.println("END OF WAR GAME - THE FINAL SCORES ARE:");
			System.out.println("=======================================\n");
			System.out.println(playerOne.name + ": " + playerOne.score);
			System.out.println(playerTwo.name + ": " + playerTwo.score + "\n");
			System.out.println(playerOne.name + " wins by " + (playerOne.score - playerTwo.score) + "!");
		
		} else if (playerOne.score < playerTwo.score) {
			System.out.println("=======================================");
			System.out.println("END OF WAR GAME - THE FINAL SCORES ARE:");
			System.out.println("=======================================\n");
			System.out.println(playerTwo.name + ": " + playerTwo.score);
			System.out.println(playerOne.name + ": " + playerOne.score + "\n");
			System.out.println(playerTwo.name + " wins by " + (playerTwo.score - playerOne.score) + "!");
		
		} else {
			System.out.println("=======================================");
			System.out.println("END OF WAR GAME - THE FINAL SCORES ARE:");
			System.out.println("=======================================\n");
			System.out.println(playerOne.name + ": " + playerOne.score);
			System.out.println(playerTwo.name + ": " + playerTwo.score + "\n");
			System.out.println("The game ends in a draw...\nNo winners this time!");
		}
	}
}
