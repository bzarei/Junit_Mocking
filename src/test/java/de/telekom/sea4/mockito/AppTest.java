package de.telekom.sea4.mockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AppTest {

	private App cut;
	
	@Mock   
	private Top top;
	
	@BeforeEach
	public void setup() {
		
		cut = new App(top);
	}
	
	@Test
	public void runFromApp_Test() {
		
		// Arrange
		String[] args = new String[0];
		//when(middle.middleMethode()).thenReturn("First String for Mocking!");
		
		// Act
		cut.run(args);
		
	}
	
	@AfterEach
	void teardown() {
		cut = null;
		
	}
}
