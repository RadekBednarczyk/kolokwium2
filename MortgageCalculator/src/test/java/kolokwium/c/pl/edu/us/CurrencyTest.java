package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import org.junit.Test;

public class CurrencyTest {
	@Test
	public void convertFromPlnTest() {

		Currency c = new Currency("Frank", 2.0);
		boolean result = false;

		if (c.convertFromPLN(34) == 17.0) {
			result = true;
		}

		assertTrue("Blad w konwersji z pln", result);

	}

	@Test
	public void convertToPlnTest() {
		Currency c = new Currency("Frank", 4.0);
		boolean result = false;

		
		if (c.convertToPLN(20) == 80.0) {
			result = true;
		}

		assertTrue("Blad w konwersji na pln", result);

	}
}