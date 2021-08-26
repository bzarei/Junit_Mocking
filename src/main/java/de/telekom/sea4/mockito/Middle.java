package de.telekom.sea4.mockito;

public class Middle {

	private IBottom bottom;

	public IBottom getBottom() {
		return bottom;
	}

	public void setBottom(IBottom bottom) {
		this.bottom = bottom;
	}

	public Middle(IBottom bottom) {
		this.bottom = bottom;
	}

	public String middleMethode() {

		return bottom.bottomMethode();
	}

	public String formatSum(Integer i) {

		try {
			String formatierterString = bottom.getSum(i);
			
			return formatierterString.toUpperCase();
			
		} catch (Exception e) {
			
		}
		return null;
	}

}