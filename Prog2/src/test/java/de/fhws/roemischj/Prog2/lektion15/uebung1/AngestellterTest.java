package de.fhws.roemischj.Prog2.lektion15.uebung1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.fhws.roemischj.Prog2.lektion15.uebung1.Abteilungsleiter;
import de.fhws.roemischj.Prog2.lektion15.uebung1.Angestellter;

import java.util.*;

class AngestellterTest {

	@Test
	void testAngestellter() {
		Angestellter a = new Angestellter("Max", "Mustermann", 2500, new Date(1980, 1, 1));
		assertEquals(2500, a.berechneGehalt());
	}
	
	@Test
	void testAbteilungsleiter() {
		Abteilungsleiter b = new Abteilungsleiter("John", "Doe", 2500, new Date(1970, 1, 1));
		assertEquals(5000, b.berechneGehalt());
	}
	
	@Test
	void testBefoerdern() {
		Angestellter a = new Angestellter("Max", "Mustermann", 2500, new Date(1980, 1, 1));
		Abteilungsleiter b = new Abteilungsleiter("John", "Doe", 2500, new Date(1970, 1, 1));
		b.befoerdern(a);
		assertEquals(1.1, a.gehaltsfaktor);
		assertEquals(2750, a.berechneGehalt());
	}

}
