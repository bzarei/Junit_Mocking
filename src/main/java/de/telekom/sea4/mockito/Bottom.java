package de.telekom.sea4.mockito;

public class Bottom implements IBottom {
	
	public String bottomMethode() {
		
		return "First String for Mocking!";
	}
	
	public String getSum(Integer i) throws RuntimeException {
		
		switch(i) {
		case 0: return "Zero";
		case 1: return "One";
		case 2: return "Two";
		default: throw new RuntimeException("Käse");
		}
	
	}
	
	public void logBottom() {
		System.out.println("Hier ist ein LOG aus der Bottom Klasse.");
	}
	
}
