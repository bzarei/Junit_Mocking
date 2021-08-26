package de.telekom.sea4.mockito;

public class Top {
	
	public String topMethode() {
		
		Bottom bottom = new Bottom();
		Middle middle = new Middle(bottom);
		return middle.middleMethode();
	}

}
