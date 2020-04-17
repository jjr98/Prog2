package de.fhws.roemischj.Prog2.lektion16.uebung1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.fhws.roemischj.Prog2.lektion16.uebung1.Brett;

class BrettTest {

	@Test
	void test() {
		Brett brett1 = new Brett();
		Brett brett2 = new Brett();
		
		brett1.markiereFeld(1, 1);
		brett1.markiereFeld(2, 5);
		brett2.markiereFeld(8, 4);
		brett2.markiereFeld(5, 6);
		
		Brett brett12 = brett1.kombiniere(brett2);
		assertTrue(brett12.gibFeld(1, 1));
		assertTrue(brett12.gibFeld(2, 5));
		assertTrue(brett12.gibFeld(8, 4));
		assertTrue(brett12.gibFeld(5, 6));
	}

}
