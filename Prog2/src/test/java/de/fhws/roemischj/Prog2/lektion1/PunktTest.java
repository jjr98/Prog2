package de.fhws.roemischj.Prog2.lektion1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PunktTest {

	@Test
	void verschiebePunktTestSuccess() {
		Punkt p = new Punkt();
		p.verschiebePunkt(500, 1000);
		assertEquals(500, p.x);
		assertEquals(1000, p.y);
	}

	@Test
	void verschiebePunktTestInvalidValueX() {
		Punkt p = new Punkt();
		try {
			p.verschiebePunkt(2000, 0);
			fail("RuntimeException expected");
		} catch (Exception e) {
			assertEquals("Ungueltige x-Koordinate", e.getMessage());
		}
	}
	
	@Test
	void verschiebePunktTestInvalidValueY() {
		Punkt p = new Punkt();
		try {
			p.verschiebePunkt(0, 1300);
			fail("RuntimeException expected");
		} catch (Exception e) {
			assertEquals("Ungueltige y-Koordinate", e.getMessage());
		}
	}
	
	@Test
	void verschiebePunktTestNegativeValues() {
		Punkt p = new Punkt();
		try {
			p.verschiebePunkt(-10, 0);
			fail("RuntimeException expected");
		} catch (Exception e) {
			assertEquals("Koordinaten duerfen nicht negativ sein", e.getMessage());
		}
		
		try {
			p.verschiebePunkt(0, -10);
			fail("RuntimeException expected");
		} catch (Exception e) {
			assertEquals("Koordinaten duerfen nicht negativ sein", e.getMessage());
		}
	}
}
