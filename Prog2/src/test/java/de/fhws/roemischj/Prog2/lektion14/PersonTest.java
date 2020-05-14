package de.fhws.roemischj.Prog2.lektion14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.fhws.roemischj.Prog2.lektion14.Person;

@SuppressWarnings("unused")
class PersonTest {

	@Test
	void testPersonKonstruktorSuccess() {
		Person p = new Person("Max", "Mustermann", "Musterstrasse", "1a", 12345, "Musterstadt");
		assertEquals("Musterstadt", p.adresse.ort);
	}
	
	@Test
	void testPersonInvalidVorname() {
		try{
			Person p = new Person("max", "Mustermann", "Musterstrasse", "1a", 12345, "Musterstadt");
			fail("RuntimeException expected");
		}
		catch(RuntimeException e){
			assertEquals("Vorname muss mit Grossbuchstabe beginnen", e.getMessage());
		}
	}

	@Test
	void testPersonInvalidStrasse() {
		try{
			Person p = new Person("Max", "Mustermann", "musterstrasse", "1a", 12345, "Musterstadt");
			fail("RuntimeException expected");
		}
		catch(RuntimeException e){
			assertEquals("Strasse muss mit Grossbuchstabe beginnen", e.getMessage());
		}
	}
	
	@Test
	void testPersonInvalidOrt() {
		try{
			Person p = new Person("Max", "Mustermann", "Musterstrasse", "1a", 12345, "musterstadt");
			fail("RuntimeException expected");
		}
		catch(RuntimeException e){
			assertEquals("Ort muss mit Grossbuchstabe beginnen", e.getMessage());
		}
	}

	@Test
	void testPersonInvalidHausnummer() {
		try{
			Person p = new Person("Max", "Mustermann", "Musterstrasse", "a1", 12345, "Musterstadt");
			fail("RuntimeException expected");
		}
		catch(RuntimeException e){
			assertEquals("Hausnummer muss mit Ziffer beginnen", e.getMessage());
		}
	}
}
