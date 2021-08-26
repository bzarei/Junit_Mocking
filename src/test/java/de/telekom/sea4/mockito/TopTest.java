package de.telekom.sea4.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TopTest {

	private Top cut;
	
	/*
	 * zeichnet der Referenz als Mock aus - 
	 * instanziiert eine Klasse Middle, die aber standardmäßig nichts tut! 
	 */
	@Mock   
	private Middle middle;
	
	@BeforeEach
	public void setup() {
		
		cut = new Top(middle);
	}
	
	@Test
	public void getStringFromTop_Test() {
		
		// Arrange
		when(middle.middleMethode()).thenReturn("First String for Mocking!");
		
		// Act
		String result = cut.topMethode();
		
		// Assert
		assertEquals(result, "First String for Mocking!");
		assertNotEquals(result, null);
	}
	
	@AfterEach
	void teardown() {
		cut = null;
		
	}
}
