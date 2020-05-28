package de.fhws.roemischj.Prog2.lektion21.uebung3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaerbaumTest {

	@Test
	void test() {
		Binaerbaum<String> baum = new Binaerbaum<String>();
		baum.insert("Cool");
		baum.insert("Aaronson");
		baum.insert("Zylla");
		baum.insert("Garret");		
		
		baum.print();
	}
}
