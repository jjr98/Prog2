package de.fhws.roemischj.Prog2.klausuruebungen.b;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IbanTest {

	@Test
	void testIbanCheck() {
		try {
			assertTrue(IBAN.ibanCheck("DE12345678901234567890"));
			IBAN.ibanCheck("D01234567890123456789");
		} catch (Exception e) {
			assertEquals(FalscheIBANException.class, e.getClass());
		}
	}

}
