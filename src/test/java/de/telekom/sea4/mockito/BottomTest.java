package de.telekom.sea4.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
	
	@Test
	public void getSumCase0_Test() throws Exception {
		
		// Arrange
		
		// Act
		var result = cut.getSum(0);
		
		// Assert
		assertEquals(result, "Zero");
		
	}
	
	@Test
	public void getSumCaseDefault_Test() throws Exception {
		
		// Arrange
		
		// Act & Assert
		// equivalent zu assertThrows(Exception.class, () -> {cut.getSum(-1);});
		assertThrows(Exception.class, () -> cut.getSum(-1));
		
	}
	
	
	@AfterEach
	void teardown() {
		cut = null;
		
	}
	
}
