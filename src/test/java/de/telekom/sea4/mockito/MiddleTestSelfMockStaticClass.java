package de.telekom.sea4.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

public class MiddleTestSelfMockStaticClass {
	
	private Middle cut;
	
	private IBottom bottom;
	
	// innere Klasse
	public static class MockBottom implements IBottom {
		
		public String bottomMethode() {
			
			return "First String for Mocking!";
		}

		@Override
		public String getSum(Integer i) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	
	@BeforeEach
	public void setup() {
		
		bottom = new MockBottom();
		
		cut = new Middle(bottom);
	}
	
	@Test
	public void getStringFromMiddle_Test() {
		
		// Arrange
		//when(bottom.bottomMethode()).thenReturn("First String for Mocking!");
		
		
		// Act
		String result = cut.middleMethode();
		
		// Assert
		assertEquals(result, "First String for Mocking!");
		assertNotEquals(result, null);
	}
	
	@AfterEach
	void teardown() {
		cut = null;
		
	}
	
}
