package de.telekom.sea4.mockito;

public class Top {
	
	public String topMethode() {
		Middle middle = new Middle();
		return middle.toString();
	}

}
