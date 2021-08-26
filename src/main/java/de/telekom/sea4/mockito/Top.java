package de.telekom.sea4.mockito;

public class Top {
	
	private Middle middle;
	
	public Top (Middle middle) {
		this.middle = middle;
	}
	
	public String topMethode() {
		
		return middle.middleMethode();
	}

}
