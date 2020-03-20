package de.fhws.roemischj.Prog2.lektion1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPersonKonstruktorSuccess() {
		Person p = new Person("Max", "Mustermann", "MusterstraÃŸe", "1a", 12345, "Musterstadt");
		assertEquals("Musterstadt", p.adresse.ort);
	}
	
	@Test
	void testPersonInvalidVorname() {
		try{
			Person p = new Person("max", "Mustermann", "MusterstraÃŸe", "1a", 12345, "Musterstadt");
			fail("RuntimeException expected");
		}
		catch(RuntimeException e){
			assertEquals("Vorname muss mit GroÃŸbuchstabe beginnen", e.getMessage());
		}
	}

	@Test
	void testPersonInvalidStrasse() {
		try{
			Person p = new Person("Max", "Mustermann", "musterstraÃŸe", "1a", 12345, "Musterstadt");
			fail("RuntimeException expected");
		}
		catch(RuntimeException e){
			assertEquals("StraÃŸe muss mit GroÃŸbuchstabe beginnen", e.getMessage());
		}
	}
	
	@Test
	void testPersonInvalidOrt() {
		try{
			Person p = new Person("Max", "Mustermann", "MusterstraÃŸe", "1a", 12345, "musterstadt");
			fail("RuntimeException expected");
		}
		catch(RuntimeException e){
			assertEquals("Ort muss mit GroÃŸbuchstabe beginnen", e.getMessage());
		}
	}

	@Test
	void testPersonInvalidHausnummer() {
		try{
			Person p = new Person("Max", "Mustermann", "MusterstraÃŸe", "a1", 12345, "Musterstadt");
			fail("RuntimeException expected");
		}
		catch(RuntimeException e){
			assertEquals("Hausnummer muss mit Ziffer beginnen", e.getMessage());
		}
	}
}
