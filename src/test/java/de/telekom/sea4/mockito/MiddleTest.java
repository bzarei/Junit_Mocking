package de.telekom.sea4.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

@ExtendWith(MockitoExtension.class)
public class MiddleTest {
	
	private Middle cut;
	
	@Mock
	private Bottom bottom;
	
	@BeforeEach
	public void setup() {
		
		cut = new Middle(bottom);
	}
	
	@Test
	public void getStringFromMiddle_Test() {
		
		// Arrange
		when(bottom.bottomMethode()).thenReturn("First String for Mocking!");
		
		// Act
		String result = cut.middleMethode();
		
		// Assert
		assertEquals(result, "First String for Mocking!");
		assertNotEquals(result, null);
	}
	
	@Test
	public void getFormatSumCase0_Test() {
		
		// Arrange
		when(bottom.getSum(0)).thenReturn("Zero");
		
		// Act
		var result = cut.formatSum(0);
		
		// Assert
		assertEquals("ZERO", result);
		assertNotEquals(null, result);
	}
	
	@Test
	public void getFormatSumCase1_Test() {
		
		// Arrange
		when(bottom.getSum(1)).thenReturn("One");
		
		// Act
		var result = cut.formatSum(1);
		
		// Assert
		assertEquals("ONE", result);
		assertNotEquals(null, result);
	}
	
	
	@Test
	public void getFormatSumDefault_Test() {
		
		// Arrange
		// Wir nutzen Bottom Mock, weil Middel es braucht.
		when(bottom.getSum(-1)).thenThrow(RuntimeException.class);
		
		// Act
		var result = cut.formatSum(-1);
		
		// Assert
		// Wenn Middle RuntimeException fängt!!! liefert sie null!! zurück
		// Hier wird Middle getestet und nicht Bottom!
		assertNull(result);

	}
	
	@Test
	public void getFormatSumWithAny_Test() {
		
		// Arrange
		// Hier egal was übergeben wird. Ich kann also any übergeben.
		// Vergleiche MiddleTestSelfMock1 ->getSum()
		when(bottom.getSum(any(Integer.class))).thenReturn("upper");
		
		// Act
		// Egal was hier als Parameter geschrieben wird
		// der Bottom-Mock liefert nur "upper" zurück
		var result = cut.formatSum(0);
		
		// Assert
		assertEquals("UPPER", result);

	}
	
	@Test
	public void test(){
		
		// Arrange bei void methoden
//		doReturn("anything").when(bottom).logBottom();
		
		// Act
		
		
		// Assert
		
	}
	
	@Test
	public void aVerify_Test() {
		
		// Prüfung ob eine Methode aufgerufen wird?
		// Wie oft? Ob überhaupt?
		
		// Arrange
		when(bottom.getSum(0)).thenReturn("Zero");
		
		// Act
		var result = cut.formatSum(0);
		
		// Assert
		assertEquals("ZERO", result);
		
		//Verify -> 
		verify(bottom).getSum(any(Integer.class));
		
//		 verify(bottom,never()).getSum(any(Integer.class));
		
		verify(bottom, times(1)).getSum(any(Integer.class));
	}
	
	
	@AfterEach
	void teardown() {
		cut = null;
		
	}
	
}
