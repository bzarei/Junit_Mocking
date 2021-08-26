package de.telekom.sea4.mockito;

public class Middle {
	
	public String middleMethode() {
		
		Bottom bottom = new Bottom();
		return bottom.toString();
	}

}