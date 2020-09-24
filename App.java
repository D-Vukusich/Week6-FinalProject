package week6;

public class App {

	public static void main(String[] args) {
		
//**create the deck**
		
		Deck deck = new Deck();
		
//**create two players**
		
		Player derek = new Player("Derek");
		Player melanie = new Player("Melanie");
			
//**implement methods
		
		deck.shuffle();		

		dealTheCards(deck, derek, melanie); 
		
		derek.describe();
		melanie.describe();
		
		playTheGame(derek, melanie); 	
		printTheScore(derek, melanie);
		
	}

	private static void printTheScore(Player derek, Player melanie) {
		if (derek.getScore() > melanie.getScore()) {
			System.out.println("Derek wins with a final score of " + 
			derek.getScore() + " to " + melanie.getScore());
		} else if (melanie.getScore() > derek.getScore()){
			System.out.println("Melanie wins with a final score of  " + 
			melanie.getScore() + " to " + derek.getScore());
		} else {
			System.out.println("This game has ended. The final score is: " +
			derek.getScore() + " to " + melanie.getScore());
		}
	}

	private static void playTheGame(Player derek, Player melanie) {
		System.out.println("***THE GAME BEGINS!***\n");
		for(int j = 0; j < 26; j++) {
			int p1 = derek.flip().getValue();
			int p2 = melanie.flip().getValue();
			if (p1 > p2) {
				derek.incrementScore();
				System.out.println("Derek wins the flip");	
			} 
			else if (p1 < p2){
				melanie.incrementScore();
				System.out.println("Melanie wins the flip");
			} 
			else 
			{
				System.out.println("It's a tie!");
			}
		}
	}

	private static void dealTheCards(Deck deck, Player derek, Player melanie) {
		for(int i = 0; i < 52; i++) {
			if (i % 2 ==  0) { 
				derek.draw(deck);
			} 
			else 
			{ 
				melanie.draw(deck);
			}
		}
	}



}
