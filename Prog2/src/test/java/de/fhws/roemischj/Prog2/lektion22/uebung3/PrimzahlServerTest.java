package de.fhws.roemischj.Prog2.lektion22.uebung3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PrimzahlServerTest {

	@Test
	void test() {
		PrimzahlClient c1 = new PrimzahlClient(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
		PrimzahlClient c2 = new PrimzahlClient(new ArrayList<Integer>(Arrays.asList(11,12,13,14,15,16,17,18,19,20)));
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
		
	}

}
