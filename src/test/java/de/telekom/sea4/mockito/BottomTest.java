package de.telekom.sea4.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BottomTest {

	private Bottom cut;
	
	@BeforeEach
	public void setup() {
		cut = new Bottom();
	}
	
	@Test
	public void getStringFromBottom_Test() {
		// Arrange
		
		// Act
		String result = cut.bottomMethode();
		
		// Assert
		assertEquals(result, "First String for Mocking!");
	}
	
	
	@AfterEach
	void teardown() {
		cut = null;
		
	}
	
}
