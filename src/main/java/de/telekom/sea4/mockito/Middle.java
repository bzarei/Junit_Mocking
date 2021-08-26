package de.telekom.sea4.mockito;

public class Middle {
	
	private IBottom bottom;
	
	public Middle(IBottom bottom) {
		this.bottom = bottom;
	}
	
	public String middleMethode() {
		
		return bottom.bottomMethode();
	}

}