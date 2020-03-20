package de.fhws.roemischj.Prog2.lektion1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StreckeTest {

	@Test
	void testStreckeKonstruktor() {
		Strecke s = new Strecke(2,7);
		assertEquals(2, s.a);
		assertEquals(7, s.b);
		
		s = new Strecke(7,2);
		assertEquals(2, s.a);
		assertEquals(7, s.b);
	}
	
	@Test
	void pruefeUeberschneidungTestFalse() {
		Strecke s1 = new Strecke(0,5);
		Strecke s2 = new Strecke(6,7);
		assertFalse(Strecke.pruefeUeberschneidung(s1, s2));
		assertFalse(Strecke.pruefeUeberschneidung(s2, s1));
		
		s1 = new Strecke(0,5);
		s2 = new Strecke(7,5);
		assertFalse(Strecke.pruefeUeberschneidung(s1, s2));
		assertFalse(Strecke.pruefeUeberschneidung(s2, s1));
	}
	
	@Test
	void StreckePruefeUeberschneidungTestTrue() {
		Strecke s1 = new Strecke(0,5);
		Strecke s2 = new Strecke(2,7);
		assertTrue(Strecke.pruefeUeberschneidung(s1, s2));
		assertTrue(Strecke.pruefeUeberschneidung(s2, s1));
		
		s1 = new Strecke(0,5);
		s2 = new Strecke(2,4);
		assertTrue(Strecke.pruefeUeberschneidung(s1, s2));
		assertTrue(Strecke.pruefeUeberschneidung(s2, s1));
	}
	
	@Test
	void StreckeToStringTest() {
		Strecke s = new Strecke(5,3);
		assertEquals("3--5", s.toString());
		s = new Strecke(2,8);
		assertEquals("2------8", s.toString());
		s = new Strecke(4,4);
		assertEquals("4", s.toString());
	}
}
