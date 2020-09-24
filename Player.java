package week6;

	import java.util.ArrayList;
	import java.util.List;

	public class Player {
		private List<Card> hand = new ArrayList<>();
		private int score; 
		private String name;

		public Player(String name) {
			this.name = name;
		}

		public void describe() {
			System.out.println(toString());
		}
		
		public Card flip() {
//**remove and return the top card**
			return hand.remove(0);
		}
		
		public void draw(Deck deck) {
//**draw a card and add it to the hand**
			hand.add(deck.draw());
		}
		
		public void incrementScore() {
			//add 1 to the score
			score++;
		}
		public List<Card> getHand(){
			return hand;
		}
		public int getScore() {
			return score;
		}
		public String getName() {
			return name;
		}
		public String toString() {
			StringBuilder builder = new StringBuilder();
			
			builder.append("The player " + name + " had the following cards in their hand: \n \n");
			
			for (Card card : hand){
				builder.append(card).append("\n");
			}
			return builder.toString();
		}
		
	}