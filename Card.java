package week6;

public class Card {
	private int value;
	private String name;
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	public void describe() {
		System.out.println(this);
	}
	public int getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	public String toString () {
		
		//below I've added .replace because I simply could not figure out how to exclude the word "Card" from the println
		
		return Card.class.getSimpleName(). toString().replace("Card","")+name;
	}
	
}