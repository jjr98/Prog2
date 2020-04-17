package de.fhws.roemischj.Prog2.lektion16.uebung4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.fhws.roemischj.Prog2.lektion16.uebung4.Entscheidung;
import de.fhws.roemischj.Prog2.lektion16.uebung4.Gefahr;
import de.fhws.roemischj.Prog2.lektion16.uebung4.Mensch;
import de.fhws.roemischj.Prog2.lektion16.uebung4.Roboter;

class EntscheidungTest {

	@Test
	void entscheideTest() {
		Mensch m = new Mensch();
		assertTrue(Entscheidung.LINKS == m.entscheide(Gefahr.GEFAHR_RECHTS) || Entscheidung.UNENTSCHIEDEN== m.entscheide(Gefahr.GEFAHR_RECHTS));
		Roboter r = new Roboter();
		assertEquals(Entscheidung.BREMSEN, r.entscheide(Gefahr.GEFAHR_VORNE));
		
	}

}
