package week6codingassignment;

public class Card {
	
	int value;
	String name;
	
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void describe() {
		System.out.println(name + ", " + "worth " + value + " points.");
	}
}
