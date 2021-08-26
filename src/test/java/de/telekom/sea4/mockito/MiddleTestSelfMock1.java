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

public class MiddleTestSelfMock1 {
	
	private Middle cut;
	
	private IBottom bottom;
	
	@BeforeEach
	public void setup() {
		
		bottom = new IBottom() {

			@Override
			public String bottomMethode() {
				// wenn return von Hand (manuall)
				return "First String for Mocking!";
			}

			@Override
			public String getSum(Integer i) throws Exception {
				return "upper";
			}
			
		};
		
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
