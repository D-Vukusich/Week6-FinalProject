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
		return this.getName();
	}
	
}
