package de.telekom.sea4.mockito;

public class Middle {
	
	private Bottom bottom;
	
	public Middle(Bottom bottom) {
		this.bottom = bottom;
	}
	
	public String middleMethode() {
		
		return bottom.bottomMethode();
	}

}