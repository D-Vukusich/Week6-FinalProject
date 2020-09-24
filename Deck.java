package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

	private List<Card> cards = new ArrayList<>();	
	private static final String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};	
	private static final String[] names = {"Two", "Three", "Four", 
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", 
			"Queen", "King", "Ace"};
	
	public Deck() { 
		
		for (int suitIndex = 0; suitIndex < suits.length; suitIndex++) {
			String suit = suits[suitIndex];
			
			for (int nameIndex = 0; nameIndex < names.length; nameIndex++) {			
				String name = names[nameIndex];	
				String cardName = name + " of " + suit;				
				int cardValue = nameIndex + 2;			
				cards.add(new Card(cardName, cardValue));
				}
			}
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);		
	}
}

	

