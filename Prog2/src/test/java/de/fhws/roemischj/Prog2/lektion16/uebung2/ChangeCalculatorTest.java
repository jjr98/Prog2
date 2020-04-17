package de.fhws.roemischj.Prog2.lektion16.uebung2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.fhws.roemischj.Prog2.lektion16.uebung2.MyChangeCalculator;

class ChangeCalculatorTest {

	@Test
	void getChangeTest() {
		MyChangeCalculator cc = new MyChangeCalculator();
		assertArrayEquals(new int[]{1,0,1,0,1,1,1,1}, cc.getChange(3, 76));
		assertArrayEquals(new int[]{0,2,1,0,2,0,1,2}, cc.getChange(5, 49));
	}

}
