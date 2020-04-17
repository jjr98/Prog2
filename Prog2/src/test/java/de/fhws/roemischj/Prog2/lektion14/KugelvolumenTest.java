package de.fhws.roemischj.Prog2.lektion14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.fhws.roemischj.Prog2.lektion14.Kugelvolumen;

class KugelvolumenTest {

	@Test
	void berechneKugelvolumenTestSuccess() {
		assertEquals(0, Kugelvolumen.berechneKugelvolumen(0));
		assertEquals(4.18879, Kugelvolumen.berechneKugelvolumen(1), 0.001);
		assertEquals(523.599, Kugelvolumen.berechneKugelvolumen(5), 0.001);
	}
	
	@Test
	void berechneKugelvolumenTestFailure() {
		try {
			Kugelvolumen.berechneKugelvolumen(-1);
			fail("IllegalArgumentException erwartet");
		} catch (Exception e) {
			assertEquals("Radius darf nicht negativ sein.", e.getMessage());
		}
	}
}