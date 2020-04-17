package de.fhws.roemischj.Prog2.lektion16.uebung3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.fhws.roemischj.Prog2.lektion16.uebung3.StackImpl;

class StackTest {

	@Test
	void stackTest() {
		StackImpl s = new StackImpl();
		s.push("1");
		s.push(2);
		s.push('3');
		assertEquals('3', s.pop());
		assertEquals(2, s.pop());
		assertEquals("1", s.pop());
	}
}
